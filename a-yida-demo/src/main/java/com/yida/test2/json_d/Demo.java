package com.yida.test2.json_d;

import cn.hutool.json.JSONUtil;

import java.util.List;
import java.util.StringJoiner;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/11 11:28
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        String s = "{\n" +
                "\t\"tys\":[1,2,3,4],\n" +
                "\t\"startDate\":\"2022-11-01\",\n" +
                "\t\"endDate\":\"2022-12-01\"\n" +
                "}";

        Param param = JSONUtil.toBean(s, Param.class);
        System.out.println("param = " + param);
        List<Integer> tys = param.getTys();
        for (Integer ty : tys) {
            System.out.println("ty = " + ty);
        }
    }
}


class Param {
    private List<Integer> tys;
    private String startDate;
    private String endDate;

    public List<Integer> getTys() {
        return tys;
    }

    public void setTys(List<Integer> tys) {
        this.tys = tys;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Param.class.getSimpleName() + "[", "]")
                .add("tys=" + tys)
                .add("startDate='" + startDate + "'")
                .add("endDate='" + endDate + "'")
                .toString();
    }
}
