package com.model.mydesignmodel.proxy;

/**
 * @author IMXU
 * @time 2017/12/20 15:52
 * @des ${TODO}
 * 邮箱：butterfly_xu@sina.com
 */

public class Proxy extends Subject {

    RealSubject realSubject;
    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }

}
