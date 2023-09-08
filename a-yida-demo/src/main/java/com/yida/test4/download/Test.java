package com.yida.test4.download;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.http.HttpUtil;

import java.nio.charset.Charset;

/**
 * @author zhangyifei
 * @Date 2023/6/29 9:51
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        String path = "C:\\mydata\\project\\java_test\\jiagoushi\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test4\\download\\11.pdf";
        // String urlStr = "https://www.china-see.com/images/202305RZ.pdf";
        String urlStr = "http://tmp/uzLyU7pRr4fA1a6339bfbe19f2d0eab191d01f61d5a0.png";

        String s = HttpUtil.get(urlStr);
        System.out.println("s = " + s);


        FileUtil.writeString(s, path, Charset.forName("utf-8"));
    }
}
