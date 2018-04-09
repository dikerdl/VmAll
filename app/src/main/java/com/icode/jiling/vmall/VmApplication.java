package com.icode.jiling.vmall;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.icode.jiling.vmlibrary.BaseApplication;

/**
 * Created by jiling on 2018/4/8.
 */

public class VmApplication extends BaseApplication {
    public  Context baseVmContext = getBaseContext();

    private static VmApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        application = this;
    }

    public static VmApplication newInstance(){
        return application;
    }
}
