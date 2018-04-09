package com.icode.jiling.vmall.http;


import com.alibaba.fastjson.JSONObject;
import com.icode.jiling.vmall.viewmodel.AnimFan;
import com.icode.jiling.vmall.viewmodel.AnimLive;
import com.icode.jiling.vmall.viewmodel.BannerModel;
import com.icode.jiling.vmall.viewmodel.DoubanSubject;
import com.icode.jiling.vmlibrary.base.BaseResponse;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jiling on 2018/4/8.
 */

public interface HttpApiService {
  /**
   * 查询豆瓣排名前250的电影
   *
   * @param start 从第几部开始
   * @param count 几页(一页有12部)
   * @return
   */
  @GET("v2/movie/top250")
  Observable<DoubanSubject> getMovies(@Query("start") int start, @Query("count") int count);

  @GET("x/feed/index?appkey=c1b107428d337928&build=51900&idx=0&login_event=1&mobi_app=android&network=wifi&open_event=cold&platform=android&pull=true&style=2&sign=492b1f728fc53a74e451452aa46c3f17")
  Observable<BannerModel> getBannerService(@Query("ts") String timeStamp);

  @GET("appindex/follow_index_page?appkey=c1b107428d337928&build=51900&mobi_app=android&platform=android&sign=0f7969d86ea1de849634336fd57ebb1f")
  Observable<AnimFan> getFanService(@Query("ts") String timeStamp);

  @GET("room/v1/AppIndex/getAllList?_device=android&appkey=c1b107428d337928&build=51900&device=android&mobi_app=android&platform=android&scale=xxhdpi&src=bili&trace_id=20180403090100044&version=5.19.0.519000&sign=485401adf6fdfbd2dc8f171964128e81")
  Observable<AnimLive> getLiveService(@Query("ts") String timeStamp);

}
