package com.heshaokang.util;

/**
 * Created by heshaokang on 2015/4/16.
 * 如果url 不带http则加上
 */
public class UrlUtil {
    public static String transformUrl(String url) {
        if(url==null) {
            return null;
        }

        if(url.startsWith("http://")||url.startsWith("https://")) {
            return url;
        }else {
            return "http://"+url;
        }

    }
}
