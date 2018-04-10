package com.icode.jiling.vmall.viewmodel;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public  class DataBean implements Serializable,Comparable{
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

    @Override
    public int compareTo(@NonNull Object o) {
        if(o == null || TextUtils.isEmpty(this.getTitle())){
            return 0;
        }
        if(o instanceof DataBean){
            DataBean model = (DataBean)o;
            return this.getTitle().equals(model.getTitle()) ? 1:0;
        }
        return 0;
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