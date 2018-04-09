package com.icode.jiling.vmall.viewmodel;

import com.icode.jiling.vmall.constant.Contants;
import com.icode.jiling.vmall.http.HttpApiService;
import com.icode.jiling.vmall.interfaces.LiveCallBack;
import com.icode.jiling.vmlibrary.net.NetStringCallBack;

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
 * Created by jiling on 2018/4/9.
 */

public class AnimLive {

    /**
     * code : 0
     * msg : ok
     * message : ok
     * data : {"banner":[{"title":"樱花樱花想见你","img":"http://i0.hdslb.com/bfs/live/26719d49e7291abf25c4ddc9f4eacb42f8a9dd44.png","remark":"樱花樱花想见你","link":"http://live.bilibili.com/AppBanner/index?id=833"},{"title":"直播活动-桃缘盛会","img":"http://i0.hdslb.com/bfs/live/a920d0fb278067398c11efd9a54a98e604668662.jpg","remark":"直播活动-桃缘盛会","link":"http://live.bilibili.com/AppBanner/index?id=791"},{"title":"百万现金\u2014\u2014bilibili直播招募","img":"http://i0.hdslb.com/bfs/live/014ded0a555154f7934c97234c3af71070082867.jpg","remark":"百万现金\u2014\u2014bilibili直播招募","link":"http://live.bilibili.com/AppBanner/index?id=864"}],"entranceIcons":[{"id":9,"name":"绘画专区","entrance_icon":{"src":"http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/9_big.png?20171116172700","height":"132","width":"132"}},{"id":8,"name":"萌宅推荐","entrance_icon":{"src":"http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/8_big.png?20171116172700","height":"132","width":"132"}},{"id":3,"name":"网络游戏","entrance_icon":{"src":"http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/3_big.png?20171116172700","height":"132","width":"132"}},{"id":1,"name":"单机联机","entrance_icon":{"src":"http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/1_big.png?20171116172700","height":"132","width":"132"}},{"id":4,"name":"电子竞技","entrance_icon":{"src":"http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/4_big.png?20171116172700","height":"132","width":"132"}}],"partitions":[{"partition":{"id":1,"name":"娱乐","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/1_3x.png?201709151052","height":"63","width":"63"},"count":1946},"lives":[{"roomid":52507,"uid":4444605,"title":"【橘砸】萌新主播","uname":"语哥sama","online":7468,"user_cover":"http://i0.hdslb.com/bfs/live/e5962fb6864b547dc95fad4204de4c34bbceaba3.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/52507.jpg?04091337","show_cover":"http://i0.hdslb.com/bfs/vc/593427864030585b8466bc369a245bd3e93585c9.jpg","link":"/230","face":"http://i2.hdslb.com/bfs/face/11a37ad0556820e8cdeb6749c95bd71e02e81d82.jpg","parent_id":1,"parent_name":"娱乐","area_id":139,"area_name":"美少女","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/484754/live_4444605_8819566.flv?wsSecret=2c8d40ee9ec0a62d4815c0975498c2a2&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":1,"is_tv":0,"corner":"","pendent":""},{"roomid":276578,"uid":6680275,"title":"静静肝视频 不说话","uname":"超级LED","online":306,"user_cover":"http://i0.hdslb.com/bfs/live/0e05e10ea1dcff5190bfdca3f38e8696abf10365.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/276578.jpg?04091331","show_cover":false,"link":"/276578","face":"http://i1.hdslb.com/bfs/face/17b9084b47f1936d471a35f691feb8211142080a.jpg","parent_id":1,"parent_name":"娱乐","area_id":27,"area_name":"学习","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/286528/live_6680275_1517920.flv?wsSecret=cf6e35eab4eb33cb55b4db5a98782299&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1533308,"uid":3627642,"title":"追鸡者","uname":"清箫哥哥","online":5031,"user_cover":"http://i0.hdslb.com/bfs/live/f3fd2e4c0a0a700f347d1b2fbe3c2294bb92010b.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1533308.jpg?04091336","show_cover":false,"link":"/488","face":"http://i0.hdslb.com/bfs/face/c1332485f71231ccbd438760eca6f935770b6775.jpg","parent_id":1,"parent_name":"娱乐","area_id":162,"area_name":"聊天电台","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://live-play.acgvideo.com/live/283/live_3627642_1924037.flv?wsSecret=890d0adf50efe55089635291e6f30fc5&wsTime=5aa37d84","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1217827,"uid":11942302,"title":"ASMR是你掉的双马尾小可爱嘛","uname":"一只蠢梦梦","online":1180,"user_cover":"http://i0.hdslb.com/bfs/live/013543b2118d848f793205d744003d055fdbb424.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1217827.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/bf989614c83f5074421deac3f62c2e0dd89c8af7.jpg","link":"/1217827","face":"http://i2.hdslb.com/bfs/face/58cab31e1702436d623263ad993012c3149c0494.jpg","parent_id":1,"parent_name":"娱乐","area_id":30,"area_name":"视频ASMR ","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/592922/live_11942302_7191433.flv?wsSecret=df4a4d558e717bcbd2024902db3a9a88&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":6753633,"uid":76329736,"title":"【温柔少御】想唱歌给你听","uname":"噗阿噗の葵喵","online":2595,"user_cover":"http://i0.hdslb.com/bfs/live/344e8087f253bbd5aaec6c5af793fa9078479a34.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/6753633.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/9da8eb733d15ebb2a241604cab2155e1a7c3bb66.jpg","link":"/6753633","face":"http://i2.hdslb.com/bfs/face/eec7e3efd2866e74b06c483ce5506a5a0316aa75.jpg","parent_id":1,"parent_name":"娱乐","area_id":21,"area_name":"视频唱见","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/241756/live_76329736_6082346.flv?wsSecret=731a448a27116a2e96dcab4093eb016d&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":311582,"uid":1519784,"title":"【不油不腻少女音】我 好困","uname":"是沢美","online":163,"user_cover":"http://i0.hdslb.com/bfs/live/607775badedfcb38ef2f98a2158380d754141806.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/311582.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/744551936c9be3e245c49404f31209464bba40ce.jpg","link":"/627","face":"http://i1.hdslb.com/bfs/face/c851df0c6919c6e9b0afbe7918ee588e30a9a177.jpg","parent_id":1,"parent_name":"娱乐","area_id":160,"area_name":"唱见电台","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/655295/live_1519784_7889363.flv?wsSecret=44f45fcc6b1ae1cbaa2a17ba4edf26ba&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""}]},{"partition":{"id":2,"name":"游戏","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/2_3x.png?201709151052","height":"63","width":"63"},"count":1648},"lives":[{"roomid":6187658,"uid":526827,"title":"堡垒之夜有木有同学来狙击我呀QvQ","uname":"星空7k","online":1139,"user_cover":"http://i0.hdslb.com/bfs/live/b8c88c455f0bdd91a99f8cd87d3bced8c482d595.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/6187658.jpg?04091331","show_cover":false,"link":"/6187658","face":"http://i2.hdslb.com/bfs/face/483ee02e1a4cb1fd119eb52affe7ae56e280c00a.jpg","parent_id":2,"parent_name":"游戏","area_id":107,"area_name":"其他游戏","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/238456/live_526827_2065986.flv?wsSecret=3801c2da4e32d25d251400f3c5a98ca6&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":5096,"uid":183430,"title":"【滚】吔鸡","uname":"两仪滚","online":214196,"user_cover":"http://i0.hdslb.com/bfs/live/e64902520ab6e0aaeb6e2d1b721cccbf241045d3.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/5096.jpg?04091336","show_cover":false,"link":"/388","face":"http://i1.hdslb.com/bfs/face/4a91427ef035836b1937244bc559ed03f244bfa9.jpg","parent_id":2,"parent_name":"游戏","area_id":80,"area_name":"绝地求生","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://js.live-play.acgvideo.com/live-js/208248/live_183430_5743361.flv?wsSecret=0d5ab44fe4baa87496eb3adc0fd6e70a&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":4355221,"uid":3917160,"title":"恐怖游戏","uname":"阿绿KIki","online":1292,"user_cover":"http://i0.hdslb.com/bfs/live/4a9a0545f099e2c1e2d3dd39025c2a98cdd72fc6.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/4355221.jpg?04091336","show_cover":false,"link":"/4355221","face":"http://i2.hdslb.com/bfs/face/ea44e7498644deafcf516ef8fdc5831468b8da9e.jpg","parent_id":2,"parent_name":"游戏","area_id":107,"area_name":"其他游戏","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/715557/live_3917160_1577824.flv?wsSecret=aac5ae085180b81a0494c080816e66c9&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":2329877,"uid":19933587,"title":"抱歉泰拉瑞亚","uname":"琳子琳子琳喵w","online":18,"user_cover":"http://i0.hdslb.com/bfs/live/971a6ac8d8ee179adcf4e1237e111aa4f16b305b.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/2329877.jpg?04071917","show_cover":false,"link":"/2329877","face":"http://i1.hdslb.com/bfs/face/68294a907476807d74bd2f26a90c961f6ce8cb15.jpg","parent_id":2,"parent_name":"游戏","area_id":107,"area_name":"其他游戏","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/734881/live_19933587_4807149.flv?wsSecret=21ffecb0f6c346a60ee724479e0520f8&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":299360,"uid":29562336,"title":"火炬之光2，最高难度开荒实况","uname":"五毒巫毒","online":418,"user_cover":"http://i0.hdslb.com/bfs/live/c511eadee7ef1d779deb9b1caaca0902f961e574.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/299360.jpg?04091331","show_cover":false,"link":"/299360","face":"http://i0.hdslb.com/bfs/face/41ed1406fceeb94cc0ffd1cdd55ab75320cc87ca.jpg","parent_id":2,"parent_name":"游戏","area_id":107,"area_name":"其他游戏","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/168037/live_29562336_6007200.flv?wsSecret=92f5b93212e14658fe4a2cecbc14d28a&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":17102,"uid":356011,"title":"绝赞划水中","uname":"超放纵","online":58,"user_cover":"http://i0.hdslb.com/bfs/live/b55f38f42092cc06eca3544921cfcd8967569928.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/17102.jpg?04091331","show_cover":false,"link":"/17102","face":"http://i1.hdslb.com/bfs/face/bab2f6c9e1d743730069b9daf8efd7c4e7984e0e.jpg","parent_id":2,"parent_name":"游戏","area_id":107,"area_name":"其他游戏","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/713052/live_356011_5503041.flv?wsSecret=96ed47512bf8291e065249d1b73d98d5&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""}]},{"partition":{"id":3,"name":"手游","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/3_3x.png?201709151052","height":"63","width":"63"},"count":615},"lives":[{"roomid":39936,"uid":14837663,"title":"第五人格：人皇奈不怂","uname":"奈さま","online":16874,"user_cover":"http://i0.hdslb.com/bfs/live/058b42c187568d72a361343d72887042dcee3ab3.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/39936.jpg?04091336","show_cover":false,"link":"/155","face":"http://i0.hdslb.com/bfs/face/80b2a1e666160d9a1fed82c643885e182d21a82f.jpg","parent_id":3,"parent_name":"手游","area_id":98,"area_name":"其他手游","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://117.21.179.8/live-bvc/561427/live_14837663_7724658.flv?expires=1523254137&ssig=tPcPrYjgt2n_BXD32hIn7w&oi=3059834287","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1765131,"uid":53133133,"title":"性感小布在线溜鬼，套人的汉子在线套人","uname":"小布菌丶","online":4987,"user_cover":"http://i0.hdslb.com/bfs/live/230edd35337010c492ba58e4ccab62b1fbafa6fe.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1765131.jpg?04091335","show_cover":"http://i0.hdslb.com/bfs/vc/73986cd04c677369249a8f0bdee75715b83cc584.jpg","link":"/1765131","face":"http://i2.hdslb.com/bfs/face/017592c6e64d38d06ca44de3c3717810c945432f.jpg","parent_id":3,"parent_name":"手游","area_id":98,"area_name":"其他手游","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://txy.live-play.acgvideo.com/live-txy/240555/live_53133133_2283403.flv?wsSecret=e29104c453cfc2eb210f4947be131a89&wsTime=1523254137","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":40270,"uid":8124053,"title":"第五人格】国服前10 今日有望","uname":"小Y_MRY","online":97622,"user_cover":"http://i0.hdslb.com/bfs/live/096cc89196d72f66d442b6821e9032ac7d1d19b7.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/40270.jpg?04091337","show_cover":false,"link":"/470","face":"http://i0.hdslb.com/bfs/face/c18c5c323c73ca2e38456c771a57176da317ac2c.jpg","parent_id":3,"parent_name":"手游","area_id":98,"area_name":"其他手游","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://116.207.118.14/live-bvc/144946/live_8124053_2461854.flv?expires=1523254137&ssig=ScD0GTEqXo0w8v1Glh_Ahg&oi=3059834287","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":26057,"uid":164627,"title":"【杆菌】第五人格，晚上航天！","uname":"杆菌无敌","online":42452,"user_cover":"http://i0.hdslb.com/bfs/live/3b7f754a5abf9e27dc48c53ce07ac856010f1017.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/26057.jpg?04091338","show_cover":false,"link":"/246","face":"http://i1.hdslb.com/bfs/face/6bbeb93dd72c60cb7ad2e876b241d0360d7f0d38.gif","parent_id":3,"parent_name":"手游","area_id":98,"area_name":"其他手游","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://116.207.118.14/live-bvc/490957/live_164627_2722814.flv?expires=1523254137&ssig=TPb6k_-XU62-gyxHCfxMuQ&oi=3059834287","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":3742025,"uid":93841264,"title":"二狗带你看懂王者荣耀","uname":"梦醒三生梦","online":38937,"user_cover":"http://i0.hdslb.com/bfs/live/ab776cf24e4dd2fd76f81b8661d64c2def6b9296.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/3742025.jpg?04091337","show_cover":false,"link":"/439","face":"http://i1.hdslb.com/bfs/face/b30b947c58c6b1011136621a3ab54c0031c920fe.jpg","parent_id":3,"parent_name":"手游","area_id":35,"area_name":"王者荣耀","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://116.207.118.13/live-bvc/185098/live_93841264_4272534.flv?expires=1523254137&ssig=gkq8ITy5NxqHoKaPCiiecw&oi=3059834287","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1235840,"uid":17853039,"title":"【刺激战场】噗通话....","uname":"音以结弦","online":6593,"user_cover":"http://i0.hdslb.com/bfs/live/6431928df0009455425e1b6ac2fd153241e60652.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1235840.jpg?04091336","show_cover":false,"link":"/1235840","face":"http://i0.hdslb.com/bfs/face/710fa55d70daf6bd11a6648da1f1c96925663434.jpg","parent_id":3,"parent_name":"手游","area_id":153,"area_name":"绝地求生：刺激战场","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://117.21.179.8/live-bvc/883341/live_17853039_5467330.flv?expires=1523254137&ssig=IspUfeGwpjzrIAJpoWWpGA&oi=3059834287","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""}]},{"partition":{"id":4,"name":"绘画","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/4_3x.png?201709151052","height":"63","width":"63"},"count":124},"lives":[{"roomid":491683,"uid":26633150,"title":"失踪人口回归","uname":"wlop-","online":27175,"user_cover":"http://i0.hdslb.com/bfs/live/32b39350b70e3e4422834eae947cde7bbc39508b.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/491683.jpg?04091336","show_cover":false,"link":"/597","face":"http://i0.hdslb.com/bfs/face/0acb122cfe2e1de1f33b5f3a96347ac40fbff880.jpg","parent_id":4,"parent_name":"绘画","area_id":51,"area_name":"原创绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://live-play.acgvideo.com/live/577/live_26633150_2634870.flv?wsSecret=26a693ca87d591063d541e6a6d7f9844&wsTime=5aa37d84","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":209462,"uid":503712,"title":"穿越西元3000后","uname":"小小作文","online":336,"user_cover":"http://i0.hdslb.com/bfs/live/9092c2d746fb556dfe2b7563ba22f00204a2bb96.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/209462.jpg?04091331","show_cover":false,"link":"/209462","face":"http://i0.hdslb.com/bfs/face/436691bfa02a0bf22362aa835b7bdf6b3e42790b.jpg","parent_id":4,"parent_name":"绘画","area_id":51,"area_name":"原创绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/347297/live_503712_2556310.flv?wsSecret=448060bd017f8eddb958fd242eed91bb&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":257200,"uid":22148077,"title":"基三帮派全家福【勾线勾到天荒地老】","uname":"这只是小晶","online":54,"user_cover":"http://i0.hdslb.com/bfs/live/5f14b88e2407a65fc5a4bd189d9503772479c09a.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/257200.jpg?04091331","show_cover":false,"link":"/257200","face":"http://i1.hdslb.com/bfs/face/696ab241369e4df288508a8c45c85bb8589a4809.jpg","parent_id":4,"parent_name":"绘画","area_id":94,"area_name":"同人绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://xl.live-play.acgvideo.com/live-xl/603318/live_22148077_8144478.flv?wsSecret=f04a9ad50adda88c4f642881445bca61&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":472538,"uid":35271215,"title":"【金鱼】寻前","uname":"PumpkinJakk-金鱼","online":483,"user_cover":"http://i0.hdslb.com/bfs/live/42d362167790ddd4aa311ac71e8a6767f7a9b20a.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/472538.jpg?04091338","show_cover":false,"link":"/472538","face":"http://i2.hdslb.com/bfs/face/ce8af5ba39f59dcd898ed59dbc26e9d0021a3ce1.jpg","parent_id":4,"parent_name":"绘画","area_id":51,"area_name":"原创绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/867952/live_35271215_8431452.flv?wsSecret=916321ef48c36f54e81a53742cfce96f&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":716562,"uid":1852141,"title":"女歌手直播画画了","uname":"椛空から☆","online":188,"user_cover":"http://i0.hdslb.com/bfs/live/747473396d3565c7bd0da5e866e64e3912bd1979.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/716562.jpg?04091338","show_cover":false,"link":"/716562","face":"http://i0.hdslb.com/bfs/face/bad0407e2bd92056dc443cf3a776ad5581a171d9.jpg","parent_id":4,"parent_name":"绘画","area_id":51,"area_name":"原创绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/152905/live_1852141_8791762.flv?wsSecret=ad75ae82023d64ccd73e4bdde80a9a8e&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":3986127,"uid":2704846,"title":"摸鱼【本人川普_(:з」∠)_慎入】","uname":"GreenEyedMoster","online":4,"user_cover":"http://i0.hdslb.com/bfs/live/f19cb9a3e956df3f6807e1750e12d41b6d3079de.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/3986127.jpg?04031711","show_cover":false,"link":"/3986127","face":"http://i1.hdslb.com/bfs/face/fd84eac512035786b34897384bc0064932a074b4.jpg","parent_id":4,"parent_name":"绘画","area_id":51,"area_name":"原创绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://js.live-play.acgvideo.com/live-js/402406/live_2704846_2959246.flv?wsSecret=96936db613b5a07dcfa2cc5dc3cb9caa&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""}]}],"star_show":{"partition":{"id":999,"name":"颜值领域","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/-2_3x.png?201709151052","height":"63","width":"63"},"count":0,"hidden":0},"lives":[{"roomid":1064387,"uid":38053609,"title":"这UP主居然在直播间干这种事！","uname":"黄小圆cora","online":2033,"user_cover":"http://i0.hdslb.com/bfs/live/5fdc554aa0c4b488dc0d00c0f928945ee9d6457d.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1064387.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/9e48d32b18aa769b53821efef5981d1ac7ad23d9.jpg","link":"/1064387","face":"http://i0.hdslb.com/bfs/face/4f7643f53f04b069a286dad83edd98e873733d7a.jpg","parent_id":1,"parent_name":"娱乐","area_id":21,"area_name":"视频唱见","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/116452/live_38053609_2886317.flv?wsSecret=2785127315884e91145b3402b1a6ed89&wsTime=1523254132","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1236440,"uid":39634364,"title":"下午好，回家啦早点回学校哦|･ω･｀)","uname":"筱萱一直很帅","online":6,"user_cover":"http://i0.hdslb.com/bfs/live/1b22a906f360a46d7f4e7f6fe412acb3e1740bb6.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1236440.jpg?04082238","show_cover":"http://i0.hdslb.com/bfs/vc/79ed735bc9c3f1927069d8b5ce86719920c040d2.jpg","link":"/1236440","face":"http://i0.hdslb.com/bfs/face/89409b20487491d4e25b951de17581560fa4ea56.jpg","parent_id":1,"parent_name":"娱乐","area_id":32,"area_name":"手机直播","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://113.215.0.235/live-bvc/521286/live_39634364_7185438.flv?expires=1523254132&ssig=pgHrRlFC-8r_geIC19sJSw&oi=1909916181","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":1,"is_tv":0,"corner":"","pendent":""},{"roomid":3514612,"uid":8779497,"title":"可爱的是你~","uname":"一颗奶糖不加糖","online":4807,"user_cover":"http://i0.hdslb.com/bfs/live/9f6ca31debdc17f0eb41b424ff0ac018348ebc01.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/3514612.jpg?04091330","show_cover":"http://i0.hdslb.com/bfs/vc/b0cb8aabba7a0d371a3461cd5f201ccec52e4cd5.jpg","link":"/418","face":"http://i2.hdslb.com/bfs/face/a2ead6078e39d569b067453c06f21808df26d133.jpg","parent_id":1,"parent_name":"娱乐","area_id":139,"area_name":"美少女","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://xl.live-play.acgvideo.com/live-xl/411472/live_8779497_4295285.flv?wsSecret=2681b8ed2a3dff19e73288293f2dedb8&wsTime=1523254132","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":5666729,"uid":15658652,"title":"佛系少女开播啦","uname":"丫丫吃烧烤","online":553,"user_cover":"http://i0.hdslb.com/bfs/live/854e8c9e6238eb5cea2f5da5e9c9102f7fc0fbc2.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/5666729.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/3890b05d0e78c4c01c2abaf80adfb4a2d74a6ab4.jpg","link":"/5666729","face":"http://i0.hdslb.com/bfs/face/52745e30e9e082d729dd5201b746797baa0cfc14.jpg","parent_id":1,"parent_name":"娱乐","area_id":145,"area_name":"视频聊天","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://bvc.live-play.acgvideo.com/live-bvc/212507/live_15658652_8147305.flv?wsSecret=cfd3364c042e60314ba52cc1e9959c1e&wsTime=1523254132","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":1,"is_tv":0,"corner":"","pendent":""}]},"recommend_data":{"partition":{"id":0,"name":"推荐主播","area":"hot","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/-1_3x.png?201709151052","height":"63","width":"63"},"count":4807},"banner_data":[{"cover":{"src":"http://i0.hdslb.com/bfs/live/348fbbc30ca1578d900b44dda64acd1310b1d05e.png","height":180,"width":320},"title":"今天，你的小视频上榜了吗？","is_clip":1,"new_cover":{"src":"http://i0.hdslb.com/bfs/live/b6ac78b2ad96cdc9a4d59719b1f8b3b8d1893e6d.jpg","height":180,"width":320},"new_title":"B站大触竟然都在这里？？？","new_router":"http://h.bilibili.com/ywh/h5/index"}],"lives":[{"owner":{"face":"http://i2.hdslb.com/bfs/face/a2ead6078e39d569b067453c06f21808df26d133.jpg","mid":8779497,"name":"一颗奶糖不加糖"},"cover":{"src":"http://i0.hdslb.com/bfs/live/9f6ca31debdc17f0eb41b424ff0ac018348ebc01.jpg","height":180,"width":320},"room_id":3514612,"check_version":0,"online":4807,"area":"生活娱乐","area_id":6,"title":"可爱的是你~","playurl":"http://xl.live-play.acgvideo.com/live-xl/462734/live_8779497_4295285.flv?wsSecret=53f952f128412552f37158cc3db109e4&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":139,"area_v2_name":"美少女","area_v2_parent_id":1,"area_v2_parent_name":"娱乐"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/ea5235b1c9d9ce2604c37bcef2c0ef965d3b5589.jpg","mid":10404286,"name":"红发杰克丶"},"cover":{"src":"http://i0.hdslb.com/bfs/live/771bd280cc478e2816ff0d4dbd66c3e6709d6cc8.jpg","height":180,"width":320},"room_id":34180,"check_version":0,"online":14265,"area":"单机联机","area_id":1,"title":"第五人格了解一下","playurl":"http://qn.live-play.acgvideo.com/live-qn/869044/live_10404286_9705271.flv?wsSecret=42609ad2a76d7448cb24657de126ffc3&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":107,"area_v2_name":"其他游戏","area_v2_parent_id":2,"area_v2_parent_name":"游戏"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/58c7bc8dbea06339f5597aa6c21da60f9841da73.jpg","mid":15285559,"name":"JTG_LuuuuuYa"},"cover":{"src":"http://i0.hdslb.com/bfs/live/c7669d361469c3920786b3b02519da8c4d3f868c.jpg","height":180,"width":320},"room_id":4906471,"check_version":0,"online":756,"area":"单机联机","area_id":1,"title":"【JTG】单排的沉默者~~","playurl":"http://qn.live-play.acgvideo.com/live-qn/229911/live_15285559_5325603.flv?wsSecret=c31122ed6d3f6000dbdd4166a749fd60&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":80,"area_v2_name":"绝地求生","area_v2_parent_id":2,"area_v2_parent_name":"游戏","data_behavior_id":"b0a4a406be012f3:b0a4a406be012f3:0:0","data_source_id":"system"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/ffd4493e53b3da7184b35df9d933ed11ee16a650.jpg","mid":1111078,"name":"明希kirara"},"cover":{"src":"http://i0.hdslb.com/bfs/live/e0386841fd0ab9ebdf7dd5e296be2c1fe3d019a3.jpg","height":180,"width":320},"room_id":22361,"check_version":0,"online":5859,"area":"手游直播","area_id":12,"title":"❤️感冒就应该在床上玩手机❤️","playurl":"http://qn.live-play.acgvideo.com/live-qn/917416/live_1111078_4132556.flv?wsSecret=d8e631f34299ca63f12aebf103a90d51&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":98,"area_v2_name":"其他手游","area_v2_parent_id":3,"area_v2_parent_name":"手游"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/026c8fce3b441c29b1c0dfe0088479a0e091d796.jpg","mid":139525612,"name":"艾斯德斯-"},"cover":{"src":"http://i0.hdslb.com/bfs/live/7748ff1bd82df367123e6d71118ef8c08f0fba22.jpg","height":180,"width":320},"room_id":9615862,"check_version":0,"online":533,"area":"生活娱乐","area_id":6,"title":"尬聊主播，了解一下？","playurl":"http://qn.live-play.acgvideo.com/live-qn/386876/live_139525612_1830356.flv?wsSecret=8f2941a7962daf92e01530b33bb1ae97&wsTime=1523254140","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":145,"area_v2_name":"视频聊天","area_v2_parent_id":1,"area_v2_parent_name":"娱乐","data_behavior_id":"b0a4a406be012f3:b0a4a406be012f3:0:0","data_source_id":"system"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/52745e30e9e082d729dd5201b746797baa0cfc14.jpg","mid":15658652,"name":"丫丫吃烧烤"},"cover":{"src":"http://i0.hdslb.com/bfs/live/854e8c9e6238eb5cea2f5da5e9c9102f7fc0fbc2.jpg","height":180,"width":320},"room_id":5666729,"check_version":0,"online":553,"area":"生活娱乐","area_id":6,"title":"佛系少女开播啦","playurl":"http://qn.live-play.acgvideo.com/live-qn/283083/live_15658652_8147305.flv?wsSecret=b608aee31306bf9b352f9c239b4429ed&wsTime=1523254141","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":145,"area_v2_name":"视频聊天","area_v2_parent_id":1,"area_v2_parent_name":"娱乐","data_behavior_id":"b0a4a406be012f3:b0a4a406be012f3:0:0","data_source_id":"system"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/77eace3224317552a01d07d053f526e84822d445.jpg","mid":3098936,"name":"SUYI喝奶奶"},"cover":{"src":"http://i0.hdslb.com/bfs/live/0a6004c7d2da7328c933dc889ab3bab7d3ffecca.jpg","height":180,"width":320},"room_id":45827,"check_version":0,"online":5407,"area":"唱见舞见","area_id":10,"title":"【SUYI奶茶店】","playurl":"http://txy.live-play.acgvideo.com/live-txy/290623/live_3098936_1279639.flv?wsSecret=4e567b23073417d676a2331b42e8ab32&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":21,"area_v2_name":"视频唱见","area_v2_parent_id":1,"area_v2_parent_name":"娱乐"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/c18c5c323c73ca2e38456c771a57176da317ac2c.jpg","mid":8124053,"name":"小Y_MRY"},"cover":{"src":"http://i0.hdslb.com/bfs/live/096cc89196d72f66d442b6821e9032ac7d1d19b7.jpg","height":180,"width":320},"room_id":40270,"check_version":0,"online":97622,"area":"手游直播","area_id":12,"title":"第五人格】国服前10 今日有望","playurl":"http://live-play.acgvideo.com/live/309/live_8124053_2461854.flv?wsSecret=b75e56c08af00de542d70604f4372fa4&wsTime=5aa37d82","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":98,"area_v2_name":"其他手游","area_v2_parent_id":3,"area_v2_parent_name":"手游"},{"owner":{"face":"http://i2.hdslb.com/bfs/face/fe78c7eac5ba243d8e6bb266e1ffb9a4a88935c4.jpg","mid":331520,"name":"yuki琥珀"},"cover":{"src":"http://i0.hdslb.com/bfs/live/7266d1cf712e8577f0abdc5e62b08ec616221ba4.jpg","height":180,"width":320},"room_id":10248,"check_version":0,"online":5225,"area":"单机联机","area_id":1,"title":"咸鱼时间","playurl":"http://qn.live-play.acgvideo.com/live-qn/631977/live_331520_2095558.flv?wsSecret=b30c083e472dc096f2d56d9e2ac386f6&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":107,"area_v2_name":"其他游戏","area_v2_parent_id":2,"area_v2_parent_name":"游戏"},{"owner":{"face":"http://i2.hdslb.com/bfs/face/5cbdda2278f02d1410ff5bc5c1d25a22214a8af8.jpg","mid":4705522,"name":"沙拉Azusa"},"cover":{"src":"http://i0.hdslb.com/bfs/vc/a621e11a2c34663e7ffc3a229f4cb088b0b1f8b7.jpg","height":180,"width":320},"room_id":933508,"check_version":0,"online":22735,"area":"单机联机","area_id":1,"title":"我就偷偷玩一会啦啦啦啦~~~","playurl":"http://qn.live-play.acgvideo.com/live-qn/839546/live_4705522_7251458.flv?wsSecret=09196d2045524137d80d935ecc709274&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":80,"area_v2_name":"绝地求生","area_v2_parent_id":2,"area_v2_parent_name":"游戏"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/c489cebbd9cb5902b950ca819ab1980d3fd49f5c.jpg","mid":1597982,"name":"Richard_Price"},"cover":{"src":"http://i0.hdslb.com/bfs/live/c46554cb778ac9941bf39e4771ff75c944f60e39.jpg","height":180,"width":320},"room_id":869069,"check_version":0,"online":3750,"area":"御宅文化","area_id":2,"title":"【戴耳机】晚安，北美","playurl":"http://live-play.acgvideo.com/live/443/live_1597982_9114881.flv?wsSecret=54860b21a05cdc9b63be00bc2552473f&wsTime=5aa37d82","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":30,"area_v2_name":"视频ASMR ","area_v2_parent_id":1,"area_v2_parent_name":"娱乐"},{"owner":{"face":"http://i2.hdslb.com/bfs/face/1efee088daeda80d473a5dfb77e05aaacb79d9fd.jpg","mid":4578433,"name":"老骚豆腐"},"cover":{"src":"http://i0.hdslb.com/bfs/live/14f0bc7d87b07094fed2f9be2737496e90853d22.jpg","height":180,"width":320},"room_id":763679,"check_version":0,"online":1440,"area":"手游直播","area_id":12,"title":"【豆腐】第五人格！只会秀！","playurl":"http://qn.live-play.acgvideo.com/live-qn/467682/live_4578433_9339544.flv?wsSecret=a28db0eae61b3ba12d5fa6c6034c665a&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":98,"area_v2_name":"其他手游","area_v2_parent_id":3,"area_v2_parent_name":"手游"}]}}
     */

    private int code;
    private String msg;
    private String message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * banner : [{"title":"樱花樱花想见你","img":"http://i0.hdslb.com/bfs/live/26719d49e7291abf25c4ddc9f4eacb42f8a9dd44.png","remark":"樱花樱花想见你","link":"http://live.bilibili.com/AppBanner/index?id=833"},{"title":"直播活动-桃缘盛会","img":"http://i0.hdslb.com/bfs/live/a920d0fb278067398c11efd9a54a98e604668662.jpg","remark":"直播活动-桃缘盛会","link":"http://live.bilibili.com/AppBanner/index?id=791"},{"title":"百万现金\u2014\u2014bilibili直播招募","img":"http://i0.hdslb.com/bfs/live/014ded0a555154f7934c97234c3af71070082867.jpg","remark":"百万现金\u2014\u2014bilibili直播招募","link":"http://live.bilibili.com/AppBanner/index?id=864"}]
         * entranceIcons : [{"id":9,"name":"绘画专区","entrance_icon":{"src":"http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/9_big.png?20171116172700","height":"132","width":"132"}},{"id":8,"name":"萌宅推荐","entrance_icon":{"src":"http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/8_big.png?20171116172700","height":"132","width":"132"}},{"id":3,"name":"网络游戏","entrance_icon":{"src":"http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/3_big.png?20171116172700","height":"132","width":"132"}},{"id":1,"name":"单机联机","entrance_icon":{"src":"http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/1_big.png?20171116172700","height":"132","width":"132"}},{"id":4,"name":"电子竞技","entrance_icon":{"src":"http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/4_big.png?20171116172700","height":"132","width":"132"}}]
         * partitions : [{"partition":{"id":1,"name":"娱乐","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/1_3x.png?201709151052","height":"63","width":"63"},"count":1946},"lives":[{"roomid":52507,"uid":4444605,"title":"【橘砸】萌新主播","uname":"语哥sama","online":7468,"user_cover":"http://i0.hdslb.com/bfs/live/e5962fb6864b547dc95fad4204de4c34bbceaba3.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/52507.jpg?04091337","show_cover":"http://i0.hdslb.com/bfs/vc/593427864030585b8466bc369a245bd3e93585c9.jpg","link":"/230","face":"http://i2.hdslb.com/bfs/face/11a37ad0556820e8cdeb6749c95bd71e02e81d82.jpg","parent_id":1,"parent_name":"娱乐","area_id":139,"area_name":"美少女","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/484754/live_4444605_8819566.flv?wsSecret=2c8d40ee9ec0a62d4815c0975498c2a2&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":1,"is_tv":0,"corner":"","pendent":""},{"roomid":276578,"uid":6680275,"title":"静静肝视频 不说话","uname":"超级LED","online":306,"user_cover":"http://i0.hdslb.com/bfs/live/0e05e10ea1dcff5190bfdca3f38e8696abf10365.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/276578.jpg?04091331","show_cover":false,"link":"/276578","face":"http://i1.hdslb.com/bfs/face/17b9084b47f1936d471a35f691feb8211142080a.jpg","parent_id":1,"parent_name":"娱乐","area_id":27,"area_name":"学习","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/286528/live_6680275_1517920.flv?wsSecret=cf6e35eab4eb33cb55b4db5a98782299&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1533308,"uid":3627642,"title":"追鸡者","uname":"清箫哥哥","online":5031,"user_cover":"http://i0.hdslb.com/bfs/live/f3fd2e4c0a0a700f347d1b2fbe3c2294bb92010b.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1533308.jpg?04091336","show_cover":false,"link":"/488","face":"http://i0.hdslb.com/bfs/face/c1332485f71231ccbd438760eca6f935770b6775.jpg","parent_id":1,"parent_name":"娱乐","area_id":162,"area_name":"聊天电台","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://live-play.acgvideo.com/live/283/live_3627642_1924037.flv?wsSecret=890d0adf50efe55089635291e6f30fc5&wsTime=5aa37d84","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1217827,"uid":11942302,"title":"ASMR是你掉的双马尾小可爱嘛","uname":"一只蠢梦梦","online":1180,"user_cover":"http://i0.hdslb.com/bfs/live/013543b2118d848f793205d744003d055fdbb424.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1217827.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/bf989614c83f5074421deac3f62c2e0dd89c8af7.jpg","link":"/1217827","face":"http://i2.hdslb.com/bfs/face/58cab31e1702436d623263ad993012c3149c0494.jpg","parent_id":1,"parent_name":"娱乐","area_id":30,"area_name":"视频ASMR ","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/592922/live_11942302_7191433.flv?wsSecret=df4a4d558e717bcbd2024902db3a9a88&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":6753633,"uid":76329736,"title":"【温柔少御】想唱歌给你听","uname":"噗阿噗の葵喵","online":2595,"user_cover":"http://i0.hdslb.com/bfs/live/344e8087f253bbd5aaec6c5af793fa9078479a34.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/6753633.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/9da8eb733d15ebb2a241604cab2155e1a7c3bb66.jpg","link":"/6753633","face":"http://i2.hdslb.com/bfs/face/eec7e3efd2866e74b06c483ce5506a5a0316aa75.jpg","parent_id":1,"parent_name":"娱乐","area_id":21,"area_name":"视频唱见","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/241756/live_76329736_6082346.flv?wsSecret=731a448a27116a2e96dcab4093eb016d&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":311582,"uid":1519784,"title":"【不油不腻少女音】我 好困","uname":"是沢美","online":163,"user_cover":"http://i0.hdslb.com/bfs/live/607775badedfcb38ef2f98a2158380d754141806.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/311582.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/744551936c9be3e245c49404f31209464bba40ce.jpg","link":"/627","face":"http://i1.hdslb.com/bfs/face/c851df0c6919c6e9b0afbe7918ee588e30a9a177.jpg","parent_id":1,"parent_name":"娱乐","area_id":160,"area_name":"唱见电台","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/655295/live_1519784_7889363.flv?wsSecret=44f45fcc6b1ae1cbaa2a17ba4edf26ba&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""}]},{"partition":{"id":2,"name":"游戏","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/2_3x.png?201709151052","height":"63","width":"63"},"count":1648},"lives":[{"roomid":6187658,"uid":526827,"title":"堡垒之夜有木有同学来狙击我呀QvQ","uname":"星空7k","online":1139,"user_cover":"http://i0.hdslb.com/bfs/live/b8c88c455f0bdd91a99f8cd87d3bced8c482d595.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/6187658.jpg?04091331","show_cover":false,"link":"/6187658","face":"http://i2.hdslb.com/bfs/face/483ee02e1a4cb1fd119eb52affe7ae56e280c00a.jpg","parent_id":2,"parent_name":"游戏","area_id":107,"area_name":"其他游戏","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/238456/live_526827_2065986.flv?wsSecret=3801c2da4e32d25d251400f3c5a98ca6&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":5096,"uid":183430,"title":"【滚】吔鸡","uname":"两仪滚","online":214196,"user_cover":"http://i0.hdslb.com/bfs/live/e64902520ab6e0aaeb6e2d1b721cccbf241045d3.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/5096.jpg?04091336","show_cover":false,"link":"/388","face":"http://i1.hdslb.com/bfs/face/4a91427ef035836b1937244bc559ed03f244bfa9.jpg","parent_id":2,"parent_name":"游戏","area_id":80,"area_name":"绝地求生","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://js.live-play.acgvideo.com/live-js/208248/live_183430_5743361.flv?wsSecret=0d5ab44fe4baa87496eb3adc0fd6e70a&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":4355221,"uid":3917160,"title":"恐怖游戏","uname":"阿绿KIki","online":1292,"user_cover":"http://i0.hdslb.com/bfs/live/4a9a0545f099e2c1e2d3dd39025c2a98cdd72fc6.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/4355221.jpg?04091336","show_cover":false,"link":"/4355221","face":"http://i2.hdslb.com/bfs/face/ea44e7498644deafcf516ef8fdc5831468b8da9e.jpg","parent_id":2,"parent_name":"游戏","area_id":107,"area_name":"其他游戏","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/715557/live_3917160_1577824.flv?wsSecret=aac5ae085180b81a0494c080816e66c9&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":2329877,"uid":19933587,"title":"抱歉泰拉瑞亚","uname":"琳子琳子琳喵w","online":18,"user_cover":"http://i0.hdslb.com/bfs/live/971a6ac8d8ee179adcf4e1237e111aa4f16b305b.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/2329877.jpg?04071917","show_cover":false,"link":"/2329877","face":"http://i1.hdslb.com/bfs/face/68294a907476807d74bd2f26a90c961f6ce8cb15.jpg","parent_id":2,"parent_name":"游戏","area_id":107,"area_name":"其他游戏","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/734881/live_19933587_4807149.flv?wsSecret=21ffecb0f6c346a60ee724479e0520f8&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":299360,"uid":29562336,"title":"火炬之光2，最高难度开荒实况","uname":"五毒巫毒","online":418,"user_cover":"http://i0.hdslb.com/bfs/live/c511eadee7ef1d779deb9b1caaca0902f961e574.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/299360.jpg?04091331","show_cover":false,"link":"/299360","face":"http://i0.hdslb.com/bfs/face/41ed1406fceeb94cc0ffd1cdd55ab75320cc87ca.jpg","parent_id":2,"parent_name":"游戏","area_id":107,"area_name":"其他游戏","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/168037/live_29562336_6007200.flv?wsSecret=92f5b93212e14658fe4a2cecbc14d28a&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":17102,"uid":356011,"title":"绝赞划水中","uname":"超放纵","online":58,"user_cover":"http://i0.hdslb.com/bfs/live/b55f38f42092cc06eca3544921cfcd8967569928.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/17102.jpg?04091331","show_cover":false,"link":"/17102","face":"http://i1.hdslb.com/bfs/face/bab2f6c9e1d743730069b9daf8efd7c4e7984e0e.jpg","parent_id":2,"parent_name":"游戏","area_id":107,"area_name":"其他游戏","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/713052/live_356011_5503041.flv?wsSecret=96ed47512bf8291e065249d1b73d98d5&wsTime=1523254138","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""}]},{"partition":{"id":3,"name":"手游","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/3_3x.png?201709151052","height":"63","width":"63"},"count":615},"lives":[{"roomid":39936,"uid":14837663,"title":"第五人格：人皇奈不怂","uname":"奈さま","online":16874,"user_cover":"http://i0.hdslb.com/bfs/live/058b42c187568d72a361343d72887042dcee3ab3.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/39936.jpg?04091336","show_cover":false,"link":"/155","face":"http://i0.hdslb.com/bfs/face/80b2a1e666160d9a1fed82c643885e182d21a82f.jpg","parent_id":3,"parent_name":"手游","area_id":98,"area_name":"其他手游","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://117.21.179.8/live-bvc/561427/live_14837663_7724658.flv?expires=1523254137&ssig=tPcPrYjgt2n_BXD32hIn7w&oi=3059834287","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1765131,"uid":53133133,"title":"性感小布在线溜鬼，套人的汉子在线套人","uname":"小布菌丶","online":4987,"user_cover":"http://i0.hdslb.com/bfs/live/230edd35337010c492ba58e4ccab62b1fbafa6fe.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1765131.jpg?04091335","show_cover":"http://i0.hdslb.com/bfs/vc/73986cd04c677369249a8f0bdee75715b83cc584.jpg","link":"/1765131","face":"http://i2.hdslb.com/bfs/face/017592c6e64d38d06ca44de3c3717810c945432f.jpg","parent_id":3,"parent_name":"手游","area_id":98,"area_name":"其他手游","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://txy.live-play.acgvideo.com/live-txy/240555/live_53133133_2283403.flv?wsSecret=e29104c453cfc2eb210f4947be131a89&wsTime=1523254137","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":40270,"uid":8124053,"title":"第五人格】国服前10 今日有望","uname":"小Y_MRY","online":97622,"user_cover":"http://i0.hdslb.com/bfs/live/096cc89196d72f66d442b6821e9032ac7d1d19b7.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/40270.jpg?04091337","show_cover":false,"link":"/470","face":"http://i0.hdslb.com/bfs/face/c18c5c323c73ca2e38456c771a57176da317ac2c.jpg","parent_id":3,"parent_name":"手游","area_id":98,"area_name":"其他手游","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://116.207.118.14/live-bvc/144946/live_8124053_2461854.flv?expires=1523254137&ssig=ScD0GTEqXo0w8v1Glh_Ahg&oi=3059834287","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":26057,"uid":164627,"title":"【杆菌】第五人格，晚上航天！","uname":"杆菌无敌","online":42452,"user_cover":"http://i0.hdslb.com/bfs/live/3b7f754a5abf9e27dc48c53ce07ac856010f1017.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/26057.jpg?04091338","show_cover":false,"link":"/246","face":"http://i1.hdslb.com/bfs/face/6bbeb93dd72c60cb7ad2e876b241d0360d7f0d38.gif","parent_id":3,"parent_name":"手游","area_id":98,"area_name":"其他手游","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://116.207.118.14/live-bvc/490957/live_164627_2722814.flv?expires=1523254137&ssig=TPb6k_-XU62-gyxHCfxMuQ&oi=3059834287","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":3742025,"uid":93841264,"title":"二狗带你看懂王者荣耀","uname":"梦醒三生梦","online":38937,"user_cover":"http://i0.hdslb.com/bfs/live/ab776cf24e4dd2fd76f81b8661d64c2def6b9296.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/3742025.jpg?04091337","show_cover":false,"link":"/439","face":"http://i1.hdslb.com/bfs/face/b30b947c58c6b1011136621a3ab54c0031c920fe.jpg","parent_id":3,"parent_name":"手游","area_id":35,"area_name":"王者荣耀","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://116.207.118.13/live-bvc/185098/live_93841264_4272534.flv?expires=1523254137&ssig=gkq8ITy5NxqHoKaPCiiecw&oi=3059834287","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1235840,"uid":17853039,"title":"【刺激战场】噗通话....","uname":"音以结弦","online":6593,"user_cover":"http://i0.hdslb.com/bfs/live/6431928df0009455425e1b6ac2fd153241e60652.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1235840.jpg?04091336","show_cover":false,"link":"/1235840","face":"http://i0.hdslb.com/bfs/face/710fa55d70daf6bd11a6648da1f1c96925663434.jpg","parent_id":3,"parent_name":"手游","area_id":153,"area_name":"绝地求生：刺激战场","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://117.21.179.8/live-bvc/883341/live_17853039_5467330.flv?expires=1523254137&ssig=IspUfeGwpjzrIAJpoWWpGA&oi=3059834287","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""}]},{"partition":{"id":4,"name":"绘画","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/4_3x.png?201709151052","height":"63","width":"63"},"count":124},"lives":[{"roomid":491683,"uid":26633150,"title":"失踪人口回归","uname":"wlop-","online":27175,"user_cover":"http://i0.hdslb.com/bfs/live/32b39350b70e3e4422834eae947cde7bbc39508b.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/491683.jpg?04091336","show_cover":false,"link":"/597","face":"http://i0.hdslb.com/bfs/face/0acb122cfe2e1de1f33b5f3a96347ac40fbff880.jpg","parent_id":4,"parent_name":"绘画","area_id":51,"area_name":"原创绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://live-play.acgvideo.com/live/577/live_26633150_2634870.flv?wsSecret=26a693ca87d591063d541e6a6d7f9844&wsTime=5aa37d84","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":209462,"uid":503712,"title":"穿越西元3000后","uname":"小小作文","online":336,"user_cover":"http://i0.hdslb.com/bfs/live/9092c2d746fb556dfe2b7563ba22f00204a2bb96.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/209462.jpg?04091331","show_cover":false,"link":"/209462","face":"http://i0.hdslb.com/bfs/face/436691bfa02a0bf22362aa835b7bdf6b3e42790b.jpg","parent_id":4,"parent_name":"绘画","area_id":51,"area_name":"原创绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/347297/live_503712_2556310.flv?wsSecret=448060bd017f8eddb958fd242eed91bb&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":257200,"uid":22148077,"title":"基三帮派全家福【勾线勾到天荒地老】","uname":"这只是小晶","online":54,"user_cover":"http://i0.hdslb.com/bfs/live/5f14b88e2407a65fc5a4bd189d9503772479c09a.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/257200.jpg?04091331","show_cover":false,"link":"/257200","face":"http://i1.hdslb.com/bfs/face/696ab241369e4df288508a8c45c85bb8589a4809.jpg","parent_id":4,"parent_name":"绘画","area_id":94,"area_name":"同人绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://xl.live-play.acgvideo.com/live-xl/603318/live_22148077_8144478.flv?wsSecret=f04a9ad50adda88c4f642881445bca61&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":472538,"uid":35271215,"title":"【金鱼】寻前","uname":"PumpkinJakk-金鱼","online":483,"user_cover":"http://i0.hdslb.com/bfs/live/42d362167790ddd4aa311ac71e8a6767f7a9b20a.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/472538.jpg?04091338","show_cover":false,"link":"/472538","face":"http://i2.hdslb.com/bfs/face/ce8af5ba39f59dcd898ed59dbc26e9d0021a3ce1.jpg","parent_id":4,"parent_name":"绘画","area_id":51,"area_name":"原创绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/867952/live_35271215_8431452.flv?wsSecret=916321ef48c36f54e81a53742cfce96f&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":716562,"uid":1852141,"title":"女歌手直播画画了","uname":"椛空から☆","online":188,"user_cover":"http://i0.hdslb.com/bfs/live/747473396d3565c7bd0da5e866e64e3912bd1979.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/716562.jpg?04091338","show_cover":false,"link":"/716562","face":"http://i0.hdslb.com/bfs/face/bad0407e2bd92056dc443cf3a776ad5581a171d9.jpg","parent_id":4,"parent_name":"绘画","area_id":51,"area_name":"原创绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/152905/live_1852141_8791762.flv?wsSecret=ad75ae82023d64ccd73e4bdde80a9a8e&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":3986127,"uid":2704846,"title":"摸鱼【本人川普_(:з」∠)_慎入】","uname":"GreenEyedMoster","online":4,"user_cover":"http://i0.hdslb.com/bfs/live/f19cb9a3e956df3f6807e1750e12d41b6d3079de.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/3986127.jpg?04031711","show_cover":false,"link":"/3986127","face":"http://i1.hdslb.com/bfs/face/fd84eac512035786b34897384bc0064932a074b4.jpg","parent_id":4,"parent_name":"绘画","area_id":51,"area_name":"原创绘画","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://js.live-play.acgvideo.com/live-js/402406/live_2704846_2959246.flv?wsSecret=96936db613b5a07dcfa2cc5dc3cb9caa&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""}]}]
         * star_show : {"partition":{"id":999,"name":"颜值领域","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/-2_3x.png?201709151052","height":"63","width":"63"},"count":0,"hidden":0},"lives":[{"roomid":1064387,"uid":38053609,"title":"这UP主居然在直播间干这种事！","uname":"黄小圆cora","online":2033,"user_cover":"http://i0.hdslb.com/bfs/live/5fdc554aa0c4b488dc0d00c0f928945ee9d6457d.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1064387.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/9e48d32b18aa769b53821efef5981d1ac7ad23d9.jpg","link":"/1064387","face":"http://i0.hdslb.com/bfs/face/4f7643f53f04b069a286dad83edd98e873733d7a.jpg","parent_id":1,"parent_name":"娱乐","area_id":21,"area_name":"视频唱见","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/116452/live_38053609_2886317.flv?wsSecret=2785127315884e91145b3402b1a6ed89&wsTime=1523254132","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1236440,"uid":39634364,"title":"下午好，回家啦早点回学校哦|･ω･｀)","uname":"筱萱一直很帅","online":6,"user_cover":"http://i0.hdslb.com/bfs/live/1b22a906f360a46d7f4e7f6fe412acb3e1740bb6.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1236440.jpg?04082238","show_cover":"http://i0.hdslb.com/bfs/vc/79ed735bc9c3f1927069d8b5ce86719920c040d2.jpg","link":"/1236440","face":"http://i0.hdslb.com/bfs/face/89409b20487491d4e25b951de17581560fa4ea56.jpg","parent_id":1,"parent_name":"娱乐","area_id":32,"area_name":"手机直播","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://113.215.0.235/live-bvc/521286/live_39634364_7185438.flv?expires=1523254132&ssig=pgHrRlFC-8r_geIC19sJSw&oi=1909916181","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":1,"is_tv":0,"corner":"","pendent":""},{"roomid":3514612,"uid":8779497,"title":"可爱的是你~","uname":"一颗奶糖不加糖","online":4807,"user_cover":"http://i0.hdslb.com/bfs/live/9f6ca31debdc17f0eb41b424ff0ac018348ebc01.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/3514612.jpg?04091330","show_cover":"http://i0.hdslb.com/bfs/vc/b0cb8aabba7a0d371a3461cd5f201ccec52e4cd5.jpg","link":"/418","face":"http://i2.hdslb.com/bfs/face/a2ead6078e39d569b067453c06f21808df26d133.jpg","parent_id":1,"parent_name":"娱乐","area_id":139,"area_name":"美少女","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://xl.live-play.acgvideo.com/live-xl/411472/live_8779497_4295285.flv?wsSecret=2681b8ed2a3dff19e73288293f2dedb8&wsTime=1523254132","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":5666729,"uid":15658652,"title":"佛系少女开播啦","uname":"丫丫吃烧烤","online":553,"user_cover":"http://i0.hdslb.com/bfs/live/854e8c9e6238eb5cea2f5da5e9c9102f7fc0fbc2.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/5666729.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/3890b05d0e78c4c01c2abaf80adfb4a2d74a6ab4.jpg","link":"/5666729","face":"http://i0.hdslb.com/bfs/face/52745e30e9e082d729dd5201b746797baa0cfc14.jpg","parent_id":1,"parent_name":"娱乐","area_id":145,"area_name":"视频聊天","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://bvc.live-play.acgvideo.com/live-bvc/212507/live_15658652_8147305.flv?wsSecret=cfd3364c042e60314ba52cc1e9959c1e&wsTime=1523254132","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":1,"is_tv":0,"corner":"","pendent":""}]}
         * recommend_data : {"partition":{"id":0,"name":"推荐主播","area":"hot","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/-1_3x.png?201709151052","height":"63","width":"63"},"count":4807},"banner_data":[{"cover":{"src":"http://i0.hdslb.com/bfs/live/348fbbc30ca1578d900b44dda64acd1310b1d05e.png","height":180,"width":320},"title":"今天，你的小视频上榜了吗？","is_clip":1,"new_cover":{"src":"http://i0.hdslb.com/bfs/live/b6ac78b2ad96cdc9a4d59719b1f8b3b8d1893e6d.jpg","height":180,"width":320},"new_title":"B站大触竟然都在这里？？？","new_router":"http://h.bilibili.com/ywh/h5/index"}],"lives":[{"owner":{"face":"http://i2.hdslb.com/bfs/face/a2ead6078e39d569b067453c06f21808df26d133.jpg","mid":8779497,"name":"一颗奶糖不加糖"},"cover":{"src":"http://i0.hdslb.com/bfs/live/9f6ca31debdc17f0eb41b424ff0ac018348ebc01.jpg","height":180,"width":320},"room_id":3514612,"check_version":0,"online":4807,"area":"生活娱乐","area_id":6,"title":"可爱的是你~","playurl":"http://xl.live-play.acgvideo.com/live-xl/462734/live_8779497_4295285.flv?wsSecret=53f952f128412552f37158cc3db109e4&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":139,"area_v2_name":"美少女","area_v2_parent_id":1,"area_v2_parent_name":"娱乐"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/ea5235b1c9d9ce2604c37bcef2c0ef965d3b5589.jpg","mid":10404286,"name":"红发杰克丶"},"cover":{"src":"http://i0.hdslb.com/bfs/live/771bd280cc478e2816ff0d4dbd66c3e6709d6cc8.jpg","height":180,"width":320},"room_id":34180,"check_version":0,"online":14265,"area":"单机联机","area_id":1,"title":"第五人格了解一下","playurl":"http://qn.live-play.acgvideo.com/live-qn/869044/live_10404286_9705271.flv?wsSecret=42609ad2a76d7448cb24657de126ffc3&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":107,"area_v2_name":"其他游戏","area_v2_parent_id":2,"area_v2_parent_name":"游戏"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/58c7bc8dbea06339f5597aa6c21da60f9841da73.jpg","mid":15285559,"name":"JTG_LuuuuuYa"},"cover":{"src":"http://i0.hdslb.com/bfs/live/c7669d361469c3920786b3b02519da8c4d3f868c.jpg","height":180,"width":320},"room_id":4906471,"check_version":0,"online":756,"area":"单机联机","area_id":1,"title":"【JTG】单排的沉默者~~","playurl":"http://qn.live-play.acgvideo.com/live-qn/229911/live_15285559_5325603.flv?wsSecret=c31122ed6d3f6000dbdd4166a749fd60&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":80,"area_v2_name":"绝地求生","area_v2_parent_id":2,"area_v2_parent_name":"游戏","data_behavior_id":"b0a4a406be012f3:b0a4a406be012f3:0:0","data_source_id":"system"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/ffd4493e53b3da7184b35df9d933ed11ee16a650.jpg","mid":1111078,"name":"明希kirara"},"cover":{"src":"http://i0.hdslb.com/bfs/live/e0386841fd0ab9ebdf7dd5e296be2c1fe3d019a3.jpg","height":180,"width":320},"room_id":22361,"check_version":0,"online":5859,"area":"手游直播","area_id":12,"title":"❤️感冒就应该在床上玩手机❤️","playurl":"http://qn.live-play.acgvideo.com/live-qn/917416/live_1111078_4132556.flv?wsSecret=d8e631f34299ca63f12aebf103a90d51&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":98,"area_v2_name":"其他手游","area_v2_parent_id":3,"area_v2_parent_name":"手游"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/026c8fce3b441c29b1c0dfe0088479a0e091d796.jpg","mid":139525612,"name":"艾斯德斯-"},"cover":{"src":"http://i0.hdslb.com/bfs/live/7748ff1bd82df367123e6d71118ef8c08f0fba22.jpg","height":180,"width":320},"room_id":9615862,"check_version":0,"online":533,"area":"生活娱乐","area_id":6,"title":"尬聊主播，了解一下？","playurl":"http://qn.live-play.acgvideo.com/live-qn/386876/live_139525612_1830356.flv?wsSecret=8f2941a7962daf92e01530b33bb1ae97&wsTime=1523254140","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":145,"area_v2_name":"视频聊天","area_v2_parent_id":1,"area_v2_parent_name":"娱乐","data_behavior_id":"b0a4a406be012f3:b0a4a406be012f3:0:0","data_source_id":"system"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/52745e30e9e082d729dd5201b746797baa0cfc14.jpg","mid":15658652,"name":"丫丫吃烧烤"},"cover":{"src":"http://i0.hdslb.com/bfs/live/854e8c9e6238eb5cea2f5da5e9c9102f7fc0fbc2.jpg","height":180,"width":320},"room_id":5666729,"check_version":0,"online":553,"area":"生活娱乐","area_id":6,"title":"佛系少女开播啦","playurl":"http://qn.live-play.acgvideo.com/live-qn/283083/live_15658652_8147305.flv?wsSecret=b608aee31306bf9b352f9c239b4429ed&wsTime=1523254141","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":145,"area_v2_name":"视频聊天","area_v2_parent_id":1,"area_v2_parent_name":"娱乐","data_behavior_id":"b0a4a406be012f3:b0a4a406be012f3:0:0","data_source_id":"system"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/77eace3224317552a01d07d053f526e84822d445.jpg","mid":3098936,"name":"SUYI喝奶奶"},"cover":{"src":"http://i0.hdslb.com/bfs/live/0a6004c7d2da7328c933dc889ab3bab7d3ffecca.jpg","height":180,"width":320},"room_id":45827,"check_version":0,"online":5407,"area":"唱见舞见","area_id":10,"title":"【SUYI奶茶店】","playurl":"http://txy.live-play.acgvideo.com/live-txy/290623/live_3098936_1279639.flv?wsSecret=4e567b23073417d676a2331b42e8ab32&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":21,"area_v2_name":"视频唱见","area_v2_parent_id":1,"area_v2_parent_name":"娱乐"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/c18c5c323c73ca2e38456c771a57176da317ac2c.jpg","mid":8124053,"name":"小Y_MRY"},"cover":{"src":"http://i0.hdslb.com/bfs/live/096cc89196d72f66d442b6821e9032ac7d1d19b7.jpg","height":180,"width":320},"room_id":40270,"check_version":0,"online":97622,"area":"手游直播","area_id":12,"title":"第五人格】国服前10 今日有望","playurl":"http://live-play.acgvideo.com/live/309/live_8124053_2461854.flv?wsSecret=b75e56c08af00de542d70604f4372fa4&wsTime=5aa37d82","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":98,"area_v2_name":"其他手游","area_v2_parent_id":3,"area_v2_parent_name":"手游"},{"owner":{"face":"http://i2.hdslb.com/bfs/face/fe78c7eac5ba243d8e6bb266e1ffb9a4a88935c4.jpg","mid":331520,"name":"yuki琥珀"},"cover":{"src":"http://i0.hdslb.com/bfs/live/7266d1cf712e8577f0abdc5e62b08ec616221ba4.jpg","height":180,"width":320},"room_id":10248,"check_version":0,"online":5225,"area":"单机联机","area_id":1,"title":"咸鱼时间","playurl":"http://qn.live-play.acgvideo.com/live-qn/631977/live_331520_2095558.flv?wsSecret=b30c083e472dc096f2d56d9e2ac386f6&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":107,"area_v2_name":"其他游戏","area_v2_parent_id":2,"area_v2_parent_name":"游戏"},{"owner":{"face":"http://i2.hdslb.com/bfs/face/5cbdda2278f02d1410ff5bc5c1d25a22214a8af8.jpg","mid":4705522,"name":"沙拉Azusa"},"cover":{"src":"http://i0.hdslb.com/bfs/vc/a621e11a2c34663e7ffc3a229f4cb088b0b1f8b7.jpg","height":180,"width":320},"room_id":933508,"check_version":0,"online":22735,"area":"单机联机","area_id":1,"title":"我就偷偷玩一会啦啦啦啦~~~","playurl":"http://qn.live-play.acgvideo.com/live-qn/839546/live_4705522_7251458.flv?wsSecret=09196d2045524137d80d935ecc709274&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":80,"area_v2_name":"绝地求生","area_v2_parent_id":2,"area_v2_parent_name":"游戏"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/c489cebbd9cb5902b950ca819ab1980d3fd49f5c.jpg","mid":1597982,"name":"Richard_Price"},"cover":{"src":"http://i0.hdslb.com/bfs/live/c46554cb778ac9941bf39e4771ff75c944f60e39.jpg","height":180,"width":320},"room_id":869069,"check_version":0,"online":3750,"area":"御宅文化","area_id":2,"title":"【戴耳机】晚安，北美","playurl":"http://live-play.acgvideo.com/live/443/live_1597982_9114881.flv?wsSecret=54860b21a05cdc9b63be00bc2552473f&wsTime=5aa37d82","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":30,"area_v2_name":"视频ASMR ","area_v2_parent_id":1,"area_v2_parent_name":"娱乐"},{"owner":{"face":"http://i2.hdslb.com/bfs/face/1efee088daeda80d473a5dfb77e05aaacb79d9fd.jpg","mid":4578433,"name":"老骚豆腐"},"cover":{"src":"http://i0.hdslb.com/bfs/live/14f0bc7d87b07094fed2f9be2737496e90853d22.jpg","height":180,"width":320},"room_id":763679,"check_version":0,"online":1440,"area":"手游直播","area_id":12,"title":"【豆腐】第五人格！只会秀！","playurl":"http://qn.live-play.acgvideo.com/live-qn/467682/live_4578433_9339544.flv?wsSecret=a28db0eae61b3ba12d5fa6c6034c665a&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":98,"area_v2_name":"其他手游","area_v2_parent_id":3,"area_v2_parent_name":"手游"}]}
         */

        private StarShowBean star_show;
        private RecommendDataBean recommend_data;
        private List<BannerBean> banner;
        private List<EntranceIconsBean> entranceIcons;
        private List<PartitionsBean> partitions;

        public StarShowBean getStar_show() {
            return star_show;
        }

        public void setStar_show(StarShowBean star_show) {
            this.star_show = star_show;
        }

        public RecommendDataBean getRecommend_data() {
            return recommend_data;
        }

        public void setRecommend_data(RecommendDataBean recommend_data) {
            this.recommend_data = recommend_data;
        }

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<EntranceIconsBean> getEntranceIcons() {
            return entranceIcons;
        }

        public void setEntranceIcons(List<EntranceIconsBean> entranceIcons) {
            this.entranceIcons = entranceIcons;
        }

        public List<PartitionsBean> getPartitions() {
            return partitions;
        }

        public void setPartitions(List<PartitionsBean> partitions) {
            this.partitions = partitions;
        }

        public static class StarShowBean {
            /**
             * partition : {"id":999,"name":"颜值领域","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/-2_3x.png?201709151052","height":"63","width":"63"},"count":0,"hidden":0}
             * lives : [{"roomid":1064387,"uid":38053609,"title":"这UP主居然在直播间干这种事！","uname":"黄小圆cora","online":2033,"user_cover":"http://i0.hdslb.com/bfs/live/5fdc554aa0c4b488dc0d00c0f928945ee9d6457d.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1064387.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/9e48d32b18aa769b53821efef5981d1ac7ad23d9.jpg","link":"/1064387","face":"http://i0.hdslb.com/bfs/face/4f7643f53f04b069a286dad83edd98e873733d7a.jpg","parent_id":1,"parent_name":"娱乐","area_id":21,"area_name":"视频唱见","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/116452/live_38053609_2886317.flv?wsSecret=2785127315884e91145b3402b1a6ed89&wsTime=1523254132","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1236440,"uid":39634364,"title":"下午好，回家啦早点回学校哦|･ω･｀)","uname":"筱萱一直很帅","online":6,"user_cover":"http://i0.hdslb.com/bfs/live/1b22a906f360a46d7f4e7f6fe412acb3e1740bb6.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1236440.jpg?04082238","show_cover":"http://i0.hdslb.com/bfs/vc/79ed735bc9c3f1927069d8b5ce86719920c040d2.jpg","link":"/1236440","face":"http://i0.hdslb.com/bfs/face/89409b20487491d4e25b951de17581560fa4ea56.jpg","parent_id":1,"parent_name":"娱乐","area_id":32,"area_name":"手机直播","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://113.215.0.235/live-bvc/521286/live_39634364_7185438.flv?expires=1523254132&ssig=pgHrRlFC-8r_geIC19sJSw&oi=1909916181","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":1,"is_tv":0,"corner":"","pendent":""},{"roomid":3514612,"uid":8779497,"title":"可爱的是你~","uname":"一颗奶糖不加糖","online":4807,"user_cover":"http://i0.hdslb.com/bfs/live/9f6ca31debdc17f0eb41b424ff0ac018348ebc01.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/3514612.jpg?04091330","show_cover":"http://i0.hdslb.com/bfs/vc/b0cb8aabba7a0d371a3461cd5f201ccec52e4cd5.jpg","link":"/418","face":"http://i2.hdslb.com/bfs/face/a2ead6078e39d569b067453c06f21808df26d133.jpg","parent_id":1,"parent_name":"娱乐","area_id":139,"area_name":"美少女","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://xl.live-play.acgvideo.com/live-xl/411472/live_8779497_4295285.flv?wsSecret=2681b8ed2a3dff19e73288293f2dedb8&wsTime=1523254132","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":5666729,"uid":15658652,"title":"佛系少女开播啦","uname":"丫丫吃烧烤","online":553,"user_cover":"http://i0.hdslb.com/bfs/live/854e8c9e6238eb5cea2f5da5e9c9102f7fc0fbc2.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/5666729.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/3890b05d0e78c4c01c2abaf80adfb4a2d74a6ab4.jpg","link":"/5666729","face":"http://i0.hdslb.com/bfs/face/52745e30e9e082d729dd5201b746797baa0cfc14.jpg","parent_id":1,"parent_name":"娱乐","area_id":145,"area_name":"视频聊天","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://bvc.live-play.acgvideo.com/live-bvc/212507/live_15658652_8147305.flv?wsSecret=cfd3364c042e60314ba52cc1e9959c1e&wsTime=1523254132","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":1,"is_tv":0,"corner":"","pendent":""}]
             */

            private PartitionBean partition;
            private List<LivesBean> lives;

            public PartitionBean getPartition() {
                return partition;
            }

            public void setPartition(PartitionBean partition) {
                this.partition = partition;
            }

            public List<LivesBean> getLives() {
                return lives;
            }

            public void setLives(List<LivesBean> lives) {
                this.lives = lives;
            }

            public static class PartitionBean {
                /**
                 * id : 999
                 * name : 颜值领域
                 * sub_icon : {"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/-2_3x.png?201709151052","height":"63","width":"63"}
                 * count : 0
                 * hidden : 0
                 */

                private int id;
                private String name;
                private SubIconBean sub_icon;
                private int count;
                private int hidden;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public SubIconBean getSub_icon() {
                    return sub_icon;
                }

                public void setSub_icon(SubIconBean sub_icon) {
                    this.sub_icon = sub_icon;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getHidden() {
                    return hidden;
                }

                public void setHidden(int hidden) {
                    this.hidden = hidden;
                }

                public static class SubIconBean {
                    /**
                     * src : http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/-2_3x.png?201709151052
                     * height : 63
                     * width : 63
                     */

                    private String src;
                    private String height;
                    private String width;

                    public String getSrc() {
                        return src;
                    }

                    public void setSrc(String src) {
                        this.src = src;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }
                }
            }

            public static class LivesBean {
                /**
                 * roomid : 1064387
                 * uid : 38053609
                 * title : 这UP主居然在直播间干这种事！
                 * uname : 黄小圆cora
                 * online : 2033
                 * user_cover : http://i0.hdslb.com/bfs/live/5fdc554aa0c4b488dc0d00c0f928945ee9d6457d.jpg
                 * user_cover_flag : 1
                 * system_cover : http://i0.hdslb.com/bfs/live/1064387.jpg?04091331
                 * show_cover : http://i0.hdslb.com/bfs/vc/9e48d32b18aa769b53821efef5981d1ac7ad23d9.jpg
                 * link : /1064387
                 * face : http://i0.hdslb.com/bfs/face/4f7643f53f04b069a286dad83edd98e873733d7a.jpg
                 * parent_id : 1
                 * parent_name : 娱乐
                 * area_id : 21
                 * area_name : 视频唱见
                 * web_pendent :
                 * cover_size : {"height":180,"width":320}
                 * play_url : http://qn.live-play.acgvideo.com/live-qn/116452/live_38053609_2886317.flv?wsSecret=2785127315884e91145b3402b1a6ed89&wsTime=1523254132
                 * accept_quality_v2 : [4]
                 * current_quality : 0
                 * accept_quality : 4
                 * broadcast_type : 0
                 * is_tv : 0
                 * corner :
                 * pendent :
                 */

                private int roomid;
                private int uid;
                private String title;
                private String uname;
                private int online;
                private String user_cover;
                private int user_cover_flag;
                private String system_cover;
                private String show_cover;
                private String link;
                private String face;
                private int parent_id;
                private String parent_name;
                private int area_id;
                private String area_name;
                private String web_pendent;
                private CoverSizeBean cover_size;
                private String play_url;
                private int current_quality;
                private String accept_quality;
                private int broadcast_type;
                private int is_tv;
                private String corner;
                private String pendent;
                private List<Integer> accept_quality_v2;

                public int getRoomid() {
                    return roomid;
                }

                public void setRoomid(int roomid) {
                    this.roomid = roomid;
                }

                public int getUid() {
                    return uid;
                }

                public void setUid(int uid) {
                    this.uid = uid;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUname() {
                    return uname;
                }

                public void setUname(String uname) {
                    this.uname = uname;
                }

                public int getOnline() {
                    return online;
                }

                public void setOnline(int online) {
                    this.online = online;
                }

                public String getUser_cover() {
                    return user_cover;
                }

                public void setUser_cover(String user_cover) {
                    this.user_cover = user_cover;
                }

                public int getUser_cover_flag() {
                    return user_cover_flag;
                }

                public void setUser_cover_flag(int user_cover_flag) {
                    this.user_cover_flag = user_cover_flag;
                }

                public String getSystem_cover() {
                    return system_cover;
                }

                public void setSystem_cover(String system_cover) {
                    this.system_cover = system_cover;
                }

                public String getShow_cover() {
                    return show_cover;
                }

                public void setShow_cover(String show_cover) {
                    this.show_cover = show_cover;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getFace() {
                    return face;
                }

                public void setFace(String face) {
                    this.face = face;
                }

                public int getParent_id() {
                    return parent_id;
                }

                public void setParent_id(int parent_id) {
                    this.parent_id = parent_id;
                }

                public String getParent_name() {
                    return parent_name;
                }

                public void setParent_name(String parent_name) {
                    this.parent_name = parent_name;
                }

                public int getArea_id() {
                    return area_id;
                }

                public void setArea_id(int area_id) {
                    this.area_id = area_id;
                }

                public String getArea_name() {
                    return area_name;
                }

                public void setArea_name(String area_name) {
                    this.area_name = area_name;
                }

                public String getWeb_pendent() {
                    return web_pendent;
                }

                public void setWeb_pendent(String web_pendent) {
                    this.web_pendent = web_pendent;
                }

                public CoverSizeBean getCover_size() {
                    return cover_size;
                }

                public void setCover_size(CoverSizeBean cover_size) {
                    this.cover_size = cover_size;
                }

                public String getPlay_url() {
                    return play_url;
                }

                public void setPlay_url(String play_url) {
                    this.play_url = play_url;
                }

                public int getCurrent_quality() {
                    return current_quality;
                }

                public void setCurrent_quality(int current_quality) {
                    this.current_quality = current_quality;
                }

                public String getAccept_quality() {
                    return accept_quality;
                }

                public void setAccept_quality(String accept_quality) {
                    this.accept_quality = accept_quality;
                }

                public int getBroadcast_type() {
                    return broadcast_type;
                }

                public void setBroadcast_type(int broadcast_type) {
                    this.broadcast_type = broadcast_type;
                }

                public int getIs_tv() {
                    return is_tv;
                }

                public void setIs_tv(int is_tv) {
                    this.is_tv = is_tv;
                }

                public String getCorner() {
                    return corner;
                }

                public void setCorner(String corner) {
                    this.corner = corner;
                }

                public String getPendent() {
                    return pendent;
                }

                public void setPendent(String pendent) {
                    this.pendent = pendent;
                }

                public List<Integer> getAccept_quality_v2() {
                    return accept_quality_v2;
                }

                public void setAccept_quality_v2(List<Integer> accept_quality_v2) {
                    this.accept_quality_v2 = accept_quality_v2;
                }

                public static class CoverSizeBean {
                    /**
                     * height : 180
                     * width : 320
                     */

                    private int height;
                    private int width;

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }
                }
            }
        }

        public static class RecommendDataBean {
            /**
             * partition : {"id":0,"name":"推荐主播","area":"hot","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/-1_3x.png?201709151052","height":"63","width":"63"},"count":4807}
             * banner_data : [{"cover":{"src":"http://i0.hdslb.com/bfs/live/348fbbc30ca1578d900b44dda64acd1310b1d05e.png","height":180,"width":320},"title":"今天，你的小视频上榜了吗？","is_clip":1,"new_cover":{"src":"http://i0.hdslb.com/bfs/live/b6ac78b2ad96cdc9a4d59719b1f8b3b8d1893e6d.jpg","height":180,"width":320},"new_title":"B站大触竟然都在这里？？？","new_router":"http://h.bilibili.com/ywh/h5/index"}]
             * lives : [{"owner":{"face":"http://i2.hdslb.com/bfs/face/a2ead6078e39d569b067453c06f21808df26d133.jpg","mid":8779497,"name":"一颗奶糖不加糖"},"cover":{"src":"http://i0.hdslb.com/bfs/live/9f6ca31debdc17f0eb41b424ff0ac018348ebc01.jpg","height":180,"width":320},"room_id":3514612,"check_version":0,"online":4807,"area":"生活娱乐","area_id":6,"title":"可爱的是你~","playurl":"http://xl.live-play.acgvideo.com/live-xl/462734/live_8779497_4295285.flv?wsSecret=53f952f128412552f37158cc3db109e4&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":139,"area_v2_name":"美少女","area_v2_parent_id":1,"area_v2_parent_name":"娱乐"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/ea5235b1c9d9ce2604c37bcef2c0ef965d3b5589.jpg","mid":10404286,"name":"红发杰克丶"},"cover":{"src":"http://i0.hdslb.com/bfs/live/771bd280cc478e2816ff0d4dbd66c3e6709d6cc8.jpg","height":180,"width":320},"room_id":34180,"check_version":0,"online":14265,"area":"单机联机","area_id":1,"title":"第五人格了解一下","playurl":"http://qn.live-play.acgvideo.com/live-qn/869044/live_10404286_9705271.flv?wsSecret=42609ad2a76d7448cb24657de126ffc3&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":107,"area_v2_name":"其他游戏","area_v2_parent_id":2,"area_v2_parent_name":"游戏"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/58c7bc8dbea06339f5597aa6c21da60f9841da73.jpg","mid":15285559,"name":"JTG_LuuuuuYa"},"cover":{"src":"http://i0.hdslb.com/bfs/live/c7669d361469c3920786b3b02519da8c4d3f868c.jpg","height":180,"width":320},"room_id":4906471,"check_version":0,"online":756,"area":"单机联机","area_id":1,"title":"【JTG】单排的沉默者~~","playurl":"http://qn.live-play.acgvideo.com/live-qn/229911/live_15285559_5325603.flv?wsSecret=c31122ed6d3f6000dbdd4166a749fd60&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":80,"area_v2_name":"绝地求生","area_v2_parent_id":2,"area_v2_parent_name":"游戏","data_behavior_id":"b0a4a406be012f3:b0a4a406be012f3:0:0","data_source_id":"system"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/ffd4493e53b3da7184b35df9d933ed11ee16a650.jpg","mid":1111078,"name":"明希kirara"},"cover":{"src":"http://i0.hdslb.com/bfs/live/e0386841fd0ab9ebdf7dd5e296be2c1fe3d019a3.jpg","height":180,"width":320},"room_id":22361,"check_version":0,"online":5859,"area":"手游直播","area_id":12,"title":"❤️感冒就应该在床上玩手机❤️","playurl":"http://qn.live-play.acgvideo.com/live-qn/917416/live_1111078_4132556.flv?wsSecret=d8e631f34299ca63f12aebf103a90d51&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":98,"area_v2_name":"其他手游","area_v2_parent_id":3,"area_v2_parent_name":"手游"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/026c8fce3b441c29b1c0dfe0088479a0e091d796.jpg","mid":139525612,"name":"艾斯德斯-"},"cover":{"src":"http://i0.hdslb.com/bfs/live/7748ff1bd82df367123e6d71118ef8c08f0fba22.jpg","height":180,"width":320},"room_id":9615862,"check_version":0,"online":533,"area":"生活娱乐","area_id":6,"title":"尬聊主播，了解一下？","playurl":"http://qn.live-play.acgvideo.com/live-qn/386876/live_139525612_1830356.flv?wsSecret=8f2941a7962daf92e01530b33bb1ae97&wsTime=1523254140","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":145,"area_v2_name":"视频聊天","area_v2_parent_id":1,"area_v2_parent_name":"娱乐","data_behavior_id":"b0a4a406be012f3:b0a4a406be012f3:0:0","data_source_id":"system"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/52745e30e9e082d729dd5201b746797baa0cfc14.jpg","mid":15658652,"name":"丫丫吃烧烤"},"cover":{"src":"http://i0.hdslb.com/bfs/live/854e8c9e6238eb5cea2f5da5e9c9102f7fc0fbc2.jpg","height":180,"width":320},"room_id":5666729,"check_version":0,"online":553,"area":"生活娱乐","area_id":6,"title":"佛系少女开播啦","playurl":"http://qn.live-play.acgvideo.com/live-qn/283083/live_15658652_8147305.flv?wsSecret=b608aee31306bf9b352f9c239b4429ed&wsTime=1523254141","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":145,"area_v2_name":"视频聊天","area_v2_parent_id":1,"area_v2_parent_name":"娱乐","data_behavior_id":"b0a4a406be012f3:b0a4a406be012f3:0:0","data_source_id":"system"},{"owner":{"face":"http://i1.hdslb.com/bfs/face/77eace3224317552a01d07d053f526e84822d445.jpg","mid":3098936,"name":"SUYI喝奶奶"},"cover":{"src":"http://i0.hdslb.com/bfs/live/0a6004c7d2da7328c933dc889ab3bab7d3ffecca.jpg","height":180,"width":320},"room_id":45827,"check_version":0,"online":5407,"area":"唱见舞见","area_id":10,"title":"【SUYI奶茶店】","playurl":"http://txy.live-play.acgvideo.com/live-txy/290623/live_3098936_1279639.flv?wsSecret=4e567b23073417d676a2331b42e8ab32&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":21,"area_v2_name":"视频唱见","area_v2_parent_id":1,"area_v2_parent_name":"娱乐"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/c18c5c323c73ca2e38456c771a57176da317ac2c.jpg","mid":8124053,"name":"小Y_MRY"},"cover":{"src":"http://i0.hdslb.com/bfs/live/096cc89196d72f66d442b6821e9032ac7d1d19b7.jpg","height":180,"width":320},"room_id":40270,"check_version":0,"online":97622,"area":"手游直播","area_id":12,"title":"第五人格】国服前10 今日有望","playurl":"http://live-play.acgvideo.com/live/309/live_8124053_2461854.flv?wsSecret=b75e56c08af00de542d70604f4372fa4&wsTime=5aa37d82","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":98,"area_v2_name":"其他手游","area_v2_parent_id":3,"area_v2_parent_name":"手游"},{"owner":{"face":"http://i2.hdslb.com/bfs/face/fe78c7eac5ba243d8e6bb266e1ffb9a4a88935c4.jpg","mid":331520,"name":"yuki琥珀"},"cover":{"src":"http://i0.hdslb.com/bfs/live/7266d1cf712e8577f0abdc5e62b08ec616221ba4.jpg","height":180,"width":320},"room_id":10248,"check_version":0,"online":5225,"area":"单机联机","area_id":1,"title":"咸鱼时间","playurl":"http://qn.live-play.acgvideo.com/live-qn/631977/live_331520_2095558.flv?wsSecret=b30c083e472dc096f2d56d9e2ac386f6&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":107,"area_v2_name":"其他游戏","area_v2_parent_id":2,"area_v2_parent_name":"游戏"},{"owner":{"face":"http://i2.hdslb.com/bfs/face/5cbdda2278f02d1410ff5bc5c1d25a22214a8af8.jpg","mid":4705522,"name":"沙拉Azusa"},"cover":{"src":"http://i0.hdslb.com/bfs/vc/a621e11a2c34663e7ffc3a229f4cb088b0b1f8b7.jpg","height":180,"width":320},"room_id":933508,"check_version":0,"online":22735,"area":"单机联机","area_id":1,"title":"我就偷偷玩一会啦啦啦啦~~~","playurl":"http://qn.live-play.acgvideo.com/live-qn/839546/live_4705522_7251458.flv?wsSecret=09196d2045524137d80d935ecc709274&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":80,"area_v2_name":"绝地求生","area_v2_parent_id":2,"area_v2_parent_name":"游戏"},{"owner":{"face":"http://i0.hdslb.com/bfs/face/c489cebbd9cb5902b950ca819ab1980d3fd49f5c.jpg","mid":1597982,"name":"Richard_Price"},"cover":{"src":"http://i0.hdslb.com/bfs/live/c46554cb778ac9941bf39e4771ff75c944f60e39.jpg","height":180,"width":320},"room_id":869069,"check_version":0,"online":3750,"area":"御宅文化","area_id":2,"title":"【戴耳机】晚安，北美","playurl":"http://live-play.acgvideo.com/live/443/live_1597982_9114881.flv?wsSecret=54860b21a05cdc9b63be00bc2552473f&wsTime=5aa37d82","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":30,"area_v2_name":"视频ASMR ","area_v2_parent_id":1,"area_v2_parent_name":"娱乐"},{"owner":{"face":"http://i2.hdslb.com/bfs/face/1efee088daeda80d473a5dfb77e05aaacb79d9fd.jpg","mid":4578433,"name":"老骚豆腐"},"cover":{"src":"http://i0.hdslb.com/bfs/live/14f0bc7d87b07094fed2f9be2737496e90853d22.jpg","height":180,"width":320},"room_id":763679,"check_version":0,"online":1440,"area":"手游直播","area_id":12,"title":"【豆腐】第五人格！只会秀！","playurl":"http://qn.live-play.acgvideo.com/live-qn/467682/live_4578433_9339544.flv?wsSecret=a28db0eae61b3ba12d5fa6c6034c665a&wsTime=1523254138","accept_quality_v2":[],"current_quality":4,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":"","area_v2_id":98,"area_v2_name":"其他手游","area_v2_parent_id":3,"area_v2_parent_name":"手游"}]
             */

            private PartitionBeanX partition;
            private List<BannerDataBean> banner_data;
            private List<LivesBeanX> lives;

            public PartitionBeanX getPartition() {
                return partition;
            }

            public void setPartition(PartitionBeanX partition) {
                this.partition = partition;
            }

            public List<BannerDataBean> getBanner_data() {
                return banner_data;
            }

            public void setBanner_data(List<BannerDataBean> banner_data) {
                this.banner_data = banner_data;
            }

            public List<LivesBeanX> getLives() {
                return lives;
            }

            public void setLives(List<LivesBeanX> lives) {
                this.lives = lives;
            }

            public static class PartitionBeanX {
                /**
                 * id : 0
                 * name : 推荐主播
                 * area : hot
                 * sub_icon : {"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/-1_3x.png?201709151052","height":"63","width":"63"}
                 * count : 4807
                 */

                private int id;
                private String name;
                private String area;
                private SubIconBeanX sub_icon;
                private int count;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getArea() {
                    return area;
                }

                public void setArea(String area) {
                    this.area = area;
                }

                public SubIconBeanX getSub_icon() {
                    return sub_icon;
                }

                public void setSub_icon(SubIconBeanX sub_icon) {
                    this.sub_icon = sub_icon;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public static class SubIconBeanX {
                    /**
                     * src : http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/-1_3x.png?201709151052
                     * height : 63
                     * width : 63
                     */

                    private String src;
                    private String height;
                    private String width;

                    public String getSrc() {
                        return src;
                    }

                    public void setSrc(String src) {
                        this.src = src;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }
                }
            }

            public static class BannerDataBean {
                /**
                 * cover : {"src":"http://i0.hdslb.com/bfs/live/348fbbc30ca1578d900b44dda64acd1310b1d05e.png","height":180,"width":320}
                 * title : 今天，你的小视频上榜了吗？
                 * is_clip : 1
                 * new_cover : {"src":"http://i0.hdslb.com/bfs/live/b6ac78b2ad96cdc9a4d59719b1f8b3b8d1893e6d.jpg","height":180,"width":320}
                 * new_title : B站大触竟然都在这里？？？
                 * new_router : http://h.bilibili.com/ywh/h5/index
                 */

                private CoverBean cover;
                private String title;
                private int is_clip;
                private NewCoverBean new_cover;
                private String new_title;
                private String new_router;

                public CoverBean getCover() {
                    return cover;
                }

                public void setCover(CoverBean cover) {
                    this.cover = cover;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getIs_clip() {
                    return is_clip;
                }

                public void setIs_clip(int is_clip) {
                    this.is_clip = is_clip;
                }

                public NewCoverBean getNew_cover() {
                    return new_cover;
                }

                public void setNew_cover(NewCoverBean new_cover) {
                    this.new_cover = new_cover;
                }

                public String getNew_title() {
                    return new_title;
                }

                public void setNew_title(String new_title) {
                    this.new_title = new_title;
                }

                public String getNew_router() {
                    return new_router;
                }

                public void setNew_router(String new_router) {
                    this.new_router = new_router;
                }

                public static class CoverBean {
                    /**
                     * src : http://i0.hdslb.com/bfs/live/348fbbc30ca1578d900b44dda64acd1310b1d05e.png
                     * height : 180
                     * width : 320
                     */

                    private String src;
                    private int height;
                    private int width;

                    public String getSrc() {
                        return src;
                    }

                    public void setSrc(String src) {
                        this.src = src;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }
                }

                public static class NewCoverBean {
                    /**
                     * src : http://i0.hdslb.com/bfs/live/b6ac78b2ad96cdc9a4d59719b1f8b3b8d1893e6d.jpg
                     * height : 180
                     * width : 320
                     */

                    private String src;
                    private int height;
                    private int width;

                    public String getSrc() {
                        return src;
                    }

                    public void setSrc(String src) {
                        this.src = src;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }
                }
            }

            public static class LivesBeanX {
                /**
                 * owner : {"face":"http://i2.hdslb.com/bfs/face/a2ead6078e39d569b067453c06f21808df26d133.jpg","mid":8779497,"name":"一颗奶糖不加糖"}
                 * cover : {"src":"http://i0.hdslb.com/bfs/live/9f6ca31debdc17f0eb41b424ff0ac018348ebc01.jpg","height":180,"width":320}
                 * room_id : 3514612
                 * check_version : 0
                 * online : 4807
                 * area : 生活娱乐
                 * area_id : 6
                 * title : 可爱的是你~
                 * playurl : http://xl.live-play.acgvideo.com/live-xl/462734/live_8779497_4295285.flv?wsSecret=53f952f128412552f37158cc3db109e4&wsTime=1523254138
                 * accept_quality_v2 : []
                 * current_quality : 4
                 * accept_quality : 4
                 * broadcast_type : 0
                 * is_tv : 0
                 * corner :
                 * pendent :
                 * area_v2_id : 139
                 * area_v2_name : 美少女
                 * area_v2_parent_id : 1
                 * area_v2_parent_name : 娱乐
                 * data_behavior_id : b0a4a406be012f3:b0a4a406be012f3:0:0
                 * data_source_id : system
                 */

                private OwnerBean owner;
                private CoverBeanX cover;
                private int room_id;
                private int check_version;
                private int online;
                private String area;
                private int area_id;
                private String title;
                private String playurl;
                private int current_quality;
                private String accept_quality;
                private int broadcast_type;
                private int is_tv;
                private String corner;
                private String pendent;
                private int area_v2_id;
                private String area_v2_name;
                private int area_v2_parent_id;
                private String area_v2_parent_name;
                private String data_behavior_id;
                private String data_source_id;
                private List<?> accept_quality_v2;

                public OwnerBean getOwner() {
                    return owner;
                }

                public void setOwner(OwnerBean owner) {
                    this.owner = owner;
                }

                public CoverBeanX getCover() {
                    return cover;
                }

                public void setCover(CoverBeanX cover) {
                    this.cover = cover;
                }

                public int getRoom_id() {
                    return room_id;
                }

                public void setRoom_id(int room_id) {
                    this.room_id = room_id;
                }

                public int getCheck_version() {
                    return check_version;
                }

                public void setCheck_version(int check_version) {
                    this.check_version = check_version;
                }

                public int getOnline() {
                    return online;
                }

                public void setOnline(int online) {
                    this.online = online;
                }

                public String getArea() {
                    return area;
                }

                public void setArea(String area) {
                    this.area = area;
                }

                public int getArea_id() {
                    return area_id;
                }

                public void setArea_id(int area_id) {
                    this.area_id = area_id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPlayurl() {
                    return playurl;
                }

                public void setPlayurl(String playurl) {
                    this.playurl = playurl;
                }

                public int getCurrent_quality() {
                    return current_quality;
                }

                public void setCurrent_quality(int current_quality) {
                    this.current_quality = current_quality;
                }

                public String getAccept_quality() {
                    return accept_quality;
                }

                public void setAccept_quality(String accept_quality) {
                    this.accept_quality = accept_quality;
                }

                public int getBroadcast_type() {
                    return broadcast_type;
                }

                public void setBroadcast_type(int broadcast_type) {
                    this.broadcast_type = broadcast_type;
                }

                public int getIs_tv() {
                    return is_tv;
                }

                public void setIs_tv(int is_tv) {
                    this.is_tv = is_tv;
                }

                public String getCorner() {
                    return corner;
                }

                public void setCorner(String corner) {
                    this.corner = corner;
                }

                public String getPendent() {
                    return pendent;
                }

                public void setPendent(String pendent) {
                    this.pendent = pendent;
                }

                public int getArea_v2_id() {
                    return area_v2_id;
                }

                public void setArea_v2_id(int area_v2_id) {
                    this.area_v2_id = area_v2_id;
                }

                public String getArea_v2_name() {
                    return area_v2_name;
                }

                public void setArea_v2_name(String area_v2_name) {
                    this.area_v2_name = area_v2_name;
                }

                public int getArea_v2_parent_id() {
                    return area_v2_parent_id;
                }

                public void setArea_v2_parent_id(int area_v2_parent_id) {
                    this.area_v2_parent_id = area_v2_parent_id;
                }

                public String getArea_v2_parent_name() {
                    return area_v2_parent_name;
                }

                public void setArea_v2_parent_name(String area_v2_parent_name) {
                    this.area_v2_parent_name = area_v2_parent_name;
                }

                public String getData_behavior_id() {
                    return data_behavior_id;
                }

                public void setData_behavior_id(String data_behavior_id) {
                    this.data_behavior_id = data_behavior_id;
                }

                public String getData_source_id() {
                    return data_source_id;
                }

                public void setData_source_id(String data_source_id) {
                    this.data_source_id = data_source_id;
                }

                public List<?> getAccept_quality_v2() {
                    return accept_quality_v2;
                }

                public void setAccept_quality_v2(List<?> accept_quality_v2) {
                    this.accept_quality_v2 = accept_quality_v2;
                }

                public static class OwnerBean {
                    /**
                     * face : http://i2.hdslb.com/bfs/face/a2ead6078e39d569b067453c06f21808df26d133.jpg
                     * mid : 8779497
                     * name : 一颗奶糖不加糖
                     */

                    private String face;
                    private int mid;
                    private String name;

                    public String getFace() {
                        return face;
                    }

                    public void setFace(String face) {
                        this.face = face;
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
                }

                public static class CoverBeanX {
                    /**
                     * src : http://i0.hdslb.com/bfs/live/9f6ca31debdc17f0eb41b424ff0ac018348ebc01.jpg
                     * height : 180
                     * width : 320
                     */

                    private String src;
                    private int height;
                    private int width;

                    public String getSrc() {
                        return src;
                    }

                    public void setSrc(String src) {
                        this.src = src;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }
                }
            }
        }

        public static class BannerBean {
            /**
             * title : 樱花樱花想见你
             * img : http://i0.hdslb.com/bfs/live/26719d49e7291abf25c4ddc9f4eacb42f8a9dd44.png
             * remark : 樱花樱花想见你
             * link : http://live.bilibili.com/AppBanner/index?id=833
             */

            private String title;
            private String img;
            private String remark;
            private String link;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }

        public static class EntranceIconsBean {
            /**
             * id : 9
             * name : 绘画专区
             * entrance_icon : {"src":"http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/9_big.png?20171116172700","height":"132","width":"132"}
             */

            private int id;
            private String name;
            private EntranceIconBean entrance_icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public EntranceIconBean getEntrance_icon() {
                return entrance_icon;
            }

            public void setEntrance_icon(EntranceIconBean entrance_icon) {
                this.entrance_icon = entrance_icon;
            }

            public static class EntranceIconBean {
                /**
                 * src : http://static.hdslb.com/live-static/images/mobile/android/big/xxhdpi/9_big.png?20171116172700
                 * height : 132
                 * width : 132
                 */

                private String src;
                private String height;
                private String width;

                public String getSrc() {
                    return src;
                }

                public void setSrc(String src) {
                    this.src = src;
                }

                public String getHeight() {
                    return height;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public String getWidth() {
                    return width;
                }

                public void setWidth(String width) {
                    this.width = width;
                }
            }
        }

        public static class PartitionsBean {
            /**
             * partition : {"id":1,"name":"娱乐","sub_icon":{"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/1_3x.png?201709151052","height":"63","width":"63"},"count":1946}
             * lives : [{"roomid":52507,"uid":4444605,"title":"【橘砸】萌新主播","uname":"语哥sama","online":7468,"user_cover":"http://i0.hdslb.com/bfs/live/e5962fb6864b547dc95fad4204de4c34bbceaba3.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/52507.jpg?04091337","show_cover":"http://i0.hdslb.com/bfs/vc/593427864030585b8466bc369a245bd3e93585c9.jpg","link":"/230","face":"http://i2.hdslb.com/bfs/face/11a37ad0556820e8cdeb6749c95bd71e02e81d82.jpg","parent_id":1,"parent_name":"娱乐","area_id":139,"area_name":"美少女","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/484754/live_4444605_8819566.flv?wsSecret=2c8d40ee9ec0a62d4815c0975498c2a2&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":1,"is_tv":0,"corner":"","pendent":""},{"roomid":276578,"uid":6680275,"title":"静静肝视频 不说话","uname":"超级LED","online":306,"user_cover":"http://i0.hdslb.com/bfs/live/0e05e10ea1dcff5190bfdca3f38e8696abf10365.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/276578.jpg?04091331","show_cover":false,"link":"/276578","face":"http://i1.hdslb.com/bfs/face/17b9084b47f1936d471a35f691feb8211142080a.jpg","parent_id":1,"parent_name":"娱乐","area_id":27,"area_name":"学习","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/286528/live_6680275_1517920.flv?wsSecret=cf6e35eab4eb33cb55b4db5a98782299&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1533308,"uid":3627642,"title":"追鸡者","uname":"清箫哥哥","online":5031,"user_cover":"http://i0.hdslb.com/bfs/live/f3fd2e4c0a0a700f347d1b2fbe3c2294bb92010b.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1533308.jpg?04091336","show_cover":false,"link":"/488","face":"http://i0.hdslb.com/bfs/face/c1332485f71231ccbd438760eca6f935770b6775.jpg","parent_id":1,"parent_name":"娱乐","area_id":162,"area_name":"聊天电台","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://live-play.acgvideo.com/live/283/live_3627642_1924037.flv?wsSecret=890d0adf50efe55089635291e6f30fc5&wsTime=5aa37d84","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":1217827,"uid":11942302,"title":"ASMR是你掉的双马尾小可爱嘛","uname":"一只蠢梦梦","online":1180,"user_cover":"http://i0.hdslb.com/bfs/live/013543b2118d848f793205d744003d055fdbb424.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/1217827.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/bf989614c83f5074421deac3f62c2e0dd89c8af7.jpg","link":"/1217827","face":"http://i2.hdslb.com/bfs/face/58cab31e1702436d623263ad993012c3149c0494.jpg","parent_id":1,"parent_name":"娱乐","area_id":30,"area_name":"视频ASMR ","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/592922/live_11942302_7191433.flv?wsSecret=df4a4d558e717bcbd2024902db3a9a88&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":6753633,"uid":76329736,"title":"【温柔少御】想唱歌给你听","uname":"噗阿噗の葵喵","online":2595,"user_cover":"http://i0.hdslb.com/bfs/live/344e8087f253bbd5aaec6c5af793fa9078479a34.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/6753633.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/9da8eb733d15ebb2a241604cab2155e1a7c3bb66.jpg","link":"/6753633","face":"http://i2.hdslb.com/bfs/face/eec7e3efd2866e74b06c483ce5506a5a0316aa75.jpg","parent_id":1,"parent_name":"娱乐","area_id":21,"area_name":"视频唱见","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/241756/live_76329736_6082346.flv?wsSecret=731a448a27116a2e96dcab4093eb016d&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""},{"roomid":311582,"uid":1519784,"title":"【不油不腻少女音】我 好困","uname":"是沢美","online":163,"user_cover":"http://i0.hdslb.com/bfs/live/607775badedfcb38ef2f98a2158380d754141806.jpg","user_cover_flag":1,"system_cover":"http://i0.hdslb.com/bfs/live/311582.jpg?04091331","show_cover":"http://i0.hdslb.com/bfs/vc/744551936c9be3e245c49404f31209464bba40ce.jpg","link":"/627","face":"http://i1.hdslb.com/bfs/face/c851df0c6919c6e9b0afbe7918ee588e30a9a177.jpg","parent_id":1,"parent_name":"娱乐","area_id":160,"area_name":"唱见电台","web_pendent":"","cover_size":{"height":180,"width":320},"play_url":"http://qn.live-play.acgvideo.com/live-qn/655295/live_1519784_7889363.flv?wsSecret=44f45fcc6b1ae1cbaa2a17ba4edf26ba&wsTime=1523254140","accept_quality_v2":[4],"current_quality":0,"accept_quality":"4","broadcast_type":0,"is_tv":0,"corner":"","pendent":""}]
             */

            private PartitionBeanXX partition;
            private List<LivesBeanXX> lives;

            public PartitionBeanXX getPartition() {
                return partition;
            }

            public void setPartition(PartitionBeanXX partition) {
                this.partition = partition;
            }

            public List<LivesBeanXX> getLives() {
                return lives;
            }

            public void setLives(List<LivesBeanXX> lives) {
                this.lives = lives;
            }

            public static class PartitionBeanXX {
                /**
                 * id : 1
                 * name : 娱乐
                 * sub_icon : {"src":"http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/1_3x.png?201709151052","height":"63","width":"63"}
                 * count : 1946
                 */

                private int id;
                private String name;
                private SubIconBeanXX sub_icon;
                private int count;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public SubIconBeanXX getSub_icon() {
                    return sub_icon;
                }

                public void setSub_icon(SubIconBeanXX sub_icon) {
                    this.sub_icon = sub_icon;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public static class SubIconBeanXX {
                    /**
                     * src : http://s1.hdslb.com/bfs/static/blive/live-assets/mobile/android/android/1_3x.png?201709151052
                     * height : 63
                     * width : 63
                     */

                    private String src;
                    private String height;
                    private String width;

                    public String getSrc() {
                        return src;
                    }

                    public void setSrc(String src) {
                        this.src = src;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }
                }
            }

            public static class LivesBeanXX {
                /**
                 * roomid : 52507
                 * uid : 4444605
                 * title : 【橘砸】萌新主播
                 * uname : 语哥sama
                 * online : 7468
                 * user_cover : http://i0.hdslb.com/bfs/live/e5962fb6864b547dc95fad4204de4c34bbceaba3.jpg
                 * user_cover_flag : 1
                 * system_cover : http://i0.hdslb.com/bfs/live/52507.jpg?04091337
                 * show_cover : http://i0.hdslb.com/bfs/vc/593427864030585b8466bc369a245bd3e93585c9.jpg
                 * link : /230
                 * face : http://i2.hdslb.com/bfs/face/11a37ad0556820e8cdeb6749c95bd71e02e81d82.jpg
                 * parent_id : 1
                 * parent_name : 娱乐
                 * area_id : 139
                 * area_name : 美少女
                 * web_pendent :
                 * cover_size : {"height":180,"width":320}
                 * play_url : http://qn.live-play.acgvideo.com/live-qn/484754/live_4444605_8819566.flv?wsSecret=2c8d40ee9ec0a62d4815c0975498c2a2&wsTime=1523254140
                 * accept_quality_v2 : [4]
                 * current_quality : 0
                 * accept_quality : 4
                 * broadcast_type : 1
                 * is_tv : 0
                 * corner :
                 * pendent :
                 */

                private int roomid;
                private int uid;
                private String title;
                private String uname;
                private int online;
                private String user_cover;
                private int user_cover_flag;
                private String system_cover;
                private String show_cover;
                private String link;
                private String face;
                private int parent_id;
                private String parent_name;
                private int area_id;
                private String area_name;
                private String web_pendent;
                private CoverSizeBeanX cover_size;
                private String play_url;
                private int current_quality;
                private String accept_quality;
                private int broadcast_type;
                private int is_tv;
                private String corner;
                private String pendent;
                private List<Integer> accept_quality_v2;

                public int getRoomid() {
                    return roomid;
                }

                public void setRoomid(int roomid) {
                    this.roomid = roomid;
                }

                public int getUid() {
                    return uid;
                }

                public void setUid(int uid) {
                    this.uid = uid;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUname() {
                    return uname;
                }

                public void setUname(String uname) {
                    this.uname = uname;
                }

                public int getOnline() {
                    return online;
                }

                public void setOnline(int online) {
                    this.online = online;
                }

                public String getUser_cover() {
                    return user_cover;
                }

                public void setUser_cover(String user_cover) {
                    this.user_cover = user_cover;
                }

                public int getUser_cover_flag() {
                    return user_cover_flag;
                }

                public void setUser_cover_flag(int user_cover_flag) {
                    this.user_cover_flag = user_cover_flag;
                }

                public String getSystem_cover() {
                    return system_cover;
                }

                public void setSystem_cover(String system_cover) {
                    this.system_cover = system_cover;
                }

                public String getShow_cover() {
                    return show_cover;
                }

                public void setShow_cover(String show_cover) {
                    this.show_cover = show_cover;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getFace() {
                    return face;
                }

                public void setFace(String face) {
                    this.face = face;
                }

                public int getParent_id() {
                    return parent_id;
                }

                public void setParent_id(int parent_id) {
                    this.parent_id = parent_id;
                }

                public String getParent_name() {
                    return parent_name;
                }

                public void setParent_name(String parent_name) {
                    this.parent_name = parent_name;
                }

                public int getArea_id() {
                    return area_id;
                }

                public void setArea_id(int area_id) {
                    this.area_id = area_id;
                }

                public String getArea_name() {
                    return area_name;
                }

                public void setArea_name(String area_name) {
                    this.area_name = area_name;
                }

                public String getWeb_pendent() {
                    return web_pendent;
                }

                public void setWeb_pendent(String web_pendent) {
                    this.web_pendent = web_pendent;
                }

                public CoverSizeBeanX getCover_size() {
                    return cover_size;
                }

                public void setCover_size(CoverSizeBeanX cover_size) {
                    this.cover_size = cover_size;
                }

                public String getPlay_url() {
                    return play_url;
                }

                public void setPlay_url(String play_url) {
                    this.play_url = play_url;
                }

                public int getCurrent_quality() {
                    return current_quality;
                }

                public void setCurrent_quality(int current_quality) {
                    this.current_quality = current_quality;
                }

                public String getAccept_quality() {
                    return accept_quality;
                }

                public void setAccept_quality(String accept_quality) {
                    this.accept_quality = accept_quality;
                }

                public int getBroadcast_type() {
                    return broadcast_type;
                }

                public void setBroadcast_type(int broadcast_type) {
                    this.broadcast_type = broadcast_type;
                }

                public int getIs_tv() {
                    return is_tv;
                }

                public void setIs_tv(int is_tv) {
                    this.is_tv = is_tv;
                }

                public String getCorner() {
                    return corner;
                }

                public void setCorner(String corner) {
                    this.corner = corner;
                }

                public String getPendent() {
                    return pendent;
                }

                public void setPendent(String pendent) {
                    this.pendent = pendent;
                }

                public List<Integer> getAccept_quality_v2() {
                    return accept_quality_v2;
                }

                public void setAccept_quality_v2(List<Integer> accept_quality_v2) {
                    this.accept_quality_v2 = accept_quality_v2;
                }

                public static class CoverSizeBeanX {
                    /**
                     * height : 180
                     * width : 320
                     */

                    private int height;
                    private int width;

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }
                }
            }
        }
    }

    public static void getLiveData(String timeStamp,LiveCallBack callBack){
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Contants.LIVE)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        HttpApiService movieService = retrofit.create(HttpApiService.class);
        Observable<AnimLive> bannerObservable = movieService.getLiveService(timeStamp);
        bannerObservable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<AnimLive>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(AnimLive live) {
                        callBack.onSuccess(live);
                    }

                    @Override
                    public void onError(Throwable t) {
                        callBack.onFail(t.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        callBack.onComplete("doine");
                    }
                });
    }
}
