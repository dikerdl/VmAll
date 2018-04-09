package com.icode.jiling.vmall.fragment.news;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.icode.jiling.vmall.R;
import com.icode.jiling.vmall.interfaces.BannerCallBack;
import com.icode.jiling.vmall.interfaces.DoubanCallBack;
import com.icode.jiling.vmall.viewmodel.BannerModel;
import com.icode.jiling.vmall.viewmodel.DoubanSubject;


/**
 * 动画-推荐
 */
public class DoubanVideoFragment extends Fragment {


    private static final String TAG = "DoubanVideoFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_douban_video,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initEvent();
        initData();
    }

    private void initData() {
        DoubanSubject.getDoubanData(1,28,new DoubanCallBack() {
            @Override
            public void onSuccess(DoubanSubject response) {
                try {
                    if (response != null) {
                        Toast.makeText(getContext(), "TAG:" + response.getTitle(), Toast.LENGTH_SHORT).show();
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
        return new DoubanVideoFragment();
    }
}
