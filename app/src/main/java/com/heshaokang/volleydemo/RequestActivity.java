package com.heshaokang.volleydemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.heshaokang.fragment.ImageLoaderFragment;
import com.heshaokang.fragment.ImageRequestFragment;
import com.heshaokang.util.Constants;

/**
 * Created by heshaokang on 2015/4/15.
 */
public class RequestActivity extends FragmentActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int fragmentIndex = getIntent().getIntExtra(Constants.Extra.FRAGMENT_INDEX,0);
        Fragment fr;
        String tag;
        int title;
        switch (fragmentIndex) {
            default:
            case ImageRequestFragment.INDEX:
                tag = ImageRequestFragment.class.getSimpleName();
                fr = getSupportFragmentManager().findFragmentByTag(tag);
                if(fr==null) {
                    fr = new ImageRequestFragment();
                }
                title = R.string.imageRequeset;
                System.out.println("RequestActivity---ImageRequestFragment");
                break;

            case ImageLoaderFragment.INDEX:
                tag = ImageLoaderFragment.class.getSimpleName();
                fr = getSupportFragmentManager().findFragmentByTag(tag);
                if(fr==null) {
                    fr = new ImageLoaderFragment();
                }
                title = R.string.ImageLoader;
                System.out.println("RequestActivity---ImageLoaderFragment");
                break;
        }
        setTitle(title);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content,fr,tag).commit();
    }
}
