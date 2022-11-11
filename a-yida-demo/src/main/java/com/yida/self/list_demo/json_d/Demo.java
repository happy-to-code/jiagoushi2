package com.yida.self.list_demo.json_d;

import cn.hutool.json.JSONUtil;
import lombok.Data;

import java.util.List;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/11 9:37
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        String s = "[{\"name\":\"xm\",\"age\":18}]";

        List<Girl> girls = JSONUtil.toList(JSONUtil.parseArray(s), Girl.class);
        System.out.println("girls = " + girls);


        // Girl girl = null;
        // if (StrUtil.isNotBlank(s)) {
        //     girl = JSONUtil.toBean(s, Girl.class);
        // }
        // System.out.println("girl = " + girl);
    }

}

@Data
class Girl {
    private String name;
    private Integer age;
}
