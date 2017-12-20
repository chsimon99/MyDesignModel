package com.model.mydesignmodel.decorator.finery;

import android.util.Log;

import com.model.mydesignmodel.decorator.Finery;

/**
 * @author IMXU
 * @time 2017/12/20 11:26
 * @des 装饰设计模式  ContreteDecorator
 * 邮箱：butterfly_xu@sina.com
 */

public class LeatherShoe extends Finery {
    @Override
    public void show() {
        Log.d("LeatherShoe","皮鞋");
        super.show();
    }
}
