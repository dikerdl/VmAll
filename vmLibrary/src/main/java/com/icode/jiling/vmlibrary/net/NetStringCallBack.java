package com.icode.jiling.vmlibrary.net;

/**
 * Created by jiling on 2018/4/8.
 */

public interface NetStringCallBack {
    void onSuccess(String response);

    void onFail(String errInfo);
}
