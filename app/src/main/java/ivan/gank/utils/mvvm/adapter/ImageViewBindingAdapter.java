package ivan.gank.utils.mvvm.adapter;


import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewBindingAdapter {

    @BindingAdapter("uri")
    public static void setUri(ImageView imageView, String uri) {
        Glide.with(imageView.getContext()).load(uri).into(imageView);
    }

}
