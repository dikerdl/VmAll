package com.icode.jiling.vmall.fragment.home;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.icode.jiling.vmall.R;


/**
 * 动画-番剧
 */
public class AnimFanFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_anim_fan,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initEvent();
    }

    private void initEvent() {

    }

    public static Fragment newInstance() {
        return new AnimFanFragment();
    }
}
