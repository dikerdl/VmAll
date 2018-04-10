package com.icode.jiling.vmall.adapter;

import android.databinding.BindingAdapter;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeController;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.icode.jiling.vmall.VmApplication;

public class VmImgLoader {
    @BindingAdapter("android:dynamic_url")
    public static void setDynamicImgUrl(SimpleDraweeView imageView, String uri) {
        if (!TextUtils.isEmpty(uri)) {
            DraweeController mDraweeController = Fresco.newDraweeControllerBuilder()
                    .setAutoPlayAnimations(true)
                    .setUri(uri)
                    .build();
            imageView.setController(mDraweeController);
        }
    }

    @BindingAdapter(value = {"android:image_url","android:zip_able"}, requireAll = false)
    public static void setImgUrl(SimpleDraweeView imageView, String uri,boolean zip) {
        if(zip){
            try {
                imageView.setController(getZipController(imageView,uri));
            }catch (Exception e){
                Toast.makeText(VmApplication.newInstance().getBaseContext(), "zip fail:"+e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }else {
            imageView.setImageURI(uri);
        }
    }

    private static DraweeController getZipController(SimpleDraweeView imageView, String uri) {
        /*//缩放,在解码前修改内存中的图片大小, 配合Downsampling可以处理所有图片,否则只能处理jpg,
                        // 开启Downsampling:在初始化时设置.setDownsampleEnabled(true)
                        .setProgressiveRenderingEnabled(true)//支持图片渐进式加载
                        .setAutoRotateEnabled(true) //如果图片是侧着,可以自动旋转*/
        ImageRequest request =
                ImageRequestBuilder.newBuilderWithSource(Uri.parse(uri))
                        .setResizeOptions(new ResizeOptions(400, 300))
                        .build();
        return  Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .setOldController(imageView.getController())
                .build();
    }

    @BindingAdapter(value = {"uri", "placeholderImageRes", "request_width","request_height"}, requireAll = false)
    public static void loadImage(final ImageView imageView, String uri,
                                 @DrawableRes int placeholderImageRes,
                                 int width, int height){
    }

    public static ImagePipelineConfig getImageConfig() {
        ImagePipelineConfig config = ImagePipelineConfig.newBuilder(VmApplication.newInstance().getBaseContext())
                .setDownsampleEnabled(true)
                .build();
        return config;
    }
}