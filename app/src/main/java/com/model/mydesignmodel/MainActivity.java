package com.model.mydesignmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.model.mydesignmodel.decorator.Person;
import com.model.mydesignmodel.decorator.finery.Sneakers;
import com.model.mydesignmodel.decorator.finery.Suit;
import com.model.mydesignmodel.decorator.finery.TShirt;
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




    }
}
