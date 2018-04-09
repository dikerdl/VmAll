package com.icode.jiling.vmall.interfaces;

import com.icode.jiling.vmall.viewmodel.AnimFan;
import com.icode.jiling.vmall.viewmodel.AnimLive;

/**
 * Created by jiling on 2018/4/9.
 */

public interface LiveCallBack {
    void onSuccess(AnimLive response);

    void onFail(String errInfo);

    void onComplete(String doine);
}
