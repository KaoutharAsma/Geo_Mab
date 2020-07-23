package com.example.geomab.ui

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.MediaController
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.denzcoskun.imageslider.models.SlideModel
import com.example.geomab.R
import com.example.geomab.data.database.AppDatabase
import com.example.geomab.data.database.SlideShowImagesItem
import com.example.geomab.data.network.*
import com.example.geomab.data.network.response.Twitter.RequestTwitter
import com.example.geomab.data.network.response.Twitter.Result
import com.example.geomab.data.network.response.Twitter.TwitterApiService
import com.example.geomab.data.network.response.vedio.VedioApiService
import com.example.geomab.data.network.response.youtube.YoutubeApiService
import com.example.geomab.databinding.ActivityCountryDetailsBinding
import com.example.geomab.ui.viewmodel.ImageViewModel
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_country_details.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.jetbrains.anko.doAsync
import java.io.IOException


class CountryDetails : AppCompatActivity() {
    lateinit var mediaPlayer: MediaPlayer
    private
lateinit var binding : ActivityCountryDetailsBinding
private lateinit var viewModel: ImageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, ImageViewModel.Factory(this.application,intent.getIntExtra("country_id",0)))
            .get(ImageViewModel::class.java)

        viewModel.images.observe(this, Observer<List<SlideShowImagesItem>> { images ->
            images?.apply {
                val imageList = ArrayList<SlideModel>()
                this.forEach {
                    imageList.add(SlideModel(it.image,it.title))
                }
                slider.setImageList(imageList)

            }
        })
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_country_details
        )
        val id = intent.getIntExtra("country_id",0)

        doAsync {
            val db = AppDatabase(this@CountryDetails)
            db.countryDao().SetSeen(id)
            Log.e("countrySeen",db.countryDao().getCountry(id).seen.toString())
        }
        val uri =  Uri.parse( intent.getStringExtra("hymne") )
        mediaPlayer = MediaPlayer.create(this,uri)
        play.setBackgroundResource(R.drawable.play)

        play.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.pause()
                play.setBackgroundResource(R.drawable.play)
            }else{
                mediaPlayer.start()
                play.setBackgroundResource(R.drawable.pause)
            }
        }

        val c_name = intent.getStringExtra("name")
        country_name.text = c_name
        capital.text = intent.getStringExtra("capital")
        population.text = intent.getStringExtra("population") + " millions "
        surface.text = intent.getStringExtra("surface") + " km²"
        description.text = intent.getStringExtra("description")
        ressources.text = intent.getStringExtra("ressources")
        perso.text = intent.getStringExtra("personnalités")
        expand.setImageResource(R.drawable.ic_expand_more_black_24dp)
        history.setOnExpandableClickListener(
            onExpand = {
                expand.setImageResource(R.drawable.expand_less)
                },
            onCollapse = {
                expand.setImageResource(R.drawable.ic_expand_more_black_24dp)
            }

                    )
        history.text =intent.getStringExtra("history")

        Picasso.get()
            .load(intent.getStringExtra("flag"))
            .into(drapeau)

        wiki_btn.setOnClickListener{
            val intent = Intent(this, Wikipedia::class.java)
            intent.putExtra("country",c_name)
            startActivity(intent)
        }


        val apiService = TwitterApiService(ConectivityInterceptorImpl(this))
        val apiNetworkDataSource = TwitterNetworkDataSource(apiService)
        var tweets:List<Result>
        GlobalScope.launch(Dispatchers.Main){
            tweets= apiNetworkDataSource.fetchTweets(RequestTwitter(c_name))?.results!!
            date.text =  tweets?.get(1)?.createdAt
            name.text = tweets?.get(1)?.user?.name
            content.text = tweets?.get(1)?.text
            Picasso.get()
                .load(tweets?.get(1)?.user?.profileImageUrl)
                .into(user_photo)

            date1.text =  tweets?.get(3)?.createdAt
            name1.text = tweets?.get(3)?.user?.name
            content1.text = tweets?.get(3)?.text
            Picasso.get()
                .load(tweets?.get(3)?.user?.profileImageUrl)
                .into(user_photo1)

            date3.text =  tweets?.get(2)?.createdAt
            name3.text = tweets?.get(2)?.user?.name
            content3.text = tweets?.get(2)?.text
            Picasso.get()
                .load(tweets?.get(2)?.user?.profileImageUrl)
                .into(user_photo3)
        }
        val mediaController = MediaController(this)

        val vedioApiService = VedioApiService(ConectivityInterceptorImpl(this))
        val vedioDataSource = VedioDataSource(vedioApiService)
        GlobalScope.launch(Dispatchers.Main){
            val vedios = vedioDataSource.fetchVedios(id)
            if (vedios != null){
                mediaController.setAnchorView(videoView1)
                videoView1.setMediaController(mediaController)
                videoView1.setVideoURI(Uri.parse(vedios?.get(0)?.vedio))
                videoView1.requestFocus()
            }
        }
        val youtubeService = YoutubeApiService(ConectivityInterceptorImpl(this))
        val youtubeNetworkDataSource = YoutubeNetworkDataSource(youtubeService)
        GlobalScope.launch(Dispatchers.Main){
                val vedio = youtubeNetworkDataSource.fetchVedio(q = c_name)
                youtubeVedio.getPlayerUiController().showFullscreenButton(false)
                youtubeVedio.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                    override fun onReady(@NonNull youTubePlayer: YouTubePlayer) {
                        val videoId = vedio?.items?.get(1)?.id?.videoId
                        if (videoId != null) {
                            youTubePlayer.cueVideo(videoId, 0f)
                        }
                    }
                })



        }
    }


}
