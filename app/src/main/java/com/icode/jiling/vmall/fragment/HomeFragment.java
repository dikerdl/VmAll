package com.icode.jiling.vmall.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flyco.tablayout.SlidingTabLayout;
import com.icode.jiling.vmall.R;
import com.icode.jiling.vmall.adapter.AnimPagerAdapter;
import com.icode.jiling.vmall.fragment.home.AnimFanFragment;
import com.icode.jiling.vmall.fragment.home.AnimLiveFragment;
import com.icode.jiling.vmall.fragment.home.AnimRecFragment;

import java.util.ArrayList;


/**
 * 首页
 */
public class HomeFragment extends Fragment {

    private SwipeRefreshLayout mSwipeLayout;

    private ViewPager mBanner;

    private SlidingTabLayout mTabLayout;

    private ViewPager mAnimViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initEvent();
    }


    private void initEvent() {
        LayoutInflater li = this.getLayoutInflater();
        ArrayList<Fragment> aList = new ArrayList<>();
        ArrayList<String> listTitles = new ArrayList<>();
        aList.add(AnimRecFragment.newInstance());
        aList.add(AnimLiveFragment.newInstance());
        aList.add(AnimFanFragment.newInstance());

        listTitles.add("推荐");
        listTitles.add("番剧");
        listTitles.add("直播");

        mAnimViewPager.setAdapter(new AnimPagerAdapter(getChildFragmentManager(),aList,listTitles));
        mTabLayout.setViewPager(mAnimViewPager);
    }

    private void initView(View view) {
        mAnimViewPager = view.findViewById(R.id.vp_anim);
        mTabLayout = view.findViewById(R.id.top_navi);
    }

    public static HomeFragment newInstance(){
        return new HomeFragment();
    }
}
