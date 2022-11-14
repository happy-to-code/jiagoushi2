package com.yida.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Type: Person.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/14 9:44
 * @Version:
 */
@Data
public class Person implements Serializable {

    private static final long serialVersionUID = 8185480882553688096L;

    private String name;
    private Integer age;

    public void select(){
        System.out.println("person select");
    }

    public void update(){
        System.out.println("person update");
    }
}
