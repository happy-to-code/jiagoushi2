package com.yida.design_mode.creation_mode.simple_factory;

public abstract class Shape {
    // 公共方法
    public void show() {
        System.out.println("-----------------Shape abstract 公共方法-----------------");
    }
    // 抽象方法
    public abstract void draw();
}
