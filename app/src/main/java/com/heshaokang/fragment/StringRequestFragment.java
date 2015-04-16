package com.heshaokang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.heshaokang.util.UrlUtil;
import com.heshaokang.util.VolleyUtil;
import com.heshaokang.volleydemo.R;

/**
 * Created by heshaokang on 2015/4/16.
 */
public class StringRequestFragment extends Fragment{
    public static final int INDEX=3;
    private Button btn_stringButton;
    private EditText editText;
    private TextView tv_data;
    private View view;
    private RequestQueue requestQueue;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.string_request_list_item,container,false);
        init();
        return view;
    }
    public void init() {
        btn_stringButton = (Button) view.findViewById(R.id.bt_getString);
        editText = (EditText) view.findViewById(R.id.et_text);
        tv_data = (TextView) view.findViewById(R.id.tv_data);
        btn_stringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString().trim();
                //取消之前没有请求完的请求
                VolleyUtil.getRequestQueue(getActivity()).cancelAll(this);
                requestQueue = VolleyUtil.getRequestQueue(getActivity());
                if(url==null||url.length()<=0) {
                    Toast.makeText(getActivity(),"请求地址为空",Toast.LENGTH_SHORT).show();
                    return;
                }
                StringRequest stringRequest = new StringRequest(
                        UrlUtil.transformUrl(url),
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String s) {
                                tv_data.setText(s);
                                Log.d("StringRequest",s);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {
                                tv_data.setText(volleyError.getMessage());
                            }
                        }
                );
                requestQueue.add(stringRequest);
            }
        });
    }
}
