package com.heshaokang.volleydemo;

import android.content.Intent;
import android.drm.DrmManagerClient;
import android.graphics.Bitmap;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.heshaokang.fragment.ImageLoaderFragment;
import com.heshaokang.fragment.ImageRequestFragment;
import com.heshaokang.fragment.NetworkImageViewFragment;
import com.heshaokang.fragment.StringRequestFragment;
import com.heshaokang.util.Constants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        //图片请求
        findViewById(R.id.btn_imageRequest).setOnClickListener(this);
        findViewById(R.id.btn_imageLoader).setOnClickListener(this);
        findViewById(R.id.btn_networkImageView).setOnClickListener(this);
        //string 请求
        findViewById(R.id.btn_string).setOnClickListener(this);
        //json 请求
        findViewById(R.id.btn_json).setOnClickListener(this);
        //自定义xml请求
        findViewById(R.id.btn_xml).setOnClickListener(this);
        //自定义post请求
        findViewById(R.id.btn_post).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,RequestActivity.class);
        switch (view.getId()) {
            case R.id.btn_imageRequest:
                intent.putExtra(Constants.Extra.FRAGMENT_INDEX, ImageRequestFragment.INDEX);
               break;
            case R.id.btn_imageLoader:
                intent.putExtra(Constants.Extra.FRAGMENT_INDEX, ImageLoaderFragment.INDEX);
                break;
            case R.id.btn_networkImageView:
                intent.putExtra(Constants.Extra.FRAGMENT_INDEX, NetworkImageViewFragment.INDEX);
                break;
            case R.id.btn_string:
                intent.putExtra(Constants.Extra.FRAGMENT_INDEX, StringRequestFragment.INDEX);
                break;
            case R.id.btn_json:
                break;
            case R.id.btn_xml:
                break;
            case R.id.btn_post:
                break;
            default:
                break;
        }
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
