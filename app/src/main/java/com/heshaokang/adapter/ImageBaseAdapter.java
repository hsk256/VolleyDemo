package com.heshaokang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.heshaokang.volleydemo.R;

/**
 * Created by heshaokang on 2015/4/15.
 * 图片适配器的抽象类
 */
public abstract class ImageBaseAdapter extends BaseAdapter{
    private LayoutInflater inflater;
    private String[] imageUrl;
    public ImageBaseAdapter(Context context, String[] imageUrl) {
        this.inflater = LayoutInflater.from(context);
        this.imageUrl = imageUrl;
    }

    @Override
    public int getCount() {
        if(imageUrl==null) {
            return 0;
        }else {
            return imageUrl.length;
        }
    }

    @Override
    public Object getItem(int i) {
        if(imageUrl==null || i>=imageUrl.length) {
            return 0;
        }else {
            return imageUrl[i];
        }
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if(view==null) {
            view = this.inflater.inflate(getItemLayout(),viewGroup,false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) view.findViewById(R.id.imageView);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        setImage(viewHolder.imageView,imageUrl[i]);
        return view;
    }
    static class ViewHolder {
        ImageView imageView;
    }
    //获得布局文件
    abstract int getItemLayout();
    //设置图片 imageView 未加载的图片 imageUrl 图片地址
    abstract  void setImage(ImageView imageView,String imageUrl);
}
