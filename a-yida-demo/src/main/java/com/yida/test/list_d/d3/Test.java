package com.yida.test.list_d.d3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/9 9:22
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        List<Boy> boys = new ArrayList<>();
        boys.add(new Boy("xm", "2"));
        boys.add(new Boy("hh", "2"));
        boys.add(new Boy("hh", "1"));
        boys.add(new Boy("mm", "10"));

        Map<String, List<Boy>> name2Boys = boys.stream().collect(Collectors.groupingBy(item -> item.getName()));

        name2Boys.keySet().parallelStream().forEach(name -> {
            List<Boy> boys1 = name2Boys.get(name);
            BigDecimal ageTotal = boys1.stream().map(item -> BigDecimal.valueOf(Long.parseLong(item.getAge()))).reduce(BigDecimal.ZERO, BigDecimal::add);
            System.out.println(name + "   ageTotal = " + ageTotal);
        });
        String str = "1.34";
        long l = Double.doubleToLongBits(Double.parseDouble(str));
        System.out.println("l = " + l);

        BigDecimal bigDecimal = BigDecimal.valueOf(l);
        System.out.println("bigDecimal = " + bigDecimal);


    }
}

class Boy {
    private String name;
    private String age;

    public Boy(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Boy.class.getSimpleName() + "[", "]").add("name='" + name + "'").add("age='" + age + "'").toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
