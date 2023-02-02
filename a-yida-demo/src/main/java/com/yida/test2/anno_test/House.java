package com.yida.test2.anno_test;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @Type: House.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/2/1 11:11
 * @Version:
 */
public class House implements Serializable {
    private static final long serialVersionUID = -5483313290419882452L;

    @AnnoTest(val = "北京", num = 1000)
    private String address;

    @AnnoTest(val = "东", num = 30)
    private Integer length;
    private Integer width;
    private Integer height;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", House.class.getSimpleName() + "[", "]")
                .add("address='" + address + "'")
                .add("length=" + length)
                .add("width=" + width)
                .add("height=" + height)
                .toString();
    }
}
