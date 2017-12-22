package com.model.mydesignmodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.model.mydesignmodel.builder.ConcreteBuilderA;
import com.model.mydesignmodel.builder.ConcreteBuilderB;
import com.model.mydesignmodel.builder.Director;
import com.model.mydesignmodel.builder.Product;
import com.model.mydesignmodel.decorator.Person;
import com.model.mydesignmodel.decorator.finery.Sneakers;
import com.model.mydesignmodel.decorator.finery.Suit;
import com.model.mydesignmodel.decorator.finery.TShirt;
import com.model.mydesignmodel.facade.Facade;
import com.model.mydesignmodel.factoryMethod.IFactory;
import com.model.mydesignmodel.factoryMethod.LeiFeng;
import com.model.mydesignmodel.factoryMethod.VolunteerFactory;
import com.model.mydesignmodel.observer.ConcreteObserverA;
import com.model.mydesignmodel.observer.ConcreteObserverB;
import com.model.mydesignmodel.observer.Observable;
import com.model.mydesignmodel.proxy.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 装饰模式
         */
        Person person = new Person("小张");
        Sneakers sneakers = new Sneakers();
        TShirt tShirt = new TShirt();
        Suit suit = new Suit();

        sneakers.decorate(person);
        tShirt.decorate(sneakers);
        suit.decorate(tShirt);
        suit.show();

        /**
         * 代理模式
         */
        Proxy proxy = new Proxy();
        proxy.request();


        /**
         * 工厂方法模式
         */
//        IFactory iFactory = new UnderGraduateFactory();
        IFactory iFactory = new VolunteerFactory();
        LeiFeng leiFeng = iFactory.createLeiFeng();

        leiFeng.sweep();
        leiFeng.wash();
        leiFeng.buyRice();

        /**
         * 外观模式
         */
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();

        /**
         * 建造者模式
         */
        Director director = new Director();

        Product productA = director.createBuilder(new ConcreteBuilderA(), "方法A");
        productA.show();
        Product productB = director.createBuilder(new ConcreteBuilderB(), "方法B");
        productB.show();

        /**
         * 观察者模式
         */
        Observable observable = new Observable();
        observable.addObserver(new ConcreteObserverA());
        observable.addObserver(new ConcreteObserverB());
        observable.changed();



    }
}
