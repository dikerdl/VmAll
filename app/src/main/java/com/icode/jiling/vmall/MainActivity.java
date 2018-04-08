package com.icode.jiling.vmall;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.icode.jiling.vmall.fragment.HomeFragment;
import com.icode.jiling.vmall.fragment.NewsFragment;

public class MainActivity extends AppCompatActivity {

    private FrameLayout mContainer;

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
            switch (checkedId) {
                case R.id.rb_home:
                    if (mHomeFragment == null) {
                        mHomeFragment = HomeFragment.newInstance();
                    }
                    mFt.replace(R.id.fl_content, mHomeFragment);
                    break;
                case R.id.rb_new:
                    if (mNewsFragment == null) {
                        mNewsFragment = NewsFragment.newInstance();
                    }
                    mFt.replace(R.id.fl_content, mNewsFragment);
                    break;
                case R.id.rb_msg:

                    break;
                case R.id.rb_me:

                    break;
            }
            mFt.commit();
        });
    }

    private void initView() {
        mContainer = findViewById(R.id.fl_content);
        mNaviBottom = findViewById(R.id.rg_navi);
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mTransaction = mFragmentManager.beginTransaction();
        mHomeFragment = HomeFragment.newInstance();
        mTransaction.add(R.id.fl_content, mHomeFragment);
        mTransaction.commit();
    }

}
