package com.heshaokang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.heshaokang.util.Constants;
import com.heshaokang.util.VolleyUtil;
import com.heshaokang.volleydemo.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by heshaokang on 2015/4/17.
 *
 * {"returncode":0,"message":"ok","result":
 * {"fctlist":[{"name":"法拉利","serieslist":
 * [{"id":676,"name":"California","imgurl":"http://car0.autoimg.cn/upload/2014/6/24/s_20140624120730477213.jpg","levelid":7,"levelname":"跑车","price":"308.80万"},
 * {"id":889,"name":"法拉利458","imgurl":"http://car0.autoimg.cn/upload/spec/5742/s_20101115174607698123.jpg","levelid":7,"levelname":"跑车","price":"388.00-448.00万"},
 * {"id":2682,"name":"F12berlinetta","imgurl":"http://car0.autoimg.cn/upload/2013/4/28/s_201304281710418974136.jpg","levelid":7,"levelname":"跑车","price":"530.80万"},
 * {"id":2261,"name":"法拉利FF","imgurl":"http://car0.autoimg.cn/upload/2014/5/7/s_201405072325573934218.jpg","levelid":7,"levelname":"跑车","price":"530.80万"},
 * {"id":3016,"name":"LaFerrari","imgurl":"http://car0.autoimg.cn/upload/2014/8/19/s_20140819181852565376510.jpg","levelid":7,"levelname":"跑车","price":"2250.00万"}]
 * }]}}
 */
public class JsonRequestFragment extends Fragment{
    public static final int INDEX=4;
    private SimpleAdapter adapter;
    private List<Map<String,String>> data ;
    private ListView mListView;
    private static final int[] ids = {R.id.tv_name,R.id.tv_level,R.id.tv_price};
    private static final String[] keys = {"name","level","price"};
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.jsonrequest_fragment,container,false);
        mListView = (ListView) view.findViewById(R.id.json_listview);
        data = new ArrayList<Map<String,String>>();
        adapter = new SimpleAdapter(getActivity(),data,R.layout.jsonrequest_list_item,keys,ids);
        mListView.setAdapter(adapter);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Constants.JSON_REQUEST_URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject jsonObject) {
                        //json对象中是否包含"result"
                        if(!jsonObject.has("result")) return;
                        try {
                            JSONObject result = jsonObject.getJSONObject("result");
                            if(!result.has("fctlist")) return;
                            JSONArray jsonArray = result.getJSONArray("fctlist");
                            //json数组长度为0时 表示没有数据
                            if(jsonArray.length()==0) return ;
                            JSONObject series = jsonArray.getJSONObject(0);
                            if(!series.has("serieslist")) return;
                            JSONArray factoryArray = series.getJSONArray("serieslist");
                            data.clear();
                            for(int i=0;i<factoryArray.length();i++) {
                                JSONObject carInfo = factoryArray.getJSONObject(i);
                                Map<String,String> map = new HashMap<String,String>();
                                map.put("name",carInfo.getString("name"));
                                map.put("level","级别:"+carInfo.getString("levelname"));
                                map.put("price","价格:"+carInfo.getString("price"));
                                data.add(map);
                            }
                            adapter.notifyDataSetChanged();
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(getActivity(),"json 请求异常",Toast.LENGTH_SHORT).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        Toast.makeText(getActivity(),volleyError.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }

        );
        jsonObjectRequest.setTag(this);
        VolleyUtil.getRequestQueue(getActivity()).add(jsonObjectRequest);


        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        VolleyUtil.getRequestQueue(getActivity()).cancelAll(this);
    }
}
