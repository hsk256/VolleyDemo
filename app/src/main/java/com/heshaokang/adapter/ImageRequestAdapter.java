package com.heshaokang.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.heshaokang.util.VolleyUtil;
import com.heshaokang.volleydemo.R;

/**
 * Created by heshaokang on 2015/4/15.
 */
public class ImageRequestAdapter extends ImageBaseAdapter{
    private Context context;
    public ImageRequestAdapter(Context context, String[] imageUrl) {
        super(context, imageUrl);
        this.context = context;
    }

    @Override
    int getItemLayout() {
        return R.layout.imagerequest_list_item;
    }

    @Override
    void setImage(final ImageView imageView, String imageUrl) {
        //设置未加载时的默认图片
        imageView.setImageResource(R.drawable.empty_image);
        //取消这个ImageView已有的请求
        VolleyUtil.getRequestQueue(context).cancelAll(imageView);
        ImageRequest imageRequest = new ImageRequest(
                imageUrl,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap bitmap) {
                        imageView.setImageBitmap(bitmap);
                    }
                },
                0,0, Bitmap.Config.RGB_565,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        imageView.setImageResource(R.drawable.empty_image);
                    }
                }
        );
        VolleyUtil.getRequestQueue(context).add(imageRequest);
    }
}
