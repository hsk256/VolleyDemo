package com.heshaokang.custom;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.StringReader;
import java.io.UnsupportedEncodingException;

/**
 * Created by heshaokang on 2015/4/17.
 */
public class XmlRequest extends Request<XmlPullParser>{
    private final Response.Listener<XmlPullParser> mListner;

    public XmlRequest(String url, Response.Listener<XmlPullParser> mListner,Response.ErrorListener listener) {
        this(Method.GET,url, mListner,listener);
    }

    public XmlRequest(int method, String url,  Response.Listener<XmlPullParser> mListner,Response.ErrorListener listener) {
        super(method, url, listener);
        this.mListner = mListner;
    }

    @Override
    protected Response<XmlPullParser> parseNetworkResponse(NetworkResponse networkResponse) {
        String xmlString;
        try {
            xmlString = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = factory.newPullParser();
            parser.setInput(new StringReader(xmlString));
            return Response.success(parser, HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return Response.error(new ParseError(e));
        } catch (XmlPullParserException e) {
           return Response.error(new ParseError(e));
        }

    }

    @Override
    protected void deliverResponse(XmlPullParser xmlPullParser) {
        mListner.onResponse(xmlPullParser);
    }
}
