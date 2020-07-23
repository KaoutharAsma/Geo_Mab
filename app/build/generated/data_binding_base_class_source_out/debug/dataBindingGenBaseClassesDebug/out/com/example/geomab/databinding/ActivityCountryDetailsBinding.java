package com.example.geomab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.denzcoskun.imageslider.ImageSlider;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.lang.Deprecated;
import java.lang.Object;
import net.expandable.ExpandableTextView;

public abstract class ActivityCountryDetailsBinding extends ViewDataBinding {
  @NonNull
  public final TextView capital;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final TextView content;

  @NonNull
  public final TextView content1;

  @NonNull
  public final TextView content3;

  @NonNull
  public final TextView countryName;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView date1;

  @NonNull
  public final TextView date3;

  @NonNull
  public final TextView description;

  @NonNull
  public final ImageView drapeau;

  @NonNull
  public final ImageView expand;

  @NonNull
  public final TextView ge;

  @NonNull
  public final ExpandableTextView history;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView name1;

  @NonNull
  public final TextView name3;

  @NonNull
  public final TextView perso;

  @NonNull
  public final ImageView play;

  @NonNull
  public final TextView population;

  @NonNull
  public final TextView ressources;

  @NonNull
  public final ImageSlider slider;

  @NonNull
  public final TextView surface;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final ImageView userPhoto;

  @NonNull
  public final ImageView userPhoto1;

  @NonNull
  public final ImageView userPhoto3;

  @NonNull
  public final VideoView videoView1;

  @NonNull
  public final ImageView wikiBtn;

  @NonNull
  public final YouTubePlayerView youtubeVedio;

  protected ActivityCountryDetailsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView capital, CardView cardView, CardView cardView2,
      ConstraintLayout constraintLayout, TextView content, TextView content1, TextView content3,
      TextView countryName, TextView date, TextView date1, TextView date3, TextView description,
      ImageView drapeau, ImageView expand, TextView ge, ExpandableTextView history, TextView name,
      TextView name1, TextView name3, TextView perso, ImageView play, TextView population,
      TextView ressources, ImageSlider slider, TextView surface, TextView textView11,
      TextView textView12, TextView textView14, TextView textView3, TextView textView4,
      TextView textView5, TextView textView9, ImageView userPhoto, ImageView userPhoto1,
      ImageView userPhoto3, VideoView videoView1, ImageView wikiBtn,
      YouTubePlayerView youtubeVedio) {
    super(_bindingComponent, _root, _localFieldCount);
    this.capital = capital;
    this.cardView = cardView;
    this.cardView2 = cardView2;
    this.constraintLayout = constraintLayout;
    this.content = content;
    this.content1 = content1;
    this.content3 = content3;
    this.countryName = countryName;
    this.date = date;
    this.date1 = date1;
    this.date3 = date3;
    this.description = description;
    this.drapeau = drapeau;
    this.expand = expand;
    this.ge = ge;
    this.history = history;
    this.name = name;
    this.name1 = name1;
    this.name3 = name3;
    this.perso = perso;
    this.play = play;
    this.population = population;
    this.ressources = ressources;
    this.slider = slider;
    this.surface = surface;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView14 = textView14;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView9 = textView9;
    this.userPhoto = userPhoto;
    this.userPhoto1 = userPhoto1;
    this.userPhoto3 = userPhoto3;
    this.videoView1 = videoView1;
    this.wikiBtn = wikiBtn;
    this.youtubeVedio = youtubeVedio;
  }

  @NonNull
  public static ActivityCountryDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_country_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCountryDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCountryDetailsBinding>inflateInternal(inflater, com.example.geomab.R.layout.activity_country_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCountryDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_country_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCountryDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCountryDetailsBinding>inflateInternal(inflater, com.example.geomab.R.layout.activity_country_details, null, false, component);
  }

  public static ActivityCountryDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityCountryDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCountryDetailsBinding)bind(component, view, com.example.geomab.R.layout.activity_country_details);
  }
}
