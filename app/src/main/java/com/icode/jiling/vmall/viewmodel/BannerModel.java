package com.icode.jiling.vmall.viewmodel;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
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

    /**
     * code : 0
     * data : [{"param":"0","goto":"banner","idx":1523248628,"banner_item":[{"id":51730,"title":"花钱买\u201c旧的\u201d？这很时尚！","image":"http://i0.hdslb.com/bfs/archive/01958ad3ae2269374ad6521fd09b1a750fca9b7d.jpg","hash":"51a79ccba7bd3a9028607430cb9d4f2f","uri":"https://www.bilibili.com/read/cv348911","request_id":"1523248617936","server_type":0,"resource_id":631,"index":1,"cm_mark":0},{"id":0,"title":"","image":"https://i0.hdslb.com/bfs/sycp/tmaterial/201804/f8cfb7bd93e6a2f70f9fbf97e84d04dc.jpg","hash":"69a3d612c274049e37ead07312912345","uri":"https://game.bilibili.com/fgo/event_cp1_5_1/h5","request_id":"1523248617898q172a18a61a126q104","creative_id":7175,"src_id":703,"is_ad_loc":true,"ad_cb":"CM1oEAAYhzggACgAMAM4vwVCHzE1MjMyNDg2MTc4OThxMTcyYTE4YTYxYTEyNnExMDRIqrPFxaosUgbmiJDpg71aBuWbm+W3nWIG5Lit5Zu9aAFwAXiAgICAEIABAIgB3BGSAQ4xMTguMTE0LjI0NS40NJoBOGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkoAEAqAEAsgEgHkfS80w6dWDhEviYjLwAMuWzZmgdjY6JvC1VOCp7DT26AS5odHRwczovL2dhbWUuYmlsaWJpbGkuY29tL2Znby9ldmVudF9jcDFfNV8xL2g1wgEAygEA0gEA2AEB4AEA6AEA","click_url":"https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=1012&mid=__MID__&os=__OS__&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=__IP__&request_id=__REQUESTID__&ts=__TS__&ua=__UA__","client_ip":"118.114.245.44","server_type":1,"resource_id":631,"index":2,"cm_mark":2,"extra":{"use_ad_web_v2":true,"show_urls":[],"click_urls":["https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=1012&mid=__MID__&os=__OS__&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=__IP__&request_id=__REQUESTID__&ts=__TS__&ua=__UA__"],"open_whitelist":["dianping","kaola","vipshop","ctrip","bilibili","mqq"],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/tmaterial/201804/f8cfb7bd93e6a2f70f9fbf97e84d04dc.jpg"}],"jump_url":"https://game.bilibili.com/fgo/event_cp1_5_1/h5","desc":""}}},{"id":0,"title":"","image":"https://i0.hdslb.com/bfs/sycp/tmaterial/201804/c021bfdc93dd18a1207e38dcc8497242.jpg","hash":"6e6d28fbd6cd48e4ce593427e27c09d8","uri":"bilibili://game_center/detail?id=12&sourceType=adPut","request_id":"1523248617898q172a18a61a126q104","creative_id":7199,"src_id":704,"is_ad":true,"is_ad_loc":true,"ad_cb":"CI1qEAAYnzggACgAMAM4wAVCHzE1MjMyNDg2MTc4OThxMTcyYTE4YTYxYTEyNnExMDRIqrPFxaosUgbmiJDpg71aBuWbm+W3nWIG5Lit5Zu9aAFwAXiAgICAEIABAIgB/RGSAQ4xMTguMTE0LjI0NS40NJoBOGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkoAEAqAEAsgEgEHtNtVwGyr/147dEMln9Xf/hw+sltQPmYFhSjJ1Acx+6ATRiaWxpYmlsaTovL2dhbWVfY2VudGVyL2RldGFpbD9pZD0xMiZzb3VyY2VUeXBlPWFkUHV0wgEAygEA0gEA2AEB4AEA6AEA","client_ip":"118.114.245.44","server_type":1,"resource_id":631,"index":3,"cm_mark":1,"extra":{"use_ad_web_v2":true,"show_urls":[],"click_urls":[],"open_whitelist":["dianping","kaola","vipshop","ctrip","bilibili","mqq"],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/tmaterial/201804/c021bfdc93dd18a1207e38dcc8497242.jpg"}],"jump_url":"bilibili://game_center/detail?id=12&sourceType=adPut","desc":""}}},{"id":51769,"title":"专栏0409话题-头号玩家","image":"http://i0.hdslb.com/bfs/archive/40b6b861b60b992d71e7a847a32c5a477fa7e9b1.jpg","hash":"8c892845a43313d5005e8a60808662b9","uri":"https://www.bilibili.com/read/cv364588","request_id":"1523248617936","server_type":0,"resource_id":631,"index":4,"cm_mark":0}],"hash":"4487996566101178577"},{"title":"【面侦探-筋南】面筋中毒事件","cover":"https://i0.hdslb.com/bfs/archive/98f2cab4f021e4cdaf0d82f46861c57909dfb9c2.jpg","uri":"bilibili://video/21543603","param":"21543603","goto":"av","desc":"原BGM:「名探偵コナン」~メインテーマ\n就是不做火的曲子，反正我也不火\n下一部μ's烤面筋预定","play":61018,"danmaku":773,"reply":351,"favorite":3052,"coin":3962,"share":1007,"like":3117,"idx":1523248627,"tid":126,"tname":"人力VOCALOID","dislike_reasons":[{"reason_id":4,"reason_name":"UP主:南喇嘛"},{"reason_id":2,"reason_name":"分区:人力VOCALOID"},{"reason_id":1,"reason_name":"不感兴趣"}],"ctime":1522650934,"duration":164,"mid":11022834,"name":"南喇嘛","face":"http://i2.hdslb.com/bfs/face/5f3bd76f93128ad926e27fc8030d0d3df1be4672.jpg"},{"title":"【雷安手书/凹凸世界】 Animals 【ABO剧情向】","cover":"https://i2.hdslb.com/bfs/archive/19e8864c0a2b5fac291dd64ca5fa7389d88d1772.jpg","uri":"bilibili://video/21708024","param":"21708024","goto":"av","desc":"简介: 剧情大概是这样，雷是A，安是O，第一次安的那什么期突然到来，被一群A追逐，然后被雷撞见，结果两人虽然干了些这样那样糟糕的事情但却没有彻底标记，然而安恢复清醒后非常生气，跟雷狠狠打了一架【当然某人让着某人了。但是安最终也没下去手，因为毕竟他也算救了自己，然后两人分开。\n然后第二次那什么期的时候，安想要用抑制剂解决，结果被几百米之外（虽然有点远\u2026\u2026）的雷察觉到了气息，然后，就\u2026\u2026一路杀过来，然后，就那什么了\u2026\u2026\n从 寒假开始画的分镜，都快画完了，结果发现结尾又透着一股搞笑的气息，想了想还是重画吧\u2026\u2026要","play":19383,"danmaku":453,"reply":304,"favorite":5934,"coin":1864,"share":309,"like":2400,"idx":1523248626,"tid":47,"tname":"短片·手书·配音","dislike_reasons":[{"reason_id":4,"reason_name":"UP主:柳川猫"},{"reason_id":2,"reason_name":"分区:短片·手书·配音"},{"reason_id":1,"reason_name":"不感兴趣"}],"ctime":1522976445,"duration":115,"mid":15405531,"name":"柳川猫","face":"http://i2.hdslb.com/bfs/face/8ba50ae815405e2c6e4add46be993292253c2695.jpg"},{"title":"【你的男人为你起舞】戏骨【西四 桃桃 麦麥籽 浩浩 小初】原创编舞","cover":"https://i1.hdslb.com/bfs/archive/a93edd8f047b59307ed2185364e28b00e3301fa3.jpg","uri":"bilibili://video/21621312","param":"21621312","goto":"av","desc":"创作类型: 原创编舞\n简介: 大可和洛洛的碰撞使我原地爆炸，歌都没听完就决定要编舞了。这次的合作以开心为主，放了很多梗进去，也并没有编很难，大家轻松愉快的跳一下~因为歌词唱的互怼，编舞也有很多互怼，所以大家都没有选自己的男人23333最佳戏骨颁发给我们的女主小初！\n提前祝洛洛生日快乐！\n\n李泽言：@麦子麦麥籽\n周棋洛：@皮卡浩Yanako\n白起：@桃源玖玖\n女主：@开门啦你的小初快递\n许墨：西四炸弹\n\nbgm：av20525963（感谢奶牛组授权\n摄影：猫\n后期：飘渺\n编舞&策划：西四","play":220931,"danmaku":1988,"reply":1478,"favorite":13175,"coin":17540,"share":3192,"like":9059,"idx":1523248625,"tid":20,"tname":"宅舞","dislike_reasons":[{"reason_id":4,"reason_name":"UP主:西四炸弹"},{"reason_id":2,"reason_name":"分区:宅舞"},{"reason_id":1,"reason_name":"不感兴趣"}],"ctime":1522843220,"duration":225,"mid":521444,"name":"西四炸弹","face":"http://i0.hdslb.com/bfs/face/e631666a513496dde4baf0ce3b695be5e35a77ad.jpg"},{"title":"【野】 -曼殊沙-            在脸上画个花（石）花（蒜）","cover":"https://i0.hdslb.com/bfs/archive/0f9c5a4628a02accd0d9780f53fb5ae56881b2de.png","uri":"bilibili://video/21650580","param":"21650580","goto":"av","desc":"bgm：叵测-Walker-原曲\u201cふたつの唇\r\n不好看也没办法，我不会再画第三遍了！！！\r\n石蒜（曼珠沙华）真是个接地气的名儿 \r\n百科说：如误食，可能会导致中毒，轻者呕吐、腹泻，重者可能会导致中枢神经系统麻痹，有生命危险。\r\n只可远观不可亵玩焉啊兄dei们","play":11421,"danmaku":134,"reply":137,"favorite":944,"coin":803,"share":58,"like":744,"idx":1523248624,"tid":157,"tname":"美妆","dislike_reasons":[{"reason_id":4,"reason_name":"UP主:野老板"},{"reason_id":2,"reason_name":"分区:美妆"},{"reason_id":1,"reason_name":"不感兴趣"}],"ctime":1522856469,"duration":361,"mid":1659994,"name":"野老板","face":"http://i2.hdslb.com/bfs/face/495ae65e608d5374157a3416cc6b66fdc2d6d80f.jpg"},{"title":"世界第一妖梦控 画师：さざなみみお 东方精美图包 第六期","cover":"https://i1.hdslb.com/bfs/archive/ad7cc0201c25078405708339f5058d52907e0baa.jpg","uri":"bilibili://video/21545120","param":"21545120","goto":"av","desc":"视频类型: 其他\n简介: 个人在网上收集的一些好看的东方图片\n图包链接：https://pan.baidu.com/s/1QJaT4_Rp2is8rO_vnVl8hA\n拿了图的点个关注呗(￣▽￣)~*\n画师：さざなみみお\np站id＝1092517","play":3185,"danmaku":21,"reply":108,"favorite":437,"coin":128,"share":31,"like":83,"idx":1523248623,"tid":27,"tname":"综合","dislike_reasons":[{"reason_id":4,"reason_name":"UP主:幻视yc"},{"reason_id":2,"reason_name":"分区:综合"},{"reason_id":1,"reason_name":"不感兴趣"}],"ctime":1522653057,"duration":288,"mid":7148286,"name":"幻视yc","face":"http://i0.hdslb.com/bfs/face/aa79deaab397368be74a7c78931ab95a48efbf74.jpg"},{"title":"【小和组】180401 TBS新春电视剧祭 Nino CUT","cover":"https://i0.hdslb.com/bfs/archive/b7a0512a894ab9a09d906a30d3f1ba272b3312b8.jpg","uri":"bilibili://video/21551880","param":"21551880","goto":"av","desc":"【小和组】\n「黑色止血钳」还有三周就要开播了，让我们一起跟着女主播直击拍摄现场吧。究竟是谁让二宫桑自掏腰包？各位优秀的演员都有什么感想呢？爱开玩笑的二宫桑在拍摄时又有着怎样认真的姿态，他具有压迫力的演技竟然使得小泉桑\u2026\nStaff：\n档源 多多汉堡肉\n翻译 糯米饭团 Yui 2花\n校对 春春 汐夜\n时轴 饭饭 泠瑞 小千\n轴校 凉粉\n美工 乌碳 \n压制 大宫喵 雕","play":7786,"danmaku":235,"reply":50,"favorite":352,"coin":235,"share":46,"like":171,"idx":1523248622,"tid":184,"tname":"预告 资讯","dislike_reasons":[{"reason_id":4,"reason_name":"UP主:小和财露尖尖嗓"},{"reason_id":2,"reason_name":"分区:预告 资讯"},{"reason_id":1,"reason_name":"不感兴趣"}],"ctime":1522659308,"duration":953,"mid":22191019,"name":"小和财露尖尖嗓","face":"http://i2.hdslb.com/bfs/face/f624adb51d626ac10c694a0b26174e73910db3cf.jpg"},{"title":"【我妻勇者】SNOBBISM+1Key【久违的FULL】","cover":"https://i1.hdslb.com/bfs/archive/6a6b04e762189989111279fbdab5d21bd61095f4.jpg","uri":"bilibili://video/21562136","param":"21562136","goto":"av","desc":"作品类型: 原曲翻唱\n原唱: Rin/Len\n原曲出处链接: av21088333\n作词: Neru & z'5\n作曲: Neru & z'5\n后期/混音: 我妻勇者$\n曲绘: りゅうせー\nPV: 我妻勇者$\n简介补充: 好久不见！嗷！\n这次是近几年来难得的FULL！X\n不多夸夸我嘛！不来个几百条弹幕对得起我几个晚上的后期嘛！哈！www\n其实是因为前几天通完了两部美少女万华镜！现在充满干劲！！！\n不过我相信大家听完就会明白为什么我一直不Full的原因了哈哈哈哈\n谢谢Neruさん的创作，很棒很喜欢！\n一如既","play":9602,"danmaku":134,"reply":185,"favorite":574,"coin":643,"share":80,"like":305,"idx":1523248621,"tid":31,"tname":"翻唱","dislike_reasons":[{"reason_id":4,"reason_name":"UP主:我妻勇者$"},{"reason_id":2,"reason_name":"分区:翻唱"},{"reason_id":1,"reason_name":"不感兴趣"}],"ctime":1522680758,"duration":215,"mid":364598,"name":"我妻勇者$","face":"http://i0.hdslb.com/bfs/face/16c0c6fd9fc9bcfdaa6ed330bbb07071cbbce723.jpg"},{"title":"【洛天依原创曲】绫铃 【无名社】【南北组】【原创PV付】","cover":"https://i2.hdslb.com/bfs/archive/619a7fb988ec8ed65f17f336046d358de103a4a3.jpg","uri":"bilibili://video/21582285","param":"21582285","goto":"av","desc":"作曲：无名\n调教：紫荆7x\n作词：素问\n曲绘：风铃\nPV：MONARCH\nPV已换源修复\nUTAU版联动链接：av21708730","play":2890,"danmaku":24,"reply":115,"favorite":592,"coin":231,"share":26,"like":313,"idx":1523248620,"tid":30,"tname":"VOCALOID·UTAU","dislike_reasons":[{"reason_id":4,"reason_name":"UP主:膝盖中箭的无名"},{"reason_id":2,"reason_name":"分区:VOCALOID·UTAU"},{"reason_id":1,"reason_name":"不感兴趣"}],"ctime":1522729668,"duration":233,"mid":2058936,"name":"膝盖中箭的无名","face":"http://i2.hdslb.com/bfs/face/846245558a15d832e6abbe9647d92d95c1b1931a.jpg"},{"title":"手臂灵活性不够怎么办~黄博士教你四个手臂的拉伸方法","cover":"https://i0.hdslb.com/bfs/archive/fdb777c0cfe64ca8e7ccd540b78572b47bfcda3e.jpg","uri":"bilibili://video/21641347","param":"21641347","goto":"av","desc":"手臂灵活性不够怎么办~黄博士教你四个手臂的拉伸方法","play":7502,"danmaku":56,"reply":87,"favorite":521,"coin":253,"share":28,"like":248,"idx":1523248619,"tid":164,"tname":"健身","dislike_reasons":[{"reason_id":4,"reason_name":"UP主:黄博士爱健康"},{"reason_id":2,"reason_name":"分区:健身"},{"reason_id":1,"reason_name":"不感兴趣"}],"ctime":1522844508,"duration":212,"mid":175456549,"name":"黄博士爱健康","face":"http://i1.hdslb.com/bfs/face/11c03d78e31b435a17f2400da5a1dc57637ee07f.jpg"},{"title":"【眼睛教程】六种常见眼睛厚涂教程附带讲解~不准收藏不看= -=","cover":"https://i1.hdslb.com/bfs/archive/247a21b8f6232c8ee8c763abff9ff24f79c506e4.jpg","uri":"bilibili://video/21708759","param":"21708759","goto":"av","desc":"直播通知群：475698278\n资源付费群：118234115\nbgm在视频有附加注意暂停~这里不列出了\n再次感谢字幕君一颗，辛苦啦\n以及感谢大家一年以来的支持，有问题在评论区提出哦","play":4586,"danmaku":75,"reply":88,"favorite":2102,"coin":357,"share":23,"like":609,"idx":1523248618,"tid":162,"tname":"绘画","dislike_reasons":[{"reason_id":4,"reason_name":"UP主:大份海鲜饼蛋蛋面"},{"reason_id":2,"reason_name":"分区:绘画"},{"reason_id":1,"reason_name":"不感兴趣"}],"ctime":1522989029,"duration":2529,"mid":2953749,"name":"大份海鲜饼蛋蛋面","face":"http://i1.hdslb.com/bfs/face/5a47670621e32b73ef6d718c39d464e8c06f1f62.jpg"}]
     * message : 0
     * ttl : 1
     */

    private int code;
    private String message;
    private int ttl;
    private List<DataBean> data;

    public static void getBannerData(String timeStamp, BannerCallBack callBack){
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .connectTimeout(60, TimeUnit.SECONDS)
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

    public static class DataBean {
        /**
         * param : 0
         * goto : banner
         * idx : 1523248628
         * banner_item : [{"id":51730,"title":"花钱买\u201c旧的\u201d？这很时尚！","image":"http://i0.hdslb.com/bfs/archive/01958ad3ae2269374ad6521fd09b1a750fca9b7d.jpg","hash":"51a79ccba7bd3a9028607430cb9d4f2f","uri":"https://www.bilibili.com/read/cv348911","request_id":"1523248617936","server_type":0,"resource_id":631,"index":1,"cm_mark":0},{"id":0,"title":"","image":"https://i0.hdslb.com/bfs/sycp/tmaterial/201804/f8cfb7bd93e6a2f70f9fbf97e84d04dc.jpg","hash":"69a3d612c274049e37ead07312912345","uri":"https://game.bilibili.com/fgo/event_cp1_5_1/h5","request_id":"1523248617898q172a18a61a126q104","creative_id":7175,"src_id":703,"is_ad_loc":true,"ad_cb":"CM1oEAAYhzggACgAMAM4vwVCHzE1MjMyNDg2MTc4OThxMTcyYTE4YTYxYTEyNnExMDRIqrPFxaosUgbmiJDpg71aBuWbm+W3nWIG5Lit5Zu9aAFwAXiAgICAEIABAIgB3BGSAQ4xMTguMTE0LjI0NS40NJoBOGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkoAEAqAEAsgEgHkfS80w6dWDhEviYjLwAMuWzZmgdjY6JvC1VOCp7DT26AS5odHRwczovL2dhbWUuYmlsaWJpbGkuY29tL2Znby9ldmVudF9jcDFfNV8xL2g1wgEAygEA0gEA2AEB4AEA6AEA","click_url":"https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=1012&mid=__MID__&os=__OS__&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=__IP__&request_id=__REQUESTID__&ts=__TS__&ua=__UA__","client_ip":"118.114.245.44","server_type":1,"resource_id":631,"index":2,"cm_mark":2,"extra":{"use_ad_web_v2":true,"show_urls":[],"click_urls":["https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=1012&mid=__MID__&os=__OS__&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=__IP__&request_id=__REQUESTID__&ts=__TS__&ua=__UA__"],"open_whitelist":["dianping","kaola","vipshop","ctrip","bilibili","mqq"],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/tmaterial/201804/f8cfb7bd93e6a2f70f9fbf97e84d04dc.jpg"}],"jump_url":"https://game.bilibili.com/fgo/event_cp1_5_1/h5","desc":""}}},{"id":0,"title":"","image":"https://i0.hdslb.com/bfs/sycp/tmaterial/201804/c021bfdc93dd18a1207e38dcc8497242.jpg","hash":"6e6d28fbd6cd48e4ce593427e27c09d8","uri":"bilibili://game_center/detail?id=12&sourceType=adPut","request_id":"1523248617898q172a18a61a126q104","creative_id":7199,"src_id":704,"is_ad":true,"is_ad_loc":true,"ad_cb":"CI1qEAAYnzggACgAMAM4wAVCHzE1MjMyNDg2MTc4OThxMTcyYTE4YTYxYTEyNnExMDRIqrPFxaosUgbmiJDpg71aBuWbm+W3nWIG5Lit5Zu9aAFwAXiAgICAEIABAIgB/RGSAQ4xMTguMTE0LjI0NS40NJoBOGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkoAEAqAEAsgEgEHtNtVwGyr/147dEMln9Xf/hw+sltQPmYFhSjJ1Acx+6ATRiaWxpYmlsaTovL2dhbWVfY2VudGVyL2RldGFpbD9pZD0xMiZzb3VyY2VUeXBlPWFkUHV0wgEAygEA0gEA2AEB4AEA6AEA","client_ip":"118.114.245.44","server_type":1,"resource_id":631,"index":3,"cm_mark":1,"extra":{"use_ad_web_v2":true,"show_urls":[],"click_urls":[],"open_whitelist":["dianping","kaola","vipshop","ctrip","bilibili","mqq"],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/tmaterial/201804/c021bfdc93dd18a1207e38dcc8497242.jpg"}],"jump_url":"bilibili://game_center/detail?id=12&sourceType=adPut","desc":""}}},{"id":51769,"title":"专栏0409话题-头号玩家","image":"http://i0.hdslb.com/bfs/archive/40b6b861b60b992d71e7a847a32c5a477fa7e9b1.jpg","hash":"8c892845a43313d5005e8a60808662b9","uri":"https://www.bilibili.com/read/cv364588","request_id":"1523248617936","server_type":0,"resource_id":631,"index":4,"cm_mark":0}]
         * hash : 4487996566101178577
         * title : 【面侦探-筋南】面筋中毒事件
         * cover : https://i0.hdslb.com/bfs/archive/98f2cab4f021e4cdaf0d82f46861c57909dfb9c2.jpg
         * uri : bilibili://video/21543603
         * desc : 原BGM:「名探偵コナン」~メインテーマ
         就是不做火的曲子，反正我也不火
         下一部μ's烤面筋预定
         * play : 61018
         * danmaku : 773
         * reply : 351
         * favorite : 3052
         * coin : 3962
         * share : 1007
         * like : 3117
         * tid : 126
         * tname : 人力VOCALOID
         * dislike_reasons : [{"reason_id":4,"reason_name":"UP主:南喇嘛"},{"reason_id":2,"reason_name":"分区:人力VOCALOID"},{"reason_id":1,"reason_name":"不感兴趣"}]
         * ctime : 1522650934
         * duration : 164
         * mid : 11022834
         * name : 南喇嘛
         * face : http://i2.hdslb.com/bfs/face/5f3bd76f93128ad926e27fc8030d0d3df1be4672.jpg
         */

        private String param;
        @SerializedName("goto")
        private String gotoX;
        private int idx;
        private String hash;
        private String title;
        private String cover;
        private String uri;
        private String desc;
        private int play;
        private int danmaku;
        private int reply;
        private int favorite;
        private int coin;
        private int share;
        private int like;
        private int tid;
        private String tname;
        private int ctime;
        private int duration;
        private int mid;
        private String name;
        private String face;
        private List<BannerItemBean> banner_item;
        private List<DislikeReasonsBean> dislike_reasons;

        public String getParam() {
            return param;
        }

        public void setParam(String param) {
            this.param = param;
        }

        public String getGotoX() {
            return gotoX;
        }

        public void setGotoX(String gotoX) {
            this.gotoX = gotoX;
        }

        public int getIdx() {
            return idx;
        }

        public void setIdx(int idx) {
            this.idx = idx;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getPlay() {
            return play;
        }

        public void setPlay(int play) {
            this.play = play;
        }

        public int getDanmaku() {
            return danmaku;
        }

        public void setDanmaku(int danmaku) {
            this.danmaku = danmaku;
        }

        public int getReply() {
            return reply;
        }

        public void setReply(int reply) {
            this.reply = reply;
        }

        public int getFavorite() {
            return favorite;
        }

        public void setFavorite(int favorite) {
            this.favorite = favorite;
        }

        public int getCoin() {
            return coin;
        }

        public void setCoin(int coin) {
            this.coin = coin;
        }

        public int getShare() {
            return share;
        }

        public void setShare(int share) {
            this.share = share;
        }

        public int getLike() {
            return like;
        }

        public void setLike(int like) {
            this.like = like;
        }

        public int getTid() {
            return tid;
        }

        public void setTid(int tid) {
            this.tid = tid;
        }

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public int getCtime() {
            return ctime;
        }

        public void setCtime(int ctime) {
            this.ctime = ctime;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getMid() {
            return mid;
        }

        public void setMid(int mid) {
            this.mid = mid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFace() {
            return face;
        }

        public void setFace(String face) {
            this.face = face;
        }

        public List<BannerItemBean> getBanner_item() {
            return banner_item;
        }

        public void setBanner_item(List<BannerItemBean> banner_item) {
            this.banner_item = banner_item;
        }

        public List<DislikeReasonsBean> getDislike_reasons() {
            return dislike_reasons;
        }

        public void setDislike_reasons(List<DislikeReasonsBean> dislike_reasons) {
            this.dislike_reasons = dislike_reasons;
        }

        public static class BannerItemBean {
            /**
             * id : 51730
             * title : 花钱买“旧的”？这很时尚！
             * image : http://i0.hdslb.com/bfs/archive/01958ad3ae2269374ad6521fd09b1a750fca9b7d.jpg
             * hash : 51a79ccba7bd3a9028607430cb9d4f2f
             * uri : https://www.bilibili.com/read/cv348911
             * request_id : 1523248617936
             * server_type : 0
             * resource_id : 631
             * index : 1
             * cm_mark : 0
             * creative_id : 7175
             * src_id : 703
             * is_ad_loc : true
             * ad_cb : CM1oEAAYhzggACgAMAM4vwVCHzE1MjMyNDg2MTc4OThxMTcyYTE4YTYxYTEyNnExMDRIqrPFxaosUgbmiJDpg71aBuWbm+W3nWIG5Lit5Zu9aAFwAXiAgICAEIABAIgB3BGSAQ4xMTguMTE0LjI0NS40NJoBOGFsbDpjcGNfY3Jvd2RfdGFyZ2V0LGVjcG06ZGVmYXVsdCxjcGNUYWdGaWx0ZXI6dW5kZWZpbmVkoAEAqAEAsgEgHkfS80w6dWDhEviYjLwAMuWzZmgdjY6JvC1VOCp7DT26AS5odHRwczovL2dhbWUuYmlsaWJpbGkuY29tL2Znby9ldmVudF9jcDFfNV8xL2g1wgEAygEA0gEA2AEB4AEA6AEA
             * click_url : https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=1012&mid=__MID__&os=__OS__&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=__IP__&request_id=__REQUESTID__&ts=__TS__&ua=__UA__
             * client_ip : 118.114.245.44
             * extra : {"use_ad_web_v2":true,"show_urls":[],"click_urls":["https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=1012&mid=__MID__&os=__OS__&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=__IP__&request_id=__REQUESTID__&ts=__TS__&ua=__UA__"],"open_whitelist":["dianping","kaola","vipshop","ctrip","bilibili","mqq"],"card":{"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/tmaterial/201804/f8cfb7bd93e6a2f70f9fbf97e84d04dc.jpg"}],"jump_url":"https://game.bilibili.com/fgo/event_cp1_5_1/h5","desc":""}}
             * is_ad : true
             */

            private int id;
            private String title;
            private String image;
            private String hash;
            private String uri;
            private String request_id;
            private int server_type;
            private int resource_id;
            private int index;
            private int cm_mark;
            private int creative_id;
            private int src_id;
            private boolean is_ad_loc;
            private String ad_cb;
            private String click_url;
            private String client_ip;
            private ExtraBean extra;
            private boolean is_ad;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getHash() {
                return hash;
            }

            public void setHash(String hash) {
                this.hash = hash;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public String getRequest_id() {
                return request_id;
            }

            public void setRequest_id(String request_id) {
                this.request_id = request_id;
            }

            public int getServer_type() {
                return server_type;
            }

            public void setServer_type(int server_type) {
                this.server_type = server_type;
            }

            public int getResource_id() {
                return resource_id;
            }

            public void setResource_id(int resource_id) {
                this.resource_id = resource_id;
            }

            public int getIndex() {
                return index;
            }

            public void setIndex(int index) {
                this.index = index;
            }

            public int getCm_mark() {
                return cm_mark;
            }

            public void setCm_mark(int cm_mark) {
                this.cm_mark = cm_mark;
            }

            public int getCreative_id() {
                return creative_id;
            }

            public void setCreative_id(int creative_id) {
                this.creative_id = creative_id;
            }

            public int getSrc_id() {
                return src_id;
            }

            public void setSrc_id(int src_id) {
                this.src_id = src_id;
            }

            public boolean isIs_ad_loc() {
                return is_ad_loc;
            }

            public void setIs_ad_loc(boolean is_ad_loc) {
                this.is_ad_loc = is_ad_loc;
            }

            public String getAd_cb() {
                return ad_cb;
            }

            public void setAd_cb(String ad_cb) {
                this.ad_cb = ad_cb;
            }

            public String getClick_url() {
                return click_url;
            }

            public void setClick_url(String click_url) {
                this.click_url = click_url;
            }

            public String getClient_ip() {
                return client_ip;
            }

            public void setClient_ip(String client_ip) {
                this.client_ip = client_ip;
            }

            public ExtraBean getExtra() {
                return extra;
            }

            public void setExtra(ExtraBean extra) {
                this.extra = extra;
            }

            public boolean isIs_ad() {
                return is_ad;
            }

            public void setIs_ad(boolean is_ad) {
                this.is_ad = is_ad;
            }

            public static class ExtraBean {
                /**
                 * use_ad_web_v2 : true
                 * show_urls : []
                 * click_urls : ["https://ad-bili-data.biligame.com/api/mobile/clickBili?ad_plan_id=1012&mid=__MID__&os=__OS__&idfa=__IDFA__&buvid=__BUVID__&android_id=__ANDROIDID__&imei=__IMEI__&mac=__MAC__&duid=__DUID__&ip=__IP__&request_id=__REQUESTID__&ts=__TS__&ua=__UA__"]
                 * open_whitelist : ["dianping","kaola","vipshop","ctrip","bilibili","mqq"]
                 * card : {"card_type":0,"title":"","covers":[{"url":"https://i0.hdslb.com/bfs/sycp/tmaterial/201804/f8cfb7bd93e6a2f70f9fbf97e84d04dc.jpg"}],"jump_url":"https://game.bilibili.com/fgo/event_cp1_5_1/h5","desc":""}
                 */

                private boolean use_ad_web_v2;
                private CardBean card;
                private List<?> show_urls;
                private List<String> click_urls;
                private List<String> open_whitelist;

                public boolean isUse_ad_web_v2() {
                    return use_ad_web_v2;
                }

                public void setUse_ad_web_v2(boolean use_ad_web_v2) {
                    this.use_ad_web_v2 = use_ad_web_v2;
                }

                public CardBean getCard() {
                    return card;
                }

                public void setCard(CardBean card) {
                    this.card = card;
                }

                public List<?> getShow_urls() {
                    return show_urls;
                }

                public void setShow_urls(List<?> show_urls) {
                    this.show_urls = show_urls;
                }

                public List<String> getClick_urls() {
                    return click_urls;
                }

                public void setClick_urls(List<String> click_urls) {
                    this.click_urls = click_urls;
                }

                public List<String> getOpen_whitelist() {
                    return open_whitelist;
                }

                public void setOpen_whitelist(List<String> open_whitelist) {
                    this.open_whitelist = open_whitelist;
                }

                public static class CardBean {
                    /**
                     * card_type : 0
                     * title :
                     * covers : [{"url":"https://i0.hdslb.com/bfs/sycp/tmaterial/201804/f8cfb7bd93e6a2f70f9fbf97e84d04dc.jpg"}]
                     * jump_url : https://game.bilibili.com/fgo/event_cp1_5_1/h5
                     * desc :
                     */

                    private int card_type;
                    private String title;
                    private String jump_url;
                    private String desc;
                    private List<CoversBean> covers;

                    public int getCard_type() {
                        return card_type;
                    }

                    public void setCard_type(int card_type) {
                        this.card_type = card_type;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getJump_url() {
                        return jump_url;
                    }

                    public void setJump_url(String jump_url) {
                        this.jump_url = jump_url;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public List<CoversBean> getCovers() {
                        return covers;
                    }

                    public void setCovers(List<CoversBean> covers) {
                        this.covers = covers;
                    }

                    public static class CoversBean {
                        /**
                         * url : https://i0.hdslb.com/bfs/sycp/tmaterial/201804/f8cfb7bd93e6a2f70f9fbf97e84d04dc.jpg
                         */

                        private String url;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }
                }
            }
        }

        public static class DislikeReasonsBean {
            /**
             * reason_id : 4
             * reason_name : UP主:南喇嘛
             */

            private int reason_id;
            private String reason_name;

            public int getReason_id() {
                return reason_id;
            }

            public void setReason_id(int reason_id) {
                this.reason_id = reason_id;
            }

            public String getReason_name() {
                return reason_name;
            }

            public void setReason_name(String reason_name) {
                this.reason_name = reason_name;
            }
        }
    }
}
