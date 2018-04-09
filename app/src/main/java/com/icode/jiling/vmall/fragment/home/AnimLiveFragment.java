package com.icode.jiling.vmall.fragment.home;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.icode.jiling.vmall.R;
import com.icode.jiling.vmall.interfaces.FanCallBack;
import com.icode.jiling.vmall.interfaces.LiveCallBack;
import com.icode.jiling.vmall.viewmodel.AnimFan;
import com.icode.jiling.vmall.viewmodel.AnimLive;


/**
 * 动画-直播
 */
public class AnimLiveFragment extends Fragment {

    private static final String TAG = "AnimLiveFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_anim_live,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initEvent();
        initData();
    }

    private void initEvent() {

    }

    private void initData() {
        AnimLive.getLiveData(System.currentTimeMillis() + "", new LiveCallBack(){
            @Override
            public void onSuccess(AnimLive response) {
                try {
                    if (response != null) {
                        Toast.makeText(getContext(), "TAG:" + response.getData().getRecommend_data().getLives().size(), Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Log.e(TAG, "error: " + e.getMessage());
                }
            }

            @Override
            public void onFail(String e) {
                String df = e;
                String ic = "cd";
            }

            @Override
            public void onComplete(String doine) {

            }
        });
    }


    public static Fragment newInstance() {
        return new AnimLiveFragment();
    }
}
