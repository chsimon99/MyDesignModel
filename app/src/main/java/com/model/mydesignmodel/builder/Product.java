package com.model.mydesignmodel.builder;

/**
 * @author IMXU
 * @time 2017/12/21 15:42
 * @des ${TODO}
 * 邮箱：butterfly_xu@sina.com
 */

public class Product {

    private String name;
    private String body;
    private String head;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void show(){
        System.out.println(toShowString());
    }

    private String toShowString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", body='" + body + '\'' +
                ", head='" + head + '\'' +
                '}';
    }
}
