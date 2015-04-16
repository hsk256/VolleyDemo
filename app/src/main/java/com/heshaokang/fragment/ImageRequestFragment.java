package com.heshaokang.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.heshaokang.adapter.ImageRequestAdapter;
import com.heshaokang.util.Constants;
import com.heshaokang.volleydemo.R;

/**
 * Created by heshaokang on 2015/4/15.
 * 图片请求
 */
public class ImageRequestFragment extends Fragment{
    public static final int INDEX = 0;
    private String[] imageUrl = Constants.IMAGES_URL;
    private GridView gridView;
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.imagerequest_fragment,container,false);
        gridView = (GridView) view.findViewById(R.id.grid_view);
        ImageRequestAdapter adapter = new ImageRequestAdapter(getActivity(),imageUrl);
        gridView.setAdapter(adapter);
        return view;
    }
}
