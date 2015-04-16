package com.heshaokang.util;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by heshaokang on 2015/4/16.
 * RequestQuene 的单例
 */
public class VolleyUtil {
    private volatile static RequestQueue requestQueue ;
    public static RequestQueue getRequestQueue(Context context) {
        if(requestQueue==null) {

            synchronized (VolleyUtil.class) {
                if(requestQueue==null) {
                    requestQueue = Volley.newRequestQueue(context);
                }

            }
        }
        return requestQueue;
    }
}
