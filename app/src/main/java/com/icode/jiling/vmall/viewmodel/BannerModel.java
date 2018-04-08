package com.icode.jiling.vmall.viewmodel;

import com.alibaba.fastjson.JSONObject;
import com.icode.jiling.vmall.constant.Contants;
import com.icode.jiling.vmall.http.HttpApiService;
import com.icode.jiling.vmlibrary.base.BaseResponse;
import com.icode.jiling.vmlibrary.net.NetStringCallBack;
import org.reactivestreams.Subscription;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jiling on 2018/4/8.
 */

public class BannerModel {
    private String title;
    private String uri;
    private String imgUrl;
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BannerModel{" +
                "title='" + title + '\'' +
                ", uri='" + uri + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", id=" + id +
                '}';
    }

    public static void getBannerData(String timeStamp,NetStringCallBack callBack){
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();
        Retrofit  retrofit = new Retrofit.Builder()
                .baseUrl(Contants.MOVIE)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        HttpApiService bannerService = retrofit.create(HttpApiService.class);
        io.reactivex.Observable<DoubanSubject> bannerObservable = bannerService.getMovies(1, 5);
        bannerObservable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DoubanSubject>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(DoubanSubject s) {
                        callBack.onSuccess(s.title);
                    }

                    @Override
                    public void onError(Throwable t) {
                        callBack.onFail(t.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        callBack.onFail("doine");
                    }
                });
    }

}
