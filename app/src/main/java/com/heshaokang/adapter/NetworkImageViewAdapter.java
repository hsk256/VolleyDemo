package com.heshaokang.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.heshaokang.util.BitmapCache;
import com.heshaokang.util.VolleyUtil;
import com.heshaokang.volleydemo.R;

/**
 * Created by heshaokang on 2015/4/16.
 */
public class NetworkImageViewAdapter extends ImageBaseAdapter{
    private ImageLoader imageLoader;
    public NetworkImageViewAdapter(Context context, String[] imageUrl) {
        super(context, imageUrl);
        imageLoader = new ImageLoader(VolleyUtil.getRequestQueue(context),new BitmapCache());
    }

    @Override
    int getItemLayout() {
        return R.layout.networkimageview_list_item;
    }

    @Override
    void setImage(ImageView imageView, String imageUrl) {
        NetworkImageView networkImageView = (NetworkImageView) imageView;
        //默认图片
        networkImageView.setDefaultImageResId(R.drawable.empty_image);
        //加载失败的图片
        networkImageView.setErrorImageResId(R.drawable.failed);
        //指定图片的url地址
        networkImageView.setImageUrl(imageUrl,imageLoader);
    }
}
