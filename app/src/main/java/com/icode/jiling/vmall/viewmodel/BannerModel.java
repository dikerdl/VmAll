package com.icode.jiling.vmall.viewmodel;

import com.google.gson.Gson;
import com.icode.jiling.vmall.constant.Contants;
import com.icode.jiling.vmall.http.HttpApiService;
import com.icode.jiling.vmall.interfaces.BannerCallBack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
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

    private int code;
    private String message;
    private int ttl;
    private List<DataBean> data;

    public static void getBannerData(String timeStamp, BannerCallBack callBack){
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();
        Retrofit  retrofit = new Retrofit.Builder()
                .baseUrl(Contants.RECOMMEND)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        HttpApiService bannerService = retrofit.create(HttpApiService.class);
        Observable<BannerModel> bannerObservable = bannerService.getBannerService(timeStamp);
        bannerObservable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BannerModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BannerModel bannerModel) {
                        callBack.onSuccess(bannerModel);
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }
}
