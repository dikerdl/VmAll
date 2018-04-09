package com.icode.jiling.vmall.interfaces;

import com.icode.jiling.vmall.viewmodel.BannerModel;

/**
 * Created by jiling on 2018/4/9.
 */

public interface BannerCallBack {
    void onSuccess(BannerModel response);

    void onFail(String errInfo);
}
