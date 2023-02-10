package com.yida.test2.d_2;

import java.util.StringJoiner;

/**
 * @Type: TestEnum.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/2/8 16:17
 * @Version:
 */
public enum TestEnum {
    XM("XiaoMing",12),
    XH("XiaoHong",18);

    private String name;
    private Integer age;


    TestEnum(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", TestEnum.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }
}
