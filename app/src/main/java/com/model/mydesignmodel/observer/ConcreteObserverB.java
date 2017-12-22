package com.model.mydesignmodel.observer;

/**
 * @author IMXU
 * @time 2017/12/22 17:04
 * @des ${TODO}
 * 邮箱：butterfly_xu@sina.com
 */

public class ConcreteObserverB implements Observer {
    @Override
    public void update(Observable observable) {

        System.out.println("观察者2观察到" + observable.getClass().getSimpleName() + "发生变化");
        System.out.println("观察者2做出相应");
    }
}
