package com.yida.design_mode.simple_factory;

public class Test {
    public static void main1(String[] args) {
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();

        Shape square = ShapeFactory.getShape("Square");
        square.draw();
        System.out.println("=========================");
        rectangle.show();
        circle.show();
        square.show();
    }

    /**
     * 工厂方法使用XML形式
     *
     * @param args
     */
    public static void main2(String[] args) {
        String shapeType = XMLUtil.getChartType();
        Shape shape = ShapeFactory.getShape(shapeType);
        shape.draw();
    }

    /**
     * 工厂方法使用反射
     *
     * @param args
     */
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getClass(Circle.class);
        shape.draw();
        shape.show();
    }


}
