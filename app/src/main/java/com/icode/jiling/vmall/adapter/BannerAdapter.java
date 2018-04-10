package com.icode.jiling.vmall.adapter;

import com.icode.jiling.vmall.viewmodel.BannerItemBean;
import com.icode.jiling.vmall.viewmodel.BannerModel;

import java.util.List;


public class BannerAdapter extends CommentPagerAdapter<BannerItemBean> {

    public BannerAdapter(List list, int layoutId, int variableId) {
        super(list, layoutId, variableId);
    }
}