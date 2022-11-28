package com.yida.design_mode.creation_mode.factory_method;

import com.yida.design_mode.creation_mode.simple_factory.Shape;
import com.yida.design_mode.creation_mode.simple_factory.Square;

public class SquareFactory extends AbstractFactory {
    /**
     * 返回具体的 Square 实例
     *
     * @return
     */
    @Override
    public Shape getShape() {
        return new Square();
    }
}
