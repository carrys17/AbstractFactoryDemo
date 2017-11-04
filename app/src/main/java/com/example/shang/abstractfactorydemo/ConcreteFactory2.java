package com.example.shang.abstractfactorydemo;

/**
 * Created by shang on 2017/11/4.
 */

// 具体工厂类2
public class ConcreteFactory2 extends Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
