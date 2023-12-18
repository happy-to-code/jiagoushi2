package com.yida.test5.arr_t;

import com.alibaba.druid.sql.visitor.SQLASTOutputVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyifei
 * @Date 2023/12/13 13:20
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        System.out.println("list = " + list);
        list.remove(2);
        list.add(44);
        System.out.println("list = " + list);
    }
}
