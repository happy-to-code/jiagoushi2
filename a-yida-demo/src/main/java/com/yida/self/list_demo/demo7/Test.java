package com.yida.self.list_demo.demo7;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/24 10:06
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        List<Boy> boys = new ArrayList<>();
        boys.add(new Boy(1, "a", 1));
        boys.add(new Boy(2, "b", 1));
        boys.add(new Boy(3, "c", 0));
        boys.add(new Boy(4, "d", 0));

        Integer status = 0;
        List<Integer> collect = boys.stream().filter(channel -> channel.getStatus() != status)
                .map(channel -> channel.getId())
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}

@Data
@AllArgsConstructor
class Boy {
    private Integer id;
    private String name;
    private Integer status;
}