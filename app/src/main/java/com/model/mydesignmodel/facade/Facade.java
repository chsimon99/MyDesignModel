package com.model.mydesignmodel.facade;

/**
 * @author IMXU
 * @time 2017/12/21 14:57
 * @des ${TODO}
 * 邮箱：butterfly_xu@sina.com
 */

public class Facade {

    private SubOne subOne;
    private SubTwo subTwo;
    private SubThree subThree;

    public Facade() {
        subOne = new SubOneImpl();
        subTwo = new SubTwoImpl();
        subThree = new SubThreeImpl();
    }

    public void methodA(){
        subOne.method1();
        subTwo.method2();
    }

    public void methodB(){
        subTwo.method2();
        subThree.method3();
    }
}
