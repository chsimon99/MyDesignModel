package com.model.mydesignmodel.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IMXU
 * @time 2017/12/22 17:00
 * @des ${TODO}
 * 邮箱：butterfly_xu@sina.com
 */

public class Observable {

    List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void detachObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void changed(){
        System.out.println("我是被观察者，我已经发生变化了");
        notifyObservers();//通知观察自己的所有观察者
    }
}
