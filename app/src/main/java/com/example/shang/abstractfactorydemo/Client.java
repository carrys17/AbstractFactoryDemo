package com.example.shang.abstractfactorydemo;

/**
 * Created by shang on 2017/11/4.
 */

public class Client {
    public static void main(String []args){
        Factory factory = new ConcreteFactory1();
        factory.createProductA().method();
        factory.createProductB().method();

        Factory factory2 = new ConcreteFactory2();
        factory2.createProductA().method();
        factory2.createProductB().method();
    }
}


