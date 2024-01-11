package com.yida.test6;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import java.security.NoSuchAlgorithmException;


/**
 * @author zhangyifei
 * @Date 2023/12/21 10:06
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // SecretKeySpec signingKey = new SecretKeySpec(AppSecret.getBytes("UTF-8"), "HmacSHA1");
        // Mac mac = Mac.getInstance("HmacSHA1");
        // mac.init(signingKey);
        // byte[] P3= mac.doFinal(P2.getBytes("UTF-8"));
    }
}
