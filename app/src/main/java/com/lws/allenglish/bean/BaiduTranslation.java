package com.lws.allenglish.bean;

import java.util.List;

/**
 * Created by Wilson on 2016/12/15.
 */

public class BaiduTranslation extends BaseTranslation {

    /**
     * from : zh
     * to : en
     * trans_result : [{"src":"高度600米","dst":"Height 600 meters"}]
     */

    public String from;
    public String to;
    public List<TransResultEntity> trans_result;

    public static class TransResultEntity {
        /**
         * src : 高度600米
         * dst : Height 600 meters
         */

        public String src;
        public String dst;
    }
}
