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
import com.heshaokang.custom.XmlRequest;
import com.heshaokang.util.Constants;
import com.heshaokang.util.VolleyUtil;
import com.heshaokang.volleydemo.R;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by heshaokang on 2015/4/17.
 */
public class XmlRequestFragment extends Fragment{
    public static final int INDEX = 5;
    private List<Map<String,String>> dataList;
    private ListView mListView;
    private SimpleAdapter adapter;
    private final int[] ids = {R.id.tv_name,R.id.tv_detail,R.id.tv_temp,R.id.tv_wind};
    private final String[] keys = {"city","detail","temp","wind"};

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.xmlrequest_fragment,container,false);
        dataList = new ArrayList<Map<String,String>>();
        mListView = (ListView) view.findViewById(R.id.xml_listview);
        adapter = new SimpleAdapter(getActivity(),dataList,R.layout.xmlrequest_list_item,keys,ids);
        mListView.setAdapter(adapter);
        XmlRequest xmlRequest = new XmlRequest(
                Constants.XML_REQUEST_URL,
               new Response.Listener<XmlPullParser>() {
                   @Override
                   public void onResponse(XmlPullParser xmlPullParser) {
                       try {
                           //得到当前的解析事件
                           int eventType = xmlPullParser.getEventType();
                           while(eventType!=XmlPullParser.END_DOCUMENT) {
                               switch (eventType) {
                                   case XmlPullParser.START_TAG:
                                       String nodeName = xmlPullParser.getName();
                                       if("city".equals(nodeName)) {
                                           Map<String,String> map = new HashMap<String,String>();
                                           map.put("city",xmlPullParser.getAttributeValue(2));
                                           map.put("detail",xmlPullParser.getAttributeValue(5));
                                           map.put("temp",xmlPullParser.getAttributeValue(7)+"℃到"+xmlPullParser.getAttributeValue(6)+"℃");
                                           map.put("wind",xmlPullParser.getAttributeValue(8));
                                           dataList.add(map);
                                       }
                                       break;
                               }
                               //获取下一个事件
                               eventType = xmlPullParser.next();
                           }

                        adapter.notifyDataSetChanged();
                       } catch (XmlPullParserException e) {
                           e.printStackTrace();
                       } catch (IOException e) {
                           e.printStackTrace();
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
        VolleyUtil.getRequestQueue(getActivity()).add(xmlRequest);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        VolleyUtil.getRequestQueue(getActivity()).cancelAll(this);
    }
}
