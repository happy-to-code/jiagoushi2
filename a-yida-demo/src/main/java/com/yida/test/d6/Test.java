package com.yida.test.d6;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/26 14:15
 * @Version:
 */
public class Test {
    public static void main(String[] args) throws URISyntaxException {
        String dataURL = new File(Test.class.getResource("/").toURI()).getPath() + "\\tessdata";

        System.out.println("dataURL = " + dataURL);


        URI uri = Test.class.getResource("/").toURI();
        System.out.println("uri = " + uri);

        URL resource = Test.class.getResource("/");
        System.out.println("resource = " + resource);


        String osName = System.getProperty("os.name");
        System.out.println(osName);

        // curl "https://openapi.lingxing.com/erp/data/seller/lists?access_token=356a7d2e-ec50-4119-ab17-79cc7e54d1b2&app_key=ak_w2nJBeSre5OZd&timestamp=1672304113&sign=KhBlkHYY4EyGlkCG9%2F6JYIpTl4UhhtAWuBBfe2y%2BC5jnXtmOg1Q8EoQDgP24EMa6"
    }
}
