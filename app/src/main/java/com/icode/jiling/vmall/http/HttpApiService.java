package com.icode.jiling.vmall.http;


import com.alibaba.fastjson.JSONObject;
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

  @GET
  Observable<String> getBannerService(@Query("ts") String timeStamp);
}
