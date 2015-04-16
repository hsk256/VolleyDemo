package com.heshaokang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.heshaokang.adapter.NetworkImageViewAdapter;
import com.heshaokang.util.Constants;
import com.heshaokang.volleydemo.R;

/**
 * Created by heshaokang on 2015/4/16.
 */
public class NetworkImageViewFragment extends Fragment {
    private GridView grid_view;
    private String[] imageUrl = Constants.IMAGES_URL;
    public static final int INDEX = 2;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.imagerequest_fragment,container,false);
        grid_view = (GridView) view.findViewById(R.id.grid_view);
        NetworkImageViewAdapter adapter = new NetworkImageViewAdapter(getActivity(),imageUrl);
        grid_view.setAdapter(adapter);
        return view;
    }
}
