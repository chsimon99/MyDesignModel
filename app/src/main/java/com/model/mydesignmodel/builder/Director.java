package com.model.mydesignmodel.builder;

/**
 * @author IMXU
 * @time 2017/12/21 15:56
 * @des ${TODO}
 * 邮箱：butterfly_xu@sina.com
 */

public class Director {

    public Product createBuilder(BuilderInter builderInter,String name){
        builderInter.createProduct(name);
        builderInter.builderBody();
        builderInter.builderHead();

        return builderInter.getProduct();
    }

}
