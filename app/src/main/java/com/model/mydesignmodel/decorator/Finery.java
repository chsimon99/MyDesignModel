package com.model.mydesignmodel.decorator;

/**
 * @author IMXU
 * @time 2017/12/20 11:07
 * @des 装饰设计模式  Decorator
 * 邮箱：butterfly_xu@sina.com
 */

public class Finery extends Person {

    protected Person component;

    public void decorate(Person person){
        component = person;
    }

    public  void show(){
        if(component !=null){
            component.show();
        }
    }
}
