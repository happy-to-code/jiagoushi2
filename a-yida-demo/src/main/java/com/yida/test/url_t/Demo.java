package com.yida.test.url_t;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/28 13:30
 * @Version:
 */
public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // curl -X POST -H "Content-Type:application/json" "https://openapi.lingxing.com/api/auth-server/oauth/access-token?appId=ak_w2nJBeSre5OZd&appSecret=w%2BlP3PbUbBafNXhtJwk1Gw%3D%3D"

        String appId = "ak_w2nJBeSre5OZd";
        String appSecret = "w+lP3PbUbBafNXhtJwk1Gw==";

        String appId2 = URLEncoder.encode(appId, "GBK");
        // w%2BlP3PbUbBafNXhtJwk1Gw%3D%3D
        // w%2BlP3PbUbBafNXhtJwk1Gw%3D%3D
        String appSecret2 = URLEncoder.encode(appSecret, "GBK");

        System.out.println("appId2 = " + appId2);
        System.out.println("appSecret2 = " + appSecret2);
    }
}
