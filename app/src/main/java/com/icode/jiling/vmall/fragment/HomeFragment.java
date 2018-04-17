package com.icode.jiling.vmall.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flyco.tablayout.SlidingTabLayout;
import com.icode.jiling.vmall.R;
import com.icode.jiling.vmall.adapter.AnimPagerAdapter;
import com.icode.jiling.vmall.databinding.HomeBinding;
import com.icode.jiling.vmall.fragment.home.AnimFanFragment;
import com.icode.jiling.vmall.fragment.home.AnimLiveFragment;
import com.icode.jiling.vmall.fragment.home.AnimRecFragment;
import com.icode.jiling.vmall.viewmodel.DataBean;
import com.icode.jiling.vmlibrary.handler.VmHandler;

import java.util.ArrayList;


/**
 * 首页
 */
public class HomeFragment extends Fragment {

    private static HomeFragment homeFragment;

    private SwipeRefreshLayout mSwipeLayout;

    private ViewPager mBanner;

    private SlidingTabLayout mTabLayout;

    private ViewPager mAnimViewPager;

    private ArrayList<Fragment> aList;

    private View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view == null) {
            view = inflater.inflate(R.layout.fragment_home, container, false);
            initView();
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initEvent();
    }


    private void initEvent() {
        LayoutInflater li = this.getLayoutInflater();
        aList = new ArrayList<>();
        ArrayList<String> listTitles = new ArrayList<>();
        aList.add(AnimRecFragment.newInstance());
        aList.add(AnimFanFragment.newInstance());
        aList.add(AnimLiveFragment.newInstance());

        listTitles.add("推荐");
        listTitles.add("番剧");
        listTitles.add("直播");

        mAnimViewPager.setAdapter(new AnimPagerAdapter(getChildFragmentManager(),aList,listTitles));
        mTabLayout.setViewPager(mAnimViewPager);
    }

    private void initView() {
        mAnimViewPager = view.findViewById(R.id.vp_anim);
        mTabLayout = view.findViewById(R.id.top_navi);

        HomeBinding homeBinding = DataBindingUtil.bind(view);
        homeBinding.setBannerHandler(new VmHandler());

        homeBinding.etAnimFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!TextUtils.isEmpty(s.toString().trim())){
                    if(aList.get(0) != null){
                        AnimRecFragment recAnim = (AnimRecFragment) aList.get(0);
                        recAnim.setRecFresh(s.toString().trim());
                    }
                }
            }
        });
    }

    public static HomeFragment newInstance(){
        if(homeFragment == null){
            homeFragment = new HomeFragment();
        }
        return homeFragment;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
