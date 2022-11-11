package com.yida.self.list_demo.demo2;

import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/9 17:37
 * @Version:
 */
public class Demo implements Serializable {
    private static final long serialVersionUID = -5813133861770882248L;

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<List<Integer>> partition = Lists.partition(list, 2);
        partition.forEach(l-> System.out.println(l));
    }
}
