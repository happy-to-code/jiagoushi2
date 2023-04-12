package com.yida.test3.remove_list;

import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangyifei
 * @version: 1.0
 * @since: 2023/4/12 11:49
 */
public class RemoveTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("d");

        list.removeIf(l -> StrUtil.equals("c", l));

        System.out.println("list = " + list);


        String s = "$";
        s = s +"{initiator}";
        System.out.println("s = " + s);
        // s = s.replaceAll("${","").replaceAll("}","");
        s = StrUtil.replace(s, "${","");
        s = StrUtil.replace(s,"}","");
        System.out.println("s = " + s);
    }
}
