package com.yida.test4.sm2;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.SmUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.SM2;

import java.security.KeyPair;

/**
 * @Author zhangyifei
 * @Date 2023/6/12 16:41
 * @Version 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        String text = "我是测试SM2加密类的内容";

        KeyPair pair = SecureUtil.generateKeyPair("SM2");

        // String pubk = "021c7cad72c1c34f96274f9665921a08efd89c304eae37a79b02857f8fa4153fd0";
        // String privk="44d7deb3de301dd8484f0dd239ac13f6d6836ec8ea7ffe55d800984636fcbb3a";

        String pubk = "02fd7185ba28e43004a160d55afc6691529c9014809d1b1764626debba7670c7bd";
        String privk="e3b5b10f88bcb9868f806438c9d07186b3cb771adff6b4656831cb3d3b5bbc7f";

        SM2 sm2 = SmUtil.sm2(privk, pubk);

        // 公钥加密，私钥解密
        // String encryptStr = sm2.encryptBcd(text, KeyType.PublicKey);
        // String decryptStr = StrUtil.utf8Str(sm2.decryptFromBcd(encryptStr, KeyType.PrivateKey));
        // System.out.println(decryptStr);

        // System.out.println("---------------------------------------------------------------------------");
        byte[] sign = sm2.sign(text.getBytes());
        boolean verify = sm2.verify(text.getBytes(), sign);
        System.out.println("verify = " + verify);
    }
}
