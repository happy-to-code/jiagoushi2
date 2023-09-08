package com.yida.test4.encryption;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @author zhangyifei
 * @Date 2023/7/13 14:14
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        RSA rsa = new RSA();

        // 获得私钥
        PrivateKey privateKey = rsa.getPrivateKey();
        System.out.println("privateKey = " + privateKey);
        String privateKeyBase64 = rsa.getPrivateKeyBase64();
        System.out.println("privateKeyBase64 = " + privateKeyBase64);
        // 获得公钥
        PublicKey publicKey = rsa.getPublicKey();
        System.out.println("publicKey = " + publicKey);
        String publicKeyBase64 = rsa.getPublicKeyBase64();
        System.out.println("publicKeyBase64 = " + publicKeyBase64);

        // 公钥加密，私钥解密
        byte[] encrypt = rsa.encrypt(StrUtil.bytes("我是一段测试aaaa", CharsetUtil.CHARSET_UTF_8), KeyType.PublicKey);
        byte[] decrypt = rsa.decrypt(encrypt, KeyType.PrivateKey);
        String s = String.valueOf(decrypt);
        System.out.println("s = " + s);
        // Junit单元测试
        // Assert.assertEquals("我是一段测试aaaa", StrUtil.str(decrypt, CharsetUtil.CHARSET_UTF_8));

        // 私钥加密，公钥解密
        byte[] encrypt2 = rsa.encrypt(StrUtil.bytes("我是一段测试aaaa", CharsetUtil.CHARSET_UTF_8), KeyType.PrivateKey);
        byte[] decrypt2 = rsa.decrypt(encrypt2, KeyType.PublicKey);
        System.out.println("String.valueOf(decrypt2) = " + StrUtil.str(decrypt2, CharsetUtil.CHARSET_UTF_8));

    }
}
