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
import com.icode.jiling.vmall.viewmodel.AnimFan;


/**
 * 动画-番剧
 */
public class AnimFanFragment extends Fragment {
    private static final String TAG = "AnimFanFragment";

    private static AnimFanFragment animFanFragment;

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view == null) {
            view = inflater.inflate(R.layout.view_anim_fan, container, false);
            initView();
        }
        return view;
    }

    private void initView() {

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initEvent();
        initData();
    }

    private void initData() {
        AnimFan.getAnimFanData(System.currentTimeMillis()+"",new FanCallBack() {
            @Override
            public void onSuccess(AnimFan response) {
                try {
                    if (response != null) {
                        Toast.makeText(getContext(), "TAG:" + response.getResult().getAd().size(), Toast.LENGTH_SHORT).show();
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

    public static AnimFanFragment newInstance() {
        if(animFanFragment == null){
            animFanFragment = new AnimFanFragment();
        }
        return animFanFragment;
    }
}
