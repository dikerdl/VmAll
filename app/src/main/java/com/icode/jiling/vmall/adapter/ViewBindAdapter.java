package com.icode.jiling.vmall.adapter;

import android.databinding.BindingAdapter;
import android.support.annotation.DrawableRes;
import android.text.TextUtils;
import android.widget.ImageView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;


public class ViewBindAdapter {
    @BindingAdapter({"dynamic_url"})
    public static void setDynamicImgUrl(SimpleDraweeView imageView, String uri) {
        if (!TextUtils.isEmpty(uri)) {
            DraweeController mDraweeController = Fresco.newDraweeControllerBuilder()
                    .setAutoPlayAnimations(true)
                    .setUri(uri)
                    .build();
            imageView.setController(mDraweeController);
        }
    }

    @BindingAdapter({"image_url"})
    public static void setImgUrl(SimpleDraweeView imageView, String uri) {
        imageView.setImageURI(uri);
    }

    @BindingAdapter(value = {"uri", "placeholderImageRes", "request_width","request_height"}, requireAll = false)
    public static void loadImage(final ImageView imageView, String uri,
                                 @DrawableRes int placeholderImageRes,
                                 int width, int height){
    }

}