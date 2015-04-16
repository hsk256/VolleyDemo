package com.heshaokang.util;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

import com.android.volley.toolbox.ImageLoader;

/**
 * Created by heshaokang on 2015/4/16.
 */
public class BitmapCache implements ImageLoader.ImageCache {
    LruCache<String,Bitmap> lruCache;
    public BitmapCache() {
        int size = 10*1024*1024;
        lruCache = new LruCache<String,Bitmap>(size) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes()*value.getHeight();
            }
        };
    }
    @Override
    public Bitmap getBitmap(String s) {
        return lruCache.get(s);
    }

    @Override
    public void putBitmap(String s, Bitmap bitmap) {
        lruCache.put(s,bitmap);
    }
}
