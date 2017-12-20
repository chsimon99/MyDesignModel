package com.model.mydesignmodel.decorator;

import android.util.Log;

/**
 * @author IMXU
 * @time 2017/12/20 11:00
 * @des  装饰设计模式  ConcreteComponent
 * 邮箱：butterfly_xu@sina.com
 */

public class Person {
    String TAG = getClass().getSimpleName();
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        Log.d(TAG,"----"+name);
    }
}
