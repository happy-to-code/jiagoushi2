package com.yida.reflect_d.d2;

import com.yida.pojo.Animal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/28 15:39
 * @Version:
 */
public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<Animal> clazz = Animal.class;

        Field[] fields = clazz.getFields();  // 获取所有public字段
        for (Field field : fields) {
            System.out.println("public field = " + field);
        }
        System.out.println();

        Field[] allFields = clazz.getDeclaredFields();
        for (Field allField : allFields) {
            System.out.println("allField(public and private) = " + allField);
        }

        System.out.println();
        Method[] methods = clazz.getMethods(); // 获取类所有公共方法  包括继承的
        for (Method method : methods) {
            System.out.println("public method = " + method);
        }

        System.out.println();
        Method[] allMethods = clazz.getDeclaredMethods();  // 获取类自身的所有方法（public  private protect）
        for (Method method : allMethods) {
            System.out.println("all method = " + method);
        }
        System.out.println("-------------------------------------------------------------------");
        Method eat = clazz.getMethod("eat");
        System.out.println("eat = " + eat);


        Method say = clazz.getDeclaredMethod("say", String.class); // 此方法是私有的  不可以用 .getMethod() 方法获取
        System.out.println("say = " + say);

        System.out.println("=====================================================");
        Constructor<Animal> constructor = clazz.getConstructor(); // 获取无参构造器
        Animal animal = constructor.newInstance();
        System.out.println("animal = " + animal);
        animal.setAge(1);
        animal.setName("dog");
        System.out.println("animal = " + animal);

        System.out.println("///////////////////////////////////////////////////////////////////////////");
        say.setAccessible(true);
        say.invoke(animal,"hello");


    }
}
