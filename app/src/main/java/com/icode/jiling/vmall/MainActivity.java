package com.icode.jiling.vmall;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.icode.jiling.vmall.fragment.HomeFragment;
import com.icode.jiling.vmall.fragment.NewsFragment;
import com.icode.jiling.vmlibrary.utils.TimeUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mNaviBottom;

    private HomeFragment mHomeFragment;

    private NewsFragment mNewsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }

    private void initEvent() {
        mNaviBottom.setOnCheckedChangeListener((group, checkedId) -> {
            FragmentTransaction mFt = getSupportFragmentManager().beginTransaction();
            hideAllFragment(mFt);
            switch (checkedId) {
                case R.id.rb_home:
                    if (mHomeFragment == null) {
                        mHomeFragment = HomeFragment.newInstance();
                        mFt.add(R.id.fl_content, mHomeFragment);
                    }else {
                        mFt.show(mHomeFragment);
                    }
                    break;
                case R.id.rb_new:
                    if (mNewsFragment == null) {
                        mNewsFragment = NewsFragment.newInstance();
                        mFt.add(R.id.fl_content, mNewsFragment);
                    }else {
                        mFt.show(mNewsFragment);
                    }
                    break;
                case R.id.rb_msg:

                    break;
                case R.id.rb_me:

                    break;
            }
            mFt.commit();
        });
    }

    private void hideAllFragment(FragmentTransaction mFt) {
        if(mHomeFragment != null){
            mFt.hide(mHomeFragment);
        }
        if(mNewsFragment != null){
            mFt.hide(mNewsFragment);
        }
    }

    private void initView() {
        mNaviBottom = findViewById(R.id.rg_navi);
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mTransaction = mFragmentManager.beginTransaction();
        mHomeFragment = HomeFragment.newInstance();
        mTransaction.add(R.id.fl_content, mHomeFragment);
        mTransaction.commit();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        FragmentManager manager = getSupportFragmentManager();
        if(manager.getFragments() != null){
            manager.getFragments().clear();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if(outState != null){
            FragmentManager manager = getSupportFragmentManager();
            if(manager.getFragments() != null){
                manager.getFragments().clear();
            }
            //manager.popBackStackImmediate(null, 1);
        }else {
            super.onSaveInstanceState(outState);
        }
    }
}
