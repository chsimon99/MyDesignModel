package com.model.mydesignmodel.factoryMethod;

/**
 * @author IMXU
 * @time 2017/12/20 17:25
 * @des ${TODO}
 * 邮箱：butterfly_xu@sina.com
 */

public class UnderGraduateFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new UnderGraduate();
    }
}
