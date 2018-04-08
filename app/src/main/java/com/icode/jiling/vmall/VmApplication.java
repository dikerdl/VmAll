package com.icode.jiling.vmall;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.icode.jiling.vmlibrary.BaseApplication;

/**
 * Created by jiling on 2018/4/8.
 */

public class VmApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
