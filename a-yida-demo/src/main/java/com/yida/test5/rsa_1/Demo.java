package com.yida.test5.rsa_1;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;

import javax.crypto.Cipher;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Date;

/**
 * @author zhangyifei
 * @Date 2023/7/25 14:17
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        String message = "{\"orgName\":\"佛山一众传感仪器有限公司\",\"uid\":\"\",\"from\":\"21\",\"creditCode\":\"\",\"phone\":\"18755160672\",\"timeStamp\":1680834154980,\"clientId\":\"8c8b909c5e3d4594b23ccd242aa13068\"}";

        String pubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh/IMPiJO6bPpPvIEqku3NyyBUMvp17dR8060WkwEen1i61Qa07RSUbAAWd1JGJrt1rZb2tcdXutuiXMEUtADREr5aXqZD7EfydlNSF/WVTX+LEkEVts4h3kXatEt2m2eRfmdaLDnyKGzhaWjJ7qWyOAQif9hwYn8Dm2No/9wruH7ZYwYGgG3fuAideMCDtOnKf0AW6vVUKvpB0gyXeg2iweW22LhYKvcObHRzy1cYMMattBbt8xpfgxAAB42SimDeLZvEhqm698bQ/bT3zSHTqI0GzPK7il2Q5hc5CbiUvm+2ZCmKMEUE6vfuECEljQxzNRFPizeNvAi+MNofGSjwQIDAQAB";
        String messageEn = encrypt(message, pubKey);
        System.out.println("密文:" + messageEn);

        System.out.println("StrUtil.startWith(\"1abcsdfsdf\",\"abc\") = " + StrUtil.startWith("1abcsdfsdf","abc"));

        Date date = new Date();
        System.out.println("date = " + date);
        String format = DateUtil.format(date, DatePattern.NORM_DATETIME_MS_FORMAT);
        System.out.println("format = " + format);
    }


    public static String encrypt(String str, String publicKey) throws Exception {
        // base64编码的公钥
        byte[] decoded = Base64.getDecoder().decode(publicKey);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
        // RSA加密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        String outStr = Base64.getEncoder().encodeToString(cipher.doFinal(str.getBytes("UTF-8")));
        // Encode编译
        String encode = URLEncoder.encode(outStr, "GBK");

        return encode;
    }
}
