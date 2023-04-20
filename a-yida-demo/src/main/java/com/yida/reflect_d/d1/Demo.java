package com.yida.reflect_d.d1;

import com.yida.constants.ConstConstant;
import com.yida.pojo.Person;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/14.sql 9:43
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        int a = 50;
        System.out.println(a >>> 1);

        Integer number1 = ConstConstant.ARABIC_NUMBER_1;
        System.out.println("number1 = " + number1);
        System.out.println(number1.toString().equals("1"));


        Person person = new Person();
        person.setAge(10);
        person.setName("xiaoming");
        System.out.println("person = " + person);

        Class<? extends Person> personClass = person.getClass();
        System.out.println("personClass = " + personClass);
        System.out.println("personClass.getName() = " + personClass.getName());
    }
}
