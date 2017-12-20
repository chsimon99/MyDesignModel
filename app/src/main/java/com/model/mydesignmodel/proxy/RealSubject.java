package com.model.mydesignmodel.proxy;

import android.util.Log;

/**
 * @author IMXU
 * @time 2017/12/20 15:51
 * @des ${TODO}
 * 邮箱：butterfly_xu@sina.com
 */

public class RealSubject extends Subject {

    @Override
    public void request() {
        Log.d("RealSubject","真实的请求");
    }
}
