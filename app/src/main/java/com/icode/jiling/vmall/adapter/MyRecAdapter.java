package com.icode.jiling.vmall.adapter;

import android.content.Context;

import java.util.List;
import java.util.Map;

/**
 * Created by jiling on 2018/4/9.
 */

public class MyRecAdapter extends CommentRecyclerAdapter {
    public MyRecAdapter(Context context, List list, Map map) {
        super(context, list, map);
    }

    public MyRecAdapter(Context context, List list, int layoutId, int variableId) {
        super(context, list, layoutId, variableId);
    }
}
