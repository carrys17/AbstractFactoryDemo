package com.example.shang.abstractfactorydemo;

/**
 * Created by shang on 2017/11/4.
 */

// 具体工厂类1
public class ConcreteFactory1 extends Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
