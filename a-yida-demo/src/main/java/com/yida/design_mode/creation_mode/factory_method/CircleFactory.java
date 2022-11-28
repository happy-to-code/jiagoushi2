package com.yida.design_mode.creation_mode.factory_method;

import com.yida.design_mode.creation_mode.simple_factory.Circle;
import com.yida.design_mode.creation_mode.simple_factory.Shape;

public class CircleFactory extends AbstractFactory {
    /**
     * 返回具体的 Circle 实例
     *
     * @return
     */
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
