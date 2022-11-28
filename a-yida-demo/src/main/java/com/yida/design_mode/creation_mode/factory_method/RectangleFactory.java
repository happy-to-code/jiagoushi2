package com.yida.design_mode.creation_mode.factory_method;

import com.yida.design_mode.creation_mode.simple_factory.Rectangle;
import com.yida.design_mode.creation_mode.simple_factory.Shape;

public class RectangleFactory extends AbstractFactory {
    /**
     * 返回具体的 Rectangle 实例
     *
     * @return
     */
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
