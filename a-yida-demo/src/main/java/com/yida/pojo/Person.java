package com.yida.pojo;

import java.io.Serializable;

/**
 * @Type: Person.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/14 9:44
 * @Version:
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 8185480882553688096L;

    public Integer id;
    private String name;
    public Integer age;


    public void select() {
        System.out.println("person select");
    }

    public void update() {
        System.out.println("person update");
    }


    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }
}
