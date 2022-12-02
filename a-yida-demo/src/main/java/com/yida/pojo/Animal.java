package com.yida.pojo;

import java.util.StringJoiner;

/**
 * @Type: Animal.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/28 15:48
 * @Version:
 */
public class Animal {
    public Integer age;
    private String name;

    public void eat() {
        System.out.println("吃…………");
    }

    private void say(String word) {
        System.out.println("说话…………" + word);
    }


    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Animal.class.getSimpleName() + "[", "]")
                .add("age=" + age)
                .add("name='" + name + "'")
                .toString();
    }
}
