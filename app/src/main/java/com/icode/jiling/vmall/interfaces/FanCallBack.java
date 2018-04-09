package com.icode.jiling.vmall.interfaces;

import com.icode.jiling.vmall.viewmodel.AnimFan;

/**
 * Created by jiling on 2018/4/9.
 */

public interface FanCallBack {
    void onSuccess(AnimFan response);

    void onFail(String errInfo);
}
