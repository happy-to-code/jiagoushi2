package com.yida.test4.sm2;

import org.bouncycastle.asn1.gm.GMNamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.*;

/**
 * @Author zhangyifei
 * @Date 2023/6/12 16:21
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        BouncyCastleProvider provider = new BouncyCastleProvider();
// 获取椭圆曲线相关生成参数规格
        ECGenParameterSpec genParameterSpec = new ECGenParameterSpec("sm2p256v1");
// 获取一个椭圆曲线类型的密钥对生成器
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", provider);
// 使用SM2的算法区域初始化密钥生成器
        keyPairGenerator.initialize(genParameterSpec, new SecureRandom());

// 生成密钥对
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        BCECPrivateKey privateKey = (BCECPrivateKey) keyPair.getPrivate();
        BCECPublicKey publicKey = (BCECPublicKey) keyPair.getPublic();

// 拿到32字节的私钥HEX
        System.out.println("Private Key: " + privateKey.getD().toString(16));

        // true  代表压缩密钥，以02、03开头，长度为33字节
        // false 代表未压缩，以04开头，长度为65字节
        System.out.println("Public Key: " + Hex.encode(publicKey.getQ().getEncoded(true)));
        System.out.println("Public Key: " + new String(Hex.encode(publicKey.getQ().getEncoded(true)), StandardCharsets.UTF_8));

    }


}
