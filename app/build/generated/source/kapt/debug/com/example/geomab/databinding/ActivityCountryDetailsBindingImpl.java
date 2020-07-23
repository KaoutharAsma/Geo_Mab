package com.example.geomab.databinding;
import com.example.geomab.R;
import com.example.geomab.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCountryDetailsBindingImpl extends ActivityCountryDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.country_name, 1);
        sViewsWithIds.put(R.id.drapeau, 2);
        sViewsWithIds.put(R.id.play, 3);
        sViewsWithIds.put(R.id.textView3, 4);
        sViewsWithIds.put(R.id.ge, 5);
        sViewsWithIds.put(R.id.capital, 6);
        sViewsWithIds.put(R.id.population, 7);
        sViewsWithIds.put(R.id.surface, 8);
        sViewsWithIds.put(R.id.textView9, 9);
        sViewsWithIds.put(R.id.description, 10);
        sViewsWithIds.put(R.id.slider, 11);
        sViewsWithIds.put(R.id.textView4, 12);
        sViewsWithIds.put(R.id.history, 13);
        sViewsWithIds.put(R.id.expand, 14);
        sViewsWithIds.put(R.id.cardView2, 15);
        sViewsWithIds.put(R.id.textView11, 16);
        sViewsWithIds.put(R.id.ressources, 17);
        sViewsWithIds.put(R.id.cardView, 18);
        sViewsWithIds.put(R.id.textView12, 19);
        sViewsWithIds.put(R.id.perso, 20);
        sViewsWithIds.put(R.id.textView14, 21);
        sViewsWithIds.put(R.id.videoView1, 22);
        sViewsWithIds.put(R.id.textView5, 23);
        sViewsWithIds.put(R.id.content3, 24);
        sViewsWithIds.put(R.id.user_photo3, 25);
        sViewsWithIds.put(R.id.date3, 26);
        sViewsWithIds.put(R.id.name3, 27);
        sViewsWithIds.put(R.id.content1, 28);
        sViewsWithIds.put(R.id.user_photo1, 29);
        sViewsWithIds.put(R.id.date1, 30);
        sViewsWithIds.put(R.id.name1, 31);
        sViewsWithIds.put(R.id.content, 32);
        sViewsWithIds.put(R.id.user_photo, 33);
        sViewsWithIds.put(R.id.date, 34);
        sViewsWithIds.put(R.id.name, 35);
        sViewsWithIds.put(R.id.youtubeVedio, 36);
        sViewsWithIds.put(R.id.wiki_btn, 37);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCountryDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 38, sIncludes, sViewsWithIds));
    }
    private ActivityCountryDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[18]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.TextView) bindings[5]
            , (net.expandable.ExpandableTextView) bindings[13]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[20]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[17]
            , (com.denzcoskun.imageslider.ImageSlider) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.VideoView) bindings[22]
            , (android.widget.ImageView) bindings[37]
            , (com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView) bindings[36]
            );
        this.constraintLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}