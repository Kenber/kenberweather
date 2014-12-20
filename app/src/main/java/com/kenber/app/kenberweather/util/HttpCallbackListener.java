package com.kenber.app.kenberweather.util;

/**
 * Created by Kenber on 2014/12/20.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
