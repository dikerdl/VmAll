package com.icode.jiling.vmall.viewmodel;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import org.json.JSONArray;

import java.io.Serializable;

/**
 * Created by jiling on 2018/4/8.
 */

public class DoubanSubject implements Serializable{
    public int start;

    public int count;

    public int total;

    public String title;

    @JSONField(name = "subjects")
    public JSONObject subjects;
}
