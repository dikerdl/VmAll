package com.icode.jiling.vmall;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

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
        ViewDataBinding mSplashBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash_splash);
        final Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                try {
                    runOnUiThread(() -> {
                        mSplashBinding.setVariable(BR.splash,"res://" + getPackageName() + "/" + R.drawable.guide);
                        new Handler().postDelayed(() -> {
                            startActivity(new Intent(VmSplashActivity.this, MainActivity.class));
                            finish();
                            overridePendingTransition(R.anim.fade_in, 0);
                        }, 2500);

                    });

                } catch (Exception e) {
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 1500);
    }
}
