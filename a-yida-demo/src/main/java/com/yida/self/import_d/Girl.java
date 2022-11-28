package com.yida.self.import_d;

import lombok.Data;

/**
 * @Type: Boy.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/28 9:50
 * @Version:
 */
@Data
public class Girl {
    private String id;
    private String name;
    private Integer age;


    public void like() {
        System.out.println("like:flower");
    }
}
