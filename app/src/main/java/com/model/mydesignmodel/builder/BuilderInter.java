package com.model.mydesignmodel.builder;

/**
 * @author IMXU
 * @time 2017/12/21 15:46
 * @des ${TODO}
 * 邮箱：butterfly_xu@sina.com
 */

public interface BuilderInter {

    void createProduct(String name);
    void builderBody();
    void builderHead();
    Product getProduct();
}
