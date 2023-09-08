package com.yida.read_file;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.time.temporal.ValueRange;
import java.util.List;

/**
 * @author zhangyifei
 * @Date 2023/7/26 10:19
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());



        String path = "C:\\mydata\\project\\java_test\\jiagoushi\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\read_file\\1.txt";
        List<String> strings = FileUtil.readLines(new File(path), StandardCharsets.UTF_8);
        // System.out.println("strings = " + strings);
        for (String s : strings) {
            String[] split = s.split(" |");


            List<String> split1 = StrUtil.split(s, "|");
            System.out.println("split1 = " + split1);
            System.out.println("split = " + split[0] + " " + split[1] + " " + split[2]);
            // for (String s1 : split) {
            //     System.out.println("s1 = " + s1);
            // }
        }
    }
}
