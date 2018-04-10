package com.icode.jiling.vmlibrary.handler;

import android.view.View;
import android.widget.Toast;

/**
 *
 * Created by jiling on 2018/4/10.
 */

public class VmHandler  {

    //方法引用实现事件绑定
    public void myOnClick(View view){
        Toast.makeText(view.getContext(),"hello",Toast.LENGTH_SHORT).show();
    }
    public boolean myOnLongClick(View view){
        Toast.makeText(view.getContext(),"hello world",Toast.LENGTH_SHORT).show();
        return true;
    }

    //接口方式实现事件绑定
    public void myOnClick(View view, String name) {
        Toast.makeText(view.getContext(), "hello " + name, Toast.LENGTH_SHORT).show();
    }
}
