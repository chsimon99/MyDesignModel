package com.model.mydesignmodel.builder;

/**
 * @author IMXU
 * @time 2017/12/21 15:53
 * @des ${TODO}
 * 邮箱：butterfly_xu@sina.com
 */

public class ConcreteBuilderB implements BuilderInter {

    private Product product;
    @Override
    public void createProduct(String name) {
        product = new Product(name);
    }

    @Override
    public void builderBody() {
        product.setBody("body B");
    }

    @Override
    public void builderHead() {
        product.setHead("head B");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
