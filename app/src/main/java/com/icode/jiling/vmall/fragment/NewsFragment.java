package com.icode.jiling.vmall.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
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
import com.icode.jiling.vmall.fragment.news.DoubanVideoFragment;

import java.util.ArrayList;


/**
 * 首页
 */
public class NewsFragment extends Fragment {

    private static NewsFragment newsFragment;

    private SwipeRefreshLayout mSwipeLayout;

    private ViewPager mBanner;

    private SlidingTabLayout mTabLayout;

    private ViewPager mAnimViewPager;

    private View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view == null) {
            view = inflater.inflate(R.layout.fragment_news, container, false);
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
        ArrayList<Fragment> aList = new ArrayList<>();
        ArrayList<String> listTitles = new ArrayList<>();
        aList.add(DoubanVideoFragment.newInstance());
        aList.add(DoubanVideoFragment.newInstance());
        aList.add(DoubanVideoFragment.newInstance());
        aList.add(DoubanVideoFragment.newInstance());
        aList.add(DoubanVideoFragment.newInstance());
        aList.add(DoubanVideoFragment.newInstance());
        aList.add(DoubanVideoFragment.newInstance());

        listTitles.add("豆瓣");
        listTitles.add("热点");
        listTitles.add("新闻");
        listTitles.add("军事");
        listTitles.add("国际");
        listTitles.add("娱乐");
        listTitles.add("体育");


        mAnimViewPager.setAdapter(new AnimPagerAdapter(getChildFragmentManager(),aList,listTitles));
        mTabLayout.setViewPager(mAnimViewPager);
    }

    private void initView() {
        mAnimViewPager = view.findViewById(R.id.vp_news);
        mTabLayout = view.findViewById(R.id.top_navi_news);
    }

    public static NewsFragment newInstance(){
        if(newsFragment == null){
            newsFragment = new NewsFragment();
        }
        return newsFragment;
    }
}
