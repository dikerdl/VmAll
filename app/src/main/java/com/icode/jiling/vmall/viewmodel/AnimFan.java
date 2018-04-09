package com.icode.jiling.vmall.viewmodel;

import com.google.gson.Gson;
import com.icode.jiling.vmall.constant.Contants;
import com.icode.jiling.vmall.http.HttpApiService;
import com.icode.jiling.vmall.interfaces.BannerCallBack;
import com.icode.jiling.vmall.interfaces.FanCallBack;

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

public class AnimFan {

    /**
     * code : 0
     * message : success
     * result : {"ad":[],"recommend_cn":{"foot":[{"cover":"http://i0.hdslb.com/bfs/bangumi/4a5c0fee974288f706a91b4a677a6284efa8925f.jpg","desc":"属于我们自己的国产青春！","id":20176,"is_auto":1,"link":"https://www.bilibili.com/read/cv348946/","title":"《茶啊二中》第四季暖心回归 青春正当时!","wid":59}],"recommend":[{"cover":"http://i0.hdslb.com/bfs/bangumi/9941df2e31f4d77f2dd6b3a2d2cff7746c2f9107.jpg","favourites":"220087","is_auto":1,"is_finish":0,"is_started":1,"last_time":1523246400,"newest_ep_index":"13","pub_time":1515945600,"season_id":22829,"season_status":2,"title":"斗罗大陆2绝世唐门","total_count":13,"watching_count":0,"wid":84},{"badge":"付费抢先","cover":"http://i0.hdslb.com/bfs/bangumi/f4c9fba5f64cca02190d8723c7e99c2f46e6436f.jpg","favourites":"785902","is_auto":0,"is_finish":0,"is_started":1,"last_time":1523066400,"newest_ep_index":"4","pub_time":1522807200,"season_id":21911,"season_status":7,"title":"我家大师兄脑子有坑","total_count":26,"watching_count":0,"wid":84},{"cover":"http://i0.hdslb.com/bfs/bangumi/ccaaa7cc43f06430ccbb0da9a44f16ed939e2936.jpg","favourites":"3467","is_auto":1,"is_finish":0,"is_started":1,"last_time":1523242800,"newest_ep_index":"番外","pub_time":1507651200,"season_id":6488,"season_status":2,"title":"黄金屋","total_count":-1,"watching_count":0,"wid":84}]},"recommend_jp":{"foot":[{"cover":"http://i0.hdslb.com/bfs/bangumi/d6f63d035a84f79e100c2ee365f62b1c7cf355d9.jpg","desc":"一大波续作","id":20240,"is_auto":1,"link":"https://www.bilibili.com/blackboard/topic/activity-r1XVx5VsG.html","title":"【资讯档】2018年第14周","wid":78}],"recommend":[{"cover":"http://i0.hdslb.com/bfs/bangumi/a84652b8c87ad2289240304749142b05074fa3bd.png","favourites":"12087","is_auto":1,"is_finish":0,"is_started":1,"last_time":1523214300,"newest_ep_index":"2","pub_time":1522598400,"season_id":23881,"season_status":13,"title":"Four of a Kind 四牌士","total_count":26,"watching_count":0,"wid":82},{"cover":"http://i0.hdslb.com/bfs/bangumi/0ff8c4530794320466c227b3c957e8851483cccd.jpg","favourites":"17027","is_auto":1,"is_finish":0,"is_started":1,"last_time":1523212800,"newest_ep_index":"1","pub_time":1523203200,"season_id":23851,"season_status":2,"title":"琴之森","total_count":12,"watching_count":0,"wid":82},{"cover":"http://i0.hdslb.com/bfs/bangumi/d371f9b5e51ef88e4092c7a5c86ebf89e8b2d3c7.jpg","favourites":"41837","is_auto":1,"is_finish":0,"is_started":1,"last_time":1523208899,"newest_ep_index":"1","pub_time":1523203200,"season_id":23866,"season_status":13,"title":"美男高校地球防卫部 HAPPY KISS！","total_count":12,"watching_count":0,"wid":82}]},"recommend_review":[{"author":{"avatar":"http://i1.hdslb.com/bfs/face/6a207ac41f037b068e4603d58081c10557746506.jpg","mid":2061401,"uname":"観月三重"},"content":"开头先扯点别的吧。可能是进入一个脱宅预备期了吧。几个月前我还完全想不到自己居然会提前迈入这个阶段。不过业界药丸的观念早就有人在提，之前相当长一段时间我都挺迷茫的。可能也因为ACG真的是我生活中很重要的一部分，所以失望的时候也特别低落吧。近期看了这部作品以后一下子清醒了很多，觉得最初看动画就是为了在八年以后遇到它啊，可能这他妈的就是本命作的感觉吧。然后门槛突然就拔高了。如今再要找那么多相近等级的神作跟吃饭一样看是不可能的事情嘛。结果几乎啥都看不进去，追新番的感觉就像吃苹果，平时出来不大想吃，饿了才会不怎么热情不带脑子地啃两口。一加审视等","ctime":1522514740,"likes":248,"media":{"cover":"http://i0.hdslb.com/bfs/bangumi/768995301fe98573e1d2e330b86612d9e195ab06.jpg","media_id":2261,"title":"星际牛仔"},"mtime":1523029464,"reply":35,"review_id":18273,"title":"即使身陷泥沼，人生也还不坏","user_rating":{"score":10}},{"author":{"avatar":"http://i1.hdslb.com/bfs/face/4ebf23606abc92a06270939a261edf4d66aad475.jpg","mid":27751127,"uname":"愛麗絲さま"},"content":"我看了这部番四次了，不得不承认，前几集确实催眠，这部番是慢热型，你需要静下心来看。所以大家看到那些吐槽看不下去的评论，请怀有包容之心，举报就好了，不要去撕x。可能这是ef不如key社四大作人气的一大原因吧！另外一周目推荐关弹幕别乱逛评论区，被剧透的感觉很不爽的。这是一个群像剧，第一季的情节又为第二季做铺垫，如果你对这部番的主角到底是谁感到好奇，你可以去搜下ef的游戏op（op轻微剧透，十年前的作品放到如今依然惊艳）。大沼心对于情感的把握非常细腻，同时运用了大量的新房风来表现这种意象。不喜新房风的观众可能会感到一点头晕，不过此作没有物语","ctime":1507128837,"likes":824,"media":{"cover":"http://i0.hdslb.com/bfs/bangumi/4dd345a0aaa9d8d49c0c80f5f79d2aefa85ad4ea.jpg","media_id":1181,"title":"悠久之翼"},"mtime":1522248859,"reply":123,"review_id":1893,"title":"有\u201c瑕疵\u201d的\u201c完美\u201d之作","user_rating":{"score":10}},{"author":{"avatar":"http://i1.hdslb.com/bfs/face/931930b5f475aff9cbd22fafe4b80619d6c8b821.jpg","mid":13800362,"uname":"S-death"},"content":"目前还差五集左右全部看完，每天回宿舍后看一点，陆陆续续补完，大概用了一星期。关于剧情的逻辑和叙事的手法十分独特这件事早有耳闻，不过除了这些带着新奇点的东西外，动画本身让我有点不舍得看完的原因，最主要还是感觉到角色在传达的某种情绪，对于想要进入或者脱离非日常生活的想法。不知道有多少人像帝人一样想象着有一段奇遇，要趁着还年轻去体验一些超脱常理的事物，至少我也是这么向往着的，但时常又感觉到，其实大家都只是在平凡地生活着而已，每个人都有着不起眼的喜怒哀乐，包括自己，而这种喜怒哀乐不会有多么地惊天动地，甚至大多数情况下，它其实只是一些鸡皮蒜毛的","ctime":1520698873,"likes":905,"media":{"cover":"http://i0.hdslb.com/bfs/bangumi/446c6c7e1806c0debbc3e40ba2e9d9dd00cb4a08.jpg","media_id":1656,"title":"无头骑士异闻录"},"mtime":1520698873,"reply":71,"review_id":16458,"title":"使我略微有些情绪化的作品","user_rating":{"score":10}}],"timeline":[{"area_id":1,"cover":"http://i0.hdslb.com/bfs/bangumi/9941df2e31f4d77f2dd6b3a2d2cff7746c2f9107.jpg","delay":0,"ep_id":200607,"favorites":220087,"follow":0,"is_published":1,"order":16,"pub_date":"2018-04-09","pub_index":"第13话","pub_time":"12:00","pub_ts":1523246400,"season_id":22829,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/b6ad2e54d579160ee36692871aa8aeea13f3db63.jpg","title":"斗罗大陆2绝世唐门"},{"area_id":1,"cover":"http://i0.hdslb.com/bfs/bangumi/ccaaa7cc43f06430ccbb0da9a44f16ed939e2936.jpg","delay":0,"ep_id":200603,"favorites":3467,"follow":0,"is_published":1,"order":25,"pub_date":"2018-04-09","pub_index":"番外","pub_time":"11:00","pub_ts":1523242800,"season_id":6488,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/90250d4561c3b447f919d1a6f267600e9f82fba2.png","title":"黄金屋"},{"area_id":1,"cover":"http://i0.hdslb.com/bfs/bangumi/61b95cb0f7da1499c3f8fdb7dcca42da56e2da47.jpg","delay":0,"ep_id":200604,"favorites":37156,"follow":0,"is_published":1,"order":17,"pub_date":"2018-04-09","pub_index":"第15话","pub_time":"10:00","pub_ts":1523239200,"season_id":20170,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/301a701bb00733611341e9130096a7b3a96423f0.jpg","title":"49%的灵魂"}]}
     */

    private int code;
    private String message;
    private ResultBean result;

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

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * ad : []
         * recommend_cn : {"foot":[{"cover":"http://i0.hdslb.com/bfs/bangumi/4a5c0fee974288f706a91b4a677a6284efa8925f.jpg","desc":"属于我们自己的国产青春！","id":20176,"is_auto":1,"link":"https://www.bilibili.com/read/cv348946/","title":"《茶啊二中》第四季暖心回归 青春正当时!","wid":59}],"recommend":[{"cover":"http://i0.hdslb.com/bfs/bangumi/9941df2e31f4d77f2dd6b3a2d2cff7746c2f9107.jpg","favourites":"220087","is_auto":1,"is_finish":0,"is_started":1,"last_time":1523246400,"newest_ep_index":"13","pub_time":1515945600,"season_id":22829,"season_status":2,"title":"斗罗大陆2绝世唐门","total_count":13,"watching_count":0,"wid":84,"badge":"付费抢先"},{"badge":"付费抢先","cover":"http://i0.hdslb.com/bfs/bangumi/f4c9fba5f64cca02190d8723c7e99c2f46e6436f.jpg","favourites":"785902","is_auto":0,"is_finish":0,"is_started":1,"last_time":1523066400,"newest_ep_index":"4","pub_time":1522807200,"season_id":21911,"season_status":7,"title":"我家大师兄脑子有坑","total_count":26,"watching_count":0,"wid":84},{"cover":"http://i0.hdslb.com/bfs/bangumi/ccaaa7cc43f06430ccbb0da9a44f16ed939e2936.jpg","favourites":"3467","is_auto":1,"is_finish":0,"is_started":1,"last_time":1523242800,"newest_ep_index":"番外","pub_time":1507651200,"season_id":6488,"season_status":2,"title":"黄金屋","total_count":-1,"watching_count":0,"wid":84}]}
         * recommend_jp : {"foot":[{"cover":"http://i0.hdslb.com/bfs/bangumi/d6f63d035a84f79e100c2ee365f62b1c7cf355d9.jpg","desc":"一大波续作","id":20240,"is_auto":1,"link":"https://www.bilibili.com/blackboard/topic/activity-r1XVx5VsG.html","title":"【资讯档】2018年第14周","wid":78}],"recommend":[{"cover":"http://i0.hdslb.com/bfs/bangumi/a84652b8c87ad2289240304749142b05074fa3bd.png","favourites":"12087","is_auto":1,"is_finish":0,"is_started":1,"last_time":1523214300,"newest_ep_index":"2","pub_time":1522598400,"season_id":23881,"season_status":13,"title":"Four of a Kind 四牌士","total_count":26,"watching_count":0,"wid":82},{"cover":"http://i0.hdslb.com/bfs/bangumi/0ff8c4530794320466c227b3c957e8851483cccd.jpg","favourites":"17027","is_auto":1,"is_finish":0,"is_started":1,"last_time":1523212800,"newest_ep_index":"1","pub_time":1523203200,"season_id":23851,"season_status":2,"title":"琴之森","total_count":12,"watching_count":0,"wid":82},{"cover":"http://i0.hdslb.com/bfs/bangumi/d371f9b5e51ef88e4092c7a5c86ebf89e8b2d3c7.jpg","favourites":"41837","is_auto":1,"is_finish":0,"is_started":1,"last_time":1523208899,"newest_ep_index":"1","pub_time":1523203200,"season_id":23866,"season_status":13,"title":"美男高校地球防卫部 HAPPY KISS！","total_count":12,"watching_count":0,"wid":82}]}
         * recommend_review : [{"author":{"avatar":"http://i1.hdslb.com/bfs/face/6a207ac41f037b068e4603d58081c10557746506.jpg","mid":2061401,"uname":"観月三重"},"content":"开头先扯点别的吧。可能是进入一个脱宅预备期了吧。几个月前我还完全想不到自己居然会提前迈入这个阶段。不过业界药丸的观念早就有人在提，之前相当长一段时间我都挺迷茫的。可能也因为ACG真的是我生活中很重要的一部分，所以失望的时候也特别低落吧。近期看了这部作品以后一下子清醒了很多，觉得最初看动画就是为了在八年以后遇到它啊，可能这他妈的就是本命作的感觉吧。然后门槛突然就拔高了。如今再要找那么多相近等级的神作跟吃饭一样看是不可能的事情嘛。结果几乎啥都看不进去，追新番的感觉就像吃苹果，平时出来不大想吃，饿了才会不怎么热情不带脑子地啃两口。一加审视等","ctime":1522514740,"likes":248,"media":{"cover":"http://i0.hdslb.com/bfs/bangumi/768995301fe98573e1d2e330b86612d9e195ab06.jpg","media_id":2261,"title":"星际牛仔"},"mtime":1523029464,"reply":35,"review_id":18273,"title":"即使身陷泥沼，人生也还不坏","user_rating":{"score":10}},{"author":{"avatar":"http://i1.hdslb.com/bfs/face/4ebf23606abc92a06270939a261edf4d66aad475.jpg","mid":27751127,"uname":"愛麗絲さま"},"content":"我看了这部番四次了，不得不承认，前几集确实催眠，这部番是慢热型，你需要静下心来看。所以大家看到那些吐槽看不下去的评论，请怀有包容之心，举报就好了，不要去撕x。可能这是ef不如key社四大作人气的一大原因吧！另外一周目推荐关弹幕别乱逛评论区，被剧透的感觉很不爽的。这是一个群像剧，第一季的情节又为第二季做铺垫，如果你对这部番的主角到底是谁感到好奇，你可以去搜下ef的游戏op（op轻微剧透，十年前的作品放到如今依然惊艳）。大沼心对于情感的把握非常细腻，同时运用了大量的新房风来表现这种意象。不喜新房风的观众可能会感到一点头晕，不过此作没有物语","ctime":1507128837,"likes":824,"media":{"cover":"http://i0.hdslb.com/bfs/bangumi/4dd345a0aaa9d8d49c0c80f5f79d2aefa85ad4ea.jpg","media_id":1181,"title":"悠久之翼"},"mtime":1522248859,"reply":123,"review_id":1893,"title":"有\u201c瑕疵\u201d的\u201c完美\u201d之作","user_rating":{"score":10}},{"author":{"avatar":"http://i1.hdslb.com/bfs/face/931930b5f475aff9cbd22fafe4b80619d6c8b821.jpg","mid":13800362,"uname":"S-death"},"content":"目前还差五集左右全部看完，每天回宿舍后看一点，陆陆续续补完，大概用了一星期。关于剧情的逻辑和叙事的手法十分独特这件事早有耳闻，不过除了这些带着新奇点的东西外，动画本身让我有点不舍得看完的原因，最主要还是感觉到角色在传达的某种情绪，对于想要进入或者脱离非日常生活的想法。不知道有多少人像帝人一样想象着有一段奇遇，要趁着还年轻去体验一些超脱常理的事物，至少我也是这么向往着的，但时常又感觉到，其实大家都只是在平凡地生活着而已，每个人都有着不起眼的喜怒哀乐，包括自己，而这种喜怒哀乐不会有多么地惊天动地，甚至大多数情况下，它其实只是一些鸡皮蒜毛的","ctime":1520698873,"likes":905,"media":{"cover":"http://i0.hdslb.com/bfs/bangumi/446c6c7e1806c0debbc3e40ba2e9d9dd00cb4a08.jpg","media_id":1656,"title":"无头骑士异闻录"},"mtime":1520698873,"reply":71,"review_id":16458,"title":"使我略微有些情绪化的作品","user_rating":{"score":10}}]
         * timeline : [{"area_id":1,"cover":"http://i0.hdslb.com/bfs/bangumi/9941df2e31f4d77f2dd6b3a2d2cff7746c2f9107.jpg","delay":0,"ep_id":200607,"favorites":220087,"follow":0,"is_published":1,"order":16,"pub_date":"2018-04-09","pub_index":"第13话","pub_time":"12:00","pub_ts":1523246400,"season_id":22829,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/b6ad2e54d579160ee36692871aa8aeea13f3db63.jpg","title":"斗罗大陆2绝世唐门"},{"area_id":1,"cover":"http://i0.hdslb.com/bfs/bangumi/ccaaa7cc43f06430ccbb0da9a44f16ed939e2936.jpg","delay":0,"ep_id":200603,"favorites":3467,"follow":0,"is_published":1,"order":25,"pub_date":"2018-04-09","pub_index":"番外","pub_time":"11:00","pub_ts":1523242800,"season_id":6488,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/90250d4561c3b447f919d1a6f267600e9f82fba2.png","title":"黄金屋"},{"area_id":1,"cover":"http://i0.hdslb.com/bfs/bangumi/61b95cb0f7da1499c3f8fdb7dcca42da56e2da47.jpg","delay":0,"ep_id":200604,"favorites":37156,"follow":0,"is_published":1,"order":17,"pub_date":"2018-04-09","pub_index":"第15话","pub_time":"10:00","pub_ts":1523239200,"season_id":20170,"season_status":2,"square_cover":"http://i0.hdslb.com/bfs/bangumi/301a701bb00733611341e9130096a7b3a96423f0.jpg","title":"49%的灵魂"}]
         */

        private RecommendCnBean recommend_cn;
        private RecommendJpBean recommend_jp;
        private List<?> ad;
        private List<RecommendReviewBean> recommend_review;
        private List<TimelineBean> timeline;

        public RecommendCnBean getRecommend_cn() {
            return recommend_cn;
        }

        public void setRecommend_cn(RecommendCnBean recommend_cn) {
            this.recommend_cn = recommend_cn;
        }

        public RecommendJpBean getRecommend_jp() {
            return recommend_jp;
        }

        public void setRecommend_jp(RecommendJpBean recommend_jp) {
            this.recommend_jp = recommend_jp;
        }

        public List<?> getAd() {
            return ad;
        }

        public void setAd(List<?> ad) {
            this.ad = ad;
        }

        public List<RecommendReviewBean> getRecommend_review() {
            return recommend_review;
        }

        public void setRecommend_review(List<RecommendReviewBean> recommend_review) {
            this.recommend_review = recommend_review;
        }

        public List<TimelineBean> getTimeline() {
            return timeline;
        }

        public void setTimeline(List<TimelineBean> timeline) {
            this.timeline = timeline;
        }

        public static class RecommendCnBean {
            private List<FootBean> foot;
            private List<RecommendBean> recommend;

            public List<FootBean> getFoot() {
                return foot;
            }

            public void setFoot(List<FootBean> foot) {
                this.foot = foot;
            }

            public List<RecommendBean> getRecommend() {
                return recommend;
            }

            public void setRecommend(List<RecommendBean> recommend) {
                this.recommend = recommend;
            }

            public static class FootBean {
                /**
                 * cover : http://i0.hdslb.com/bfs/bangumi/4a5c0fee974288f706a91b4a677a6284efa8925f.jpg
                 * desc : 属于我们自己的国产青春！
                 * id : 20176
                 * is_auto : 1
                 * link : https://www.bilibili.com/read/cv348946/
                 * title : 《茶啊二中》第四季暖心回归 青春正当时!
                 * wid : 59
                 */

                private String cover;
                private String desc;
                private int id;
                private int is_auto;
                private String link;
                private String title;
                private int wid;

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getIs_auto() {
                    return is_auto;
                }

                public void setIs_auto(int is_auto) {
                    this.is_auto = is_auto;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getWid() {
                    return wid;
                }

                public void setWid(int wid) {
                    this.wid = wid;
                }
            }

            public static class RecommendBean {
                /**
                 * cover : http://i0.hdslb.com/bfs/bangumi/9941df2e31f4d77f2dd6b3a2d2cff7746c2f9107.jpg
                 * favourites : 220087
                 * is_auto : 1
                 * is_finish : 0
                 * is_started : 1
                 * last_time : 1523246400
                 * newest_ep_index : 13
                 * pub_time : 1515945600
                 * season_id : 22829
                 * season_status : 2
                 * title : 斗罗大陆2绝世唐门
                 * total_count : 13
                 * watching_count : 0
                 * wid : 84
                 * badge : 付费抢先
                 */

                private String cover;
                private String favourites;
                private int is_auto;
                private int is_finish;
                private int is_started;
                private int last_time;
                private String newest_ep_index;
                private int pub_time;
                private int season_id;
                private int season_status;
                private String title;
                private int total_count;
                private int watching_count;
                private int wid;
                private String badge;

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getFavourites() {
                    return favourites;
                }

                public void setFavourites(String favourites) {
                    this.favourites = favourites;
                }

                public int getIs_auto() {
                    return is_auto;
                }

                public void setIs_auto(int is_auto) {
                    this.is_auto = is_auto;
                }

                public int getIs_finish() {
                    return is_finish;
                }

                public void setIs_finish(int is_finish) {
                    this.is_finish = is_finish;
                }

                public int getIs_started() {
                    return is_started;
                }

                public void setIs_started(int is_started) {
                    this.is_started = is_started;
                }

                public int getLast_time() {
                    return last_time;
                }

                public void setLast_time(int last_time) {
                    this.last_time = last_time;
                }

                public String getNewest_ep_index() {
                    return newest_ep_index;
                }

                public void setNewest_ep_index(String newest_ep_index) {
                    this.newest_ep_index = newest_ep_index;
                }

                public int getPub_time() {
                    return pub_time;
                }

                public void setPub_time(int pub_time) {
                    this.pub_time = pub_time;
                }

                public int getSeason_id() {
                    return season_id;
                }

                public void setSeason_id(int season_id) {
                    this.season_id = season_id;
                }

                public int getSeason_status() {
                    return season_status;
                }

                public void setSeason_status(int season_status) {
                    this.season_status = season_status;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTotal_count() {
                    return total_count;
                }

                public void setTotal_count(int total_count) {
                    this.total_count = total_count;
                }

                public int getWatching_count() {
                    return watching_count;
                }

                public void setWatching_count(int watching_count) {
                    this.watching_count = watching_count;
                }

                public int getWid() {
                    return wid;
                }

                public void setWid(int wid) {
                    this.wid = wid;
                }

                public String getBadge() {
                    return badge;
                }

                public void setBadge(String badge) {
                    this.badge = badge;
                }
            }
        }

        public static class RecommendJpBean {
            private List<FootBeanX> foot;
            private List<RecommendBeanX> recommend;

            public List<FootBeanX> getFoot() {
                return foot;
            }

            public void setFoot(List<FootBeanX> foot) {
                this.foot = foot;
            }

            public List<RecommendBeanX> getRecommend() {
                return recommend;
            }

            public void setRecommend(List<RecommendBeanX> recommend) {
                this.recommend = recommend;
            }

            public static class FootBeanX {
                /**
                 * cover : http://i0.hdslb.com/bfs/bangumi/d6f63d035a84f79e100c2ee365f62b1c7cf355d9.jpg
                 * desc : 一大波续作
                 * id : 20240
                 * is_auto : 1
                 * link : https://www.bilibili.com/blackboard/topic/activity-r1XVx5VsG.html
                 * title : 【资讯档】2018年第14周
                 * wid : 78
                 */

                private String cover;
                private String desc;
                private int id;
                private int is_auto;
                private String link;
                private String title;
                private int wid;

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getIs_auto() {
                    return is_auto;
                }

                public void setIs_auto(int is_auto) {
                    this.is_auto = is_auto;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getWid() {
                    return wid;
                }

                public void setWid(int wid) {
                    this.wid = wid;
                }
            }

            public static class RecommendBeanX {
                /**
                 * cover : http://i0.hdslb.com/bfs/bangumi/a84652b8c87ad2289240304749142b05074fa3bd.png
                 * favourites : 12087
                 * is_auto : 1
                 * is_finish : 0
                 * is_started : 1
                 * last_time : 1523214300
                 * newest_ep_index : 2
                 * pub_time : 1522598400
                 * season_id : 23881
                 * season_status : 13
                 * title : Four of a Kind 四牌士
                 * total_count : 26
                 * watching_count : 0
                 * wid : 82
                 */

                private String cover;
                private String favourites;
                private int is_auto;
                private int is_finish;
                private int is_started;
                private int last_time;
                private String newest_ep_index;
                private int pub_time;
                private int season_id;
                private int season_status;
                private String title;
                private int total_count;
                private int watching_count;
                private int wid;

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getFavourites() {
                    return favourites;
                }

                public void setFavourites(String favourites) {
                    this.favourites = favourites;
                }

                public int getIs_auto() {
                    return is_auto;
                }

                public void setIs_auto(int is_auto) {
                    this.is_auto = is_auto;
                }

                public int getIs_finish() {
                    return is_finish;
                }

                public void setIs_finish(int is_finish) {
                    this.is_finish = is_finish;
                }

                public int getIs_started() {
                    return is_started;
                }

                public void setIs_started(int is_started) {
                    this.is_started = is_started;
                }

                public int getLast_time() {
                    return last_time;
                }

                public void setLast_time(int last_time) {
                    this.last_time = last_time;
                }

                public String getNewest_ep_index() {
                    return newest_ep_index;
                }

                public void setNewest_ep_index(String newest_ep_index) {
                    this.newest_ep_index = newest_ep_index;
                }

                public int getPub_time() {
                    return pub_time;
                }

                public void setPub_time(int pub_time) {
                    this.pub_time = pub_time;
                }

                public int getSeason_id() {
                    return season_id;
                }

                public void setSeason_id(int season_id) {
                    this.season_id = season_id;
                }

                public int getSeason_status() {
                    return season_status;
                }

                public void setSeason_status(int season_status) {
                    this.season_status = season_status;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getTotal_count() {
                    return total_count;
                }

                public void setTotal_count(int total_count) {
                    this.total_count = total_count;
                }

                public int getWatching_count() {
                    return watching_count;
                }

                public void setWatching_count(int watching_count) {
                    this.watching_count = watching_count;
                }

                public int getWid() {
                    return wid;
                }

                public void setWid(int wid) {
                    this.wid = wid;
                }
            }
        }

        public static class RecommendReviewBean {
            /**
             * author : {"avatar":"http://i1.hdslb.com/bfs/face/6a207ac41f037b068e4603d58081c10557746506.jpg","mid":2061401,"uname":"観月三重"}
             * content : 开头先扯点别的吧。可能是进入一个脱宅预备期了吧。几个月前我还完全想不到自己居然会提前迈入这个阶段。不过业界药丸的观念早就有人在提，之前相当长一段时间我都挺迷茫的。可能也因为ACG真的是我生活中很重要的一部分，所以失望的时候也特别低落吧。近期看了这部作品以后一下子清醒了很多，觉得最初看动画就是为了在八年以后遇到它啊，可能这他妈的就是本命作的感觉吧。然后门槛突然就拔高了。如今再要找那么多相近等级的神作跟吃饭一样看是不可能的事情嘛。结果几乎啥都看不进去，追新番的感觉就像吃苹果，平时出来不大想吃，饿了才会不怎么热情不带脑子地啃两口。一加审视等
             * ctime : 1522514740
             * likes : 248
             * media : {"cover":"http://i0.hdslb.com/bfs/bangumi/768995301fe98573e1d2e330b86612d9e195ab06.jpg","media_id":2261,"title":"星际牛仔"}
             * mtime : 1523029464
             * reply : 35
             * review_id : 18273
             * title : 即使身陷泥沼，人生也还不坏
             * user_rating : {"score":10}
             */

            private AuthorBean author;
            private String content;
            private int ctime;
            private int likes;
            private MediaBean media;
            private int mtime;
            private int reply;
            private int review_id;
            private String title;
            private UserRatingBean user_rating;

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getCtime() {
                return ctime;
            }

            public void setCtime(int ctime) {
                this.ctime = ctime;
            }

            public int getLikes() {
                return likes;
            }

            public void setLikes(int likes) {
                this.likes = likes;
            }

            public MediaBean getMedia() {
                return media;
            }

            public void setMedia(MediaBean media) {
                this.media = media;
            }

            public int getMtime() {
                return mtime;
            }

            public void setMtime(int mtime) {
                this.mtime = mtime;
            }

            public int getReply() {
                return reply;
            }

            public void setReply(int reply) {
                this.reply = reply;
            }

            public int getReview_id() {
                return review_id;
            }

            public void setReview_id(int review_id) {
                this.review_id = review_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public UserRatingBean getUser_rating() {
                return user_rating;
            }

            public void setUser_rating(UserRatingBean user_rating) {
                this.user_rating = user_rating;
            }

            public static class AuthorBean {
                /**
                 * avatar : http://i1.hdslb.com/bfs/face/6a207ac41f037b068e4603d58081c10557746506.jpg
                 * mid : 2061401
                 * uname : 観月三重
                 */

                private String avatar;
                private int mid;
                private String uname;

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }

                public int getMid() {
                    return mid;
                }

                public void setMid(int mid) {
                    this.mid = mid;
                }

                public String getUname() {
                    return uname;
                }

                public void setUname(String uname) {
                    this.uname = uname;
                }
            }

            public static class MediaBean {
                /**
                 * cover : http://i0.hdslb.com/bfs/bangumi/768995301fe98573e1d2e330b86612d9e195ab06.jpg
                 * media_id : 2261
                 * title : 星际牛仔
                 */

                private String cover;
                private int media_id;
                private String title;

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public int getMedia_id() {
                    return media_id;
                }

                public void setMedia_id(int media_id) {
                    this.media_id = media_id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }

            public static class UserRatingBean {
                /**
                 * score : 10
                 */

                private int score;

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }
            }
        }

        public static class TimelineBean {
            /**
             * area_id : 1
             * cover : http://i0.hdslb.com/bfs/bangumi/9941df2e31f4d77f2dd6b3a2d2cff7746c2f9107.jpg
             * delay : 0
             * ep_id : 200607
             * favorites : 220087
             * follow : 0
             * is_published : 1
             * order : 16
             * pub_date : 2018-04-09
             * pub_index : 第13话
             * pub_time : 12:00
             * pub_ts : 1523246400
             * season_id : 22829
             * season_status : 2
             * square_cover : http://i0.hdslb.com/bfs/bangumi/b6ad2e54d579160ee36692871aa8aeea13f3db63.jpg
             * title : 斗罗大陆2绝世唐门
             */

            private int area_id;
            private String cover;
            private int delay;
            private int ep_id;
            private int favorites;
            private int follow;
            private int is_published;
            private int order;
            private String pub_date;
            private String pub_index;
            private String pub_time;
            private int pub_ts;
            private int season_id;
            private int season_status;
            private String square_cover;
            private String title;

            public int getArea_id() {
                return area_id;
            }

            public void setArea_id(int area_id) {
                this.area_id = area_id;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getDelay() {
                return delay;
            }

            public void setDelay(int delay) {
                this.delay = delay;
            }

            public int getEp_id() {
                return ep_id;
            }

            public void setEp_id(int ep_id) {
                this.ep_id = ep_id;
            }

            public int getFavorites() {
                return favorites;
            }

            public void setFavorites(int favorites) {
                this.favorites = favorites;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public int getIs_published() {
                return is_published;
            }

            public void setIs_published(int is_published) {
                this.is_published = is_published;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public String getPub_date() {
                return pub_date;
            }

            public void setPub_date(String pub_date) {
                this.pub_date = pub_date;
            }

            public String getPub_index() {
                return pub_index;
            }

            public void setPub_index(String pub_index) {
                this.pub_index = pub_index;
            }

            public String getPub_time() {
                return pub_time;
            }

            public void setPub_time(String pub_time) {
                this.pub_time = pub_time;
            }

            public int getPub_ts() {
                return pub_ts;
            }

            public void setPub_ts(int pub_ts) {
                this.pub_ts = pub_ts;
            }

            public int getSeason_id() {
                return season_id;
            }

            public void setSeason_id(int season_id) {
                this.season_id = season_id;
            }

            public int getSeason_status() {
                return season_status;
            }

            public void setSeason_status(int season_status) {
                this.season_status = season_status;
            }

            public String getSquare_cover() {
                return square_cover;
            }

            public void setSquare_cover(String square_cover) {
                this.square_cover = square_cover;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }

    public static void getAnimFanData(String timeStamp, FanCallBack callBack){
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Contants.FAN)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        HttpApiService bannerService = retrofit.create(HttpApiService.class);
        Observable<AnimFan> bannerObservable = bannerService.getFanService(timeStamp);
        bannerObservable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<AnimFan>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(AnimFan animFan) {
                        callBack.onSuccess(animFan);
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
