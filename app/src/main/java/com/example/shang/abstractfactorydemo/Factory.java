package com.example.shang.abstractfactorydemo;

/**
 * Created by shang on 2017/11/4.
 */

// 抽象工厂类
public abstract class Factory {
    public abstract ProductA createProductA();
    public abstract ProductB createProductB();
}
