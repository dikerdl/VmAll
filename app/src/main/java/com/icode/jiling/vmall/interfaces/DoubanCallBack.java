package com.icode.jiling.vmall.interfaces;

import com.icode.jiling.vmall.viewmodel.BannerModel;
import com.icode.jiling.vmall.viewmodel.DoubanSubject;

/**
 * Created by jiling on 2018/4/9.
 */

public interface DoubanCallBack {
    void onSuccess(DoubanSubject response);

    void onFail(String errInfo);
}
