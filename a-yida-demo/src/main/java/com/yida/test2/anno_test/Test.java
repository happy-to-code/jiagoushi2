package com.yida.test2.anno_test;

import java.lang.reflect.Field;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/2/1 11:14
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        House house = new House();
        house.setAddress("南京");
        house.setLength(200);
        house.setWidth(200);
        house.setHeight(200);
        System.out.println("house = " + house);

        // 获取字节码
        Class<? extends House> houseClass = house.getClass();
        Field[] declaredFields = houseClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
        System.out.println("-----------------------------");
        for (Field declaredField : declaredFields) {
            AnnoTest annotation = declaredField.getAnnotation(AnnoTest.class);
            System.out.println("annotation = " + annotation);
            if (annotation != null) {
                String val = annotation.val();
                int num = annotation.num();
                System.out.println(declaredField + "\t" + val + "\t" + num);
            }
        }


    }
}
