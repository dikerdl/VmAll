package com.icode.jiling.vmall.fragment.home;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.icode.jiling.vmall.BR;
import com.icode.jiling.vmall.R;
import com.icode.jiling.vmall.adapter.BannerAdapter;
import com.icode.jiling.vmall.adapter.MyRecAdapter;
import com.icode.jiling.vmall.databinding.ItemRecAnimBannerBinding;
import com.icode.jiling.vmall.interfaces.BannerCallBack;
import com.icode.jiling.vmall.viewmodel.BannerItemBean;
import com.icode.jiling.vmall.viewmodel.BannerModel;
import com.icode.jiling.vmall.viewmodel.DataBean;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * 动画-推荐
 */
public class AnimRecFragment extends Fragment {

    private static final String TAG = "AnimRecFragment";

    private SwipeRefreshLayout mSwipeLayout;

    private RecyclerView mRecRecyclerView;

    private ViewPager mBannerViewPager;

    private LinearLayout mDotsLayout;

    private List<BannerItemBean> mBannerLists;

    private MyRecAdapter myRecAdapter;

    private BannerAdapter mBannerAdapter;

    private View view;

    private List<DataBean> mRecLists;

    private boolean mIsLoadingMore = false;

    private Handler bannerHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            if(mBannerAdapter != null && msg.what == 0x160) {
                mBannerAdapter.notifyDataSetChanged();
                if (mBannerAdapter.getCount() > 1) { // 多于1个，才循环
                    int index = mBannerViewPager.getCurrentItem();
                    if(index != -1) {
                        index = (index + 1) % mBannerAdapter.getCount();
                        mBannerViewPager.setCurrentItem(index, true);
                        Message message = new Message();
                        message.obj = 1;
                        message.what = 0x160;
                        bannerHandler.sendMessageDelayed(message, 2500);
                    }
                }
            }
            return true;
        }
    });


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view == null) {
            view = inflater.inflate(R.layout.view_anim_rec, container, false);
            initView(view);
        }
        return view;
    }

    private void initView(View view) {
        mSwipeLayout = view.findViewById(R.id.swipe_rec);
        mSwipeLayout.setColorSchemeColors(getResources().getColor(R.color.colorAccent));

        mRecRecyclerView = view.findViewById(R.id.rc_rec_list);
        mRecRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        mBannerViewPager = view.findViewById(R.id.vp_banner);

        mDotsLayout= view.findViewById(R.id.ll_indicator_dot);

        mRecLists = new ArrayList<>();
        mBannerLists = new ArrayList();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mSwipeLayout.setRefreshing(true);
        initEvent();
        initData();
        setAdapter();

    }

    private void setAdapter() {
        myRecAdapter = new MyRecAdapter(getContext(),mRecLists,R.layout.rec_list_item, BR.recBean);
        mBannerAdapter = new BannerAdapter(mBannerLists,R.layout.item_rec_anim_banner, BR.banner);
        mBannerViewPager.setAdapter(mBannerAdapter);
        mRecRecyclerView.setAdapter(myRecAdapter);

    }

    private void initData() {
        BannerModel.getBannerData(System.currentTimeMillis()+"",new BannerCallBack() {
            @Override
            public void onSuccess(BannerModel response) {
                if(mSwipeLayout.isRefreshing()) {
                    mSwipeLayout.setRefreshing(false);
                    mRecLists.clear();
                }
                try {
                    if (response != null) {
                        List<DataBean>  dataBeanList = response.getData();
                        if(dataBeanList.get(0).getBanner_item() != null && !dataBeanList.get(0).getBanner_item().isEmpty()){
                            if(mBannerLists.isEmpty()) {
                                view.findViewById(R.id.fl_banner).setVisibility(View.VISIBLE);
                                mBannerLists.addAll(dataBeanList.get(0).getBanner_item());
                                setBannerImgs();
                                mBannerAdapter.notifyDataSetChanged();
                            }
                            dataBeanList.remove(0);
                        }
                        if(!mRecLists.isEmpty()){
                            view.findViewById(R.id.fl_banner).setVisibility(View.VISIBLE);
                            mRecLists.addAll(dataBeanList);
                            new ArrayList(new TreeSet(mRecLists));
                            //防止上拉加载更多刷新适配器时闪烁抖动
                            for (int i = 0; i < dataBeanList.size(); i++) {
                                myRecAdapter.notifyItemInserted(myRecAdapter.getItemCount()+i);
                            }
                        }else {
                            mRecLists.addAll(dataBeanList);
                            myRecAdapter.notifyDataSetChanged();
                        }
                    }
                }catch (Exception e){
                    Log.e(TAG,"error: "+e.getMessage());
                }
            }

            @Override
            public void onFail(String e) {
            }
        });
    }


    private void initEvent() {
        mBannerViewPager.setOnTouchListener((v, event) -> {
            mBannerViewPager.getParent().requestDisallowInterceptTouchEvent(true);
            if (mSwipeLayout.isRefreshing()  || mIsLoadingMore) {
                return true;
            } else {
                return false;
            }
        });
        mBannerViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < mDotsLayout.getChildCount(); i++) {
                    ImageView child = (ImageView) mDotsLayout.getChildAt(i);
                    if(position == i){
                        child.setImageResource(R.drawable.banner_selected_shape);
                    }else{
                        child.setImageResource(R.drawable.banner_inditor_shape);
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mSwipeLayout.setOnRefreshListener(() -> {
            mSwipeLayout.setRefreshing(true);
            initData();
        });
        mRecRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                int lastItemPosition = 0;
                if (layoutManager instanceof GridLayoutManager) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                    //获取最后一个可见view的位置
                    lastItemPosition = gridLayoutManager.findLastVisibleItemPosition();
                }
                if(newState == RecyclerView.SCROLL_STATE_DRAGGING){
                    int totalItemCount  = layoutManager.getItemCount();
                    int lastVisibleItem = lastItemPosition;
                    if(lastVisibleItem >= totalItemCount-1 && !mSwipeLayout.isRefreshing()){
                        mIsLoadingMore = true;
                        initData();
                    }
                }
                if(newState == RecyclerView.SCROLL_STATE_IDLE){
                    Fresco.getImagePipeline().resume();
                }else{
                    Fresco.getImagePipeline().pause();
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }
    private void setBannerImgs() {
        if(!mBannerLists.isEmpty()){
            if(mDotsLayout!= null && mDotsLayout.getChildCount() > 0){
                mDotsLayout.removeAllViews();
            }
            for (int i=0;i<mBannerLists.size();i++) {
                ImageView imageView = new ImageView(getContext());
                if(i == 0) {
                    imageView.setImageResource(R.drawable.banner_selected_shape);
                }else{
                    imageView.setImageResource(R.drawable.banner_inditor_shape);
                }
                imageView.setPadding(5,0,5,0);
                mDotsLayout.addView(imageView);
            }
            Message message = new Message();
            message.obj = 1;
            message.what = 0x160;
            bannerHandler.sendMessageDelayed(message,2500);
        }
    }


    public static Fragment newInstance() {
        return new AnimRecFragment();
    }

    public void setRecFresh(String s) {
        if(!mRecLists.isEmpty()) {
            for (DataBean dataBean : mRecLists) {
                if(dataBean.getTname().contains(s)) {
                    dataBean.setTname(s);
                }
            }
        }
    }
}
