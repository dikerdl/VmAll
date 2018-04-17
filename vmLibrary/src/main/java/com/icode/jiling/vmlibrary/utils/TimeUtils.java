package com.icode.jiling.vmlibrary.utils;

/**
 * Created by jiling on 2018/4/3.
 */

public class TimeUtils {

    public static String getTimeStr(int timecount) {
        String hour = timecount/(60*60) != 0 ? timecount/(60*60)+":" : "";
        String min = "";
        if(!"".equals(hour)){
            if(timecount/(60*60) >= 23){
                hour = 23+":";
            }
            timecount = timecount % (60*60);

            min = (int) (Math.floor(timecount / 60)) >= 10 ? (int) (Math.floor(timecount / 60)) + ""
                    : "0" + (int) (Math.floor(timecount / 60));
        }else{
            min += (int) (Math.floor(timecount / 60));
        }

        String second = timecount % 60 >= 10 ? timecount % 60 + "": "0" + timecount % 60;
        return hour + min + ":" + second;
    }

}
