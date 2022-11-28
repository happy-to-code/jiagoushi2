package com.yida.design_mode.creation_mode.factory_method;

import com.yida.design_mode.creation_mode.simple_factory.Shape;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory;
        factory = new CircleFactory();
        Shape circle = factory.getShape();
        circle.draw();
        circle.show();
    }
}
