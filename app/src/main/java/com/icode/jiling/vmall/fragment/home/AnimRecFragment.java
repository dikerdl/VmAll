package com.icode.jiling.vmall.fragment.home;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.icode.jiling.vmall.BR;
import com.icode.jiling.vmall.R;
import com.icode.jiling.vmall.adapter.BannerAdapter;
import com.icode.jiling.vmall.adapter.MyRecAdapter;
import com.icode.jiling.vmall.adapter.ViewBindAdapter;
import com.icode.jiling.vmall.interfaces.BannerCallBack;
import com.icode.jiling.vmall.viewmodel.BannerModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 动画-推荐
 */
public class AnimRecFragment extends Fragment {

    private static final String TAG = "AnimRecFragment";

    private SwipeRefreshLayout mSwipeLayout;

    private RecyclerView mRecRecyclerView;

    private ViewPager mBannerViewPager;

    private LinearLayout mDotsLayout;

    private List<BannerModel.DataBean.BannerItemBean> mBannerLists = new ArrayList();

    private MyRecAdapter myRecAdapter;

    private BannerAdapter mBannerAdapter;

    private SimpleDraweeView mTestIcon;

    private ViewDataBinding mAnimRecBind;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_anim_rec,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mSwipeLayout = view.findViewById(R.id.swipe_rec);
        mTestIcon = view.findViewById(R.id.fz_test);
        mSwipeLayout.setColorSchemeColors(getResources().getColor(R.color.colorAccent));

        mAnimRecBind = DataBindingUtil.bind(view);

        /*
        mRecRecyclerView = view.findViewById(R.id.rc_rec_list);
        mRecRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        //myRecAdapter = new MyRecAdapter(mRecLists);
        View mBanner = getLayoutInflater().inflate(R.layout.header_banner,mRecRecyclerView,false);
        mBannerViewPager = mBanner.findViewById(R.id.vp_banner);
        mDotsLayout= mBanner.findViewById(R.id.ll_indicator_dot);
        mBannerAdapter = new BannerAdapter(mBannerLists,R.layout.item_rec_anim_banner, 0x12);
        mBannerViewPager.setAdapter(mBannerAdapter);

        //myRecAdapter.addHeaderView(mBanner);
        mRecRecyclerView.setAdapter(myRecAdapter);*/
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initEvent();
        initData();
    }

    private void initData() {
        BannerModel.getBannerData(System.currentTimeMillis()+"",new BannerCallBack() {
            @Override
            public void onSuccess(BannerModel response) {
                try {
                    if (response != null) {
                        ViewBindAdapter.setImgUrl(mTestIcon,response.getData().get(0).getBanner_item().get(0).getImage());

                        Toast.makeText(getContext(), "TAG:" + response.getData().get(3).getTitle(), Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){
                    Log.e(TAG,"error: "+e.getMessage());
                }
            }

            @Override
            public void onFail(String e) {
                String df =  e;
                String ic = "cd";
            }
        });
    }

    private void initEvent() {

    }


    public static Fragment newInstance() {
        return new AnimRecFragment();
    }
}
