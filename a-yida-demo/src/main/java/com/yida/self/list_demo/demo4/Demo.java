package com.yida.self.list_demo.demo4;

import cn.hutool.core.collection.CollUtil;

import java.util.List;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/10 10:42
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> bizOrderCustomerList = CollUtil.newArrayList();
        // bizOrderCustomerList.add(1);
        // bizOrderCustomerList.add(2);
        // bizOrderCustomerList.add(3);
        // bizOrderCustomerList.add(4);
        // bizOrderCustomerList.add(5);
        // bizOrderCustomerList.add(6);

        Integer a = 11;

        for (int i = 0; i < a; i++) {
            bizOrderCustomerList.add(i + 1);
            if (i > 0 && i % 2 == 0) {
                System.out.println("bizOrderCustomerList = " + bizOrderCustomerList);
                bizOrderCustomerList.clear();
            }
        }
        if (CollUtil.isNotEmpty(bizOrderCustomerList)) {
            System.out.println("bizOrderCustomerList = " + bizOrderCustomerList);
            bizOrderCustomerList.clear();
        }
        System.out.println("bizOrderCustomerList = " + bizOrderCustomerList);
    }
}
