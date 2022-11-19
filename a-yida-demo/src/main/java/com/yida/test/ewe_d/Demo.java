package com.yida.test.ewe_d;

import cn.hutool.crypto.SecureUtil;
import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/14 16:59
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        String content = "dl-sh1pushUnCreatedShipmentsDIM875439GYT892130";
        String digest = MD5Encode(content, "");
        // content = test1pushUnCreatedShipments
        // keys = 123456
        System.out.println("digest = " + digest);

        // nBOi6mcHZ/z+OlkyN62sjw==
        // nBOi6mcHZ/z+OLkyN62sjw==
        String fileName = String.format("OMS润百面单%s.pdf", System.currentTimeMillis());
        System.out.println("fileName = " + fileName);
        String format = String.format("%s.pdf", fileName);
        System.out.println("format = " + format);


        String idStr = "vbvbbbb";
        int i = fileName.lastIndexOf(".");
        String md5 = SecureUtil.md5(fileName + idStr);
        String s = md5 + fileName.substring(i);
        System.out.println("s = " + s);
    }

    public static String MD5Encode(String content, String keys) {
        String sign = "";
        String charset = "UTF-8";
        content = content + keys;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(content.getBytes(charset));
            sign = new String(Base64.encodeBase64(md.digest()), charset);
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return sign;
    }


}
