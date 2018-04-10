package com.icode.jiling.vmall.viewmodel;

import java.util.List;

public class BannerItemBean {
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
