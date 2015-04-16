package com.heshaokang.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import android.widget.ImageView;

import com.android.volley.toolbox.ImageLoader;
import com.heshaokang.util.VolleyUtil;
import com.heshaokang.volleydemo.R;

/**
 * Created by heshaokang on 2015/4/16.
 * 使用ImageLoader来加载图片 可以过滤掉重复的url 避免重复发送请求
 */
public class ImageLoaderAdapter extends ImageBaseAdapter{
    private ImageLoader imageLoader;
    public ImageLoaderAdapter(Context context, String[] imageUrl) {
        super(context, imageUrl);
        imageLoader = new ImageLoader(VolleyUtil.getRequestQueue(context),new BitmapCache());
    }

    @Override
    int getItemLayout() {
        return R.layout.imagerequest_list_item;
    }

    @Override
    void setImage(ImageView imageView, String imageUrl) {
        ImageLoader.ImageContainer imageContainer;
        //如果当前imageView上存在请求 先取消
        if(imageView.getTag()!=null) {
            imageContainer = (ImageLoader.ImageContainer) imageView.getTag();
            imageContainer.cancelRequest();
        }
        ImageLoader.ImageListener imageListener = ImageLoader.getImageListener(imageView,
                R.drawable.empty_image,R.drawable.failed);
        imageContainer = imageLoader.get(imageUrl,imageListener);
        //存储当前请求的container 用于取消请求
        imageView.setTag(imageContainer);
    }
    private class BitmapCache implements ImageLoader.ImageCache {
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
}
