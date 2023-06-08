package com.yida.test4.http_t;

import java.io.PrintStream;

public class Demo2 {
    public static void main(String[] args) {
        String CERTIFICATION_SUCCESSFUL_MSG_CONTENT = "您的“爱私基摩”@sTEMPs@用户身份已认证，请您通过“上海股权托管交易中心微信公众号->我要报价”登陆查看。【上海股权托管交易中心】";


        String admin = CERTIFICATION_SUCCESSFUL_MSG_CONTENT.replace("@sTEMPs@", "admin");
        System.out.println("admin = " + admin);
    }
}
