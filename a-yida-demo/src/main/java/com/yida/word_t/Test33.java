package com.yida.word_t;

import cn.hutool.core.util.StrUtil;

/**
 * @author zhangyifei
 * @Date 2023/12/8 11:25
 * @Version 1.0
 */
public class Test33 {
    public static void main(String[] args) {
        String path = "wxfile://temp/20230707134926_1111.jpg";
        if (StrUtil.startWith(path,"wxfile://temp/")) {
            path = StrUtil.removeAll(path,"wxfile://temp/");
        }
        System.out.println("path = " + path);
    }
}
