package com.icode.jiling.vmall;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 启动页
 * ted by jiling on 2018/4/8.
 */

public class VmSplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SimpleDraweeView mGuideSdv = findViewById(R.id.sdv_guide);
        final Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            @Override
            public void run() {
                try{
                    runOnUiThread(() -> {
                        DraweeController mDraweeController = Fresco.newDraweeControllerBuilder()
                                .setAutoPlayAnimations(true)
                                .setUri(Uri.parse("res://"+getPackageName()+"/"+R.drawable.guide))
                                .build();
                        mGuideSdv.setController(mDraweeController);
                        new Handler().postDelayed(() -> {
                            startActivity(new Intent(VmSplashActivity.this,MainActivity.class));
                            finish();
                            overridePendingTransition(R.anim.fade_in,0);
                        },3000);
                    });

                }catch (Exception e){
                    timer.cancel();
                }
            }
        };
        timer.schedule(task,1500);
    }
}
