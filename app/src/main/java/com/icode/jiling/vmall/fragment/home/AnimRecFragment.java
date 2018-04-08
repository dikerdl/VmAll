package com.icode.jiling.vmall.fragment.home;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.icode.jiling.vmall.R;
import com.icode.jiling.vmall.viewmodel.BannerModel;
import com.icode.jiling.vmlibrary.net.NetStringCallBack;


/**
 * 动画-推荐
 */
public class AnimRecFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_anim_rec,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initEvent();
        BannerModel.getBannerData(System.currentTimeMillis()+"",new NetStringCallBack() {
            @Override
            public void onSuccess(String response) {
                String df = response;
                String ic = "cd";
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
