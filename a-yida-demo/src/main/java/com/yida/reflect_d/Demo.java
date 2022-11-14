package com.yida.reflect_d;

import com.yida.pojo.Person;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/14 9:43
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(10);
        person.setName("xiaoming");
        System.out.println("person = " + person);

        Class<? extends Person> personClass = person.getClass();
        System.out.println("personClass = " + personClass);
        System.out.println("personClass.getName() = " + personClass.getName());
    }
}
