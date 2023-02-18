package com.yida.test3.aes;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;

import java.nio.charset.StandardCharsets;

/**
 * @Auther: yida
 * @Date: 2023/2/10 16:13
 * @Description:
 */
public class Demo {
	public static void main(String[] args) {
		String content = "test中文";
//随机生成密钥
// 		byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded();
		byte[] key = "123456123456abcd".getBytes(StandardCharsets.UTF_8);
//构建
		SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, key);
//加密
		byte[] encrypt = aes.encrypt(content);
//解密
		byte[] decrypt = aes.decrypt(encrypt);
//加密为16进制表示
		String encryptHex = aes.encryptHex(content);
		System.out.println("encryptHex = " + encryptHex);
//解密为字符串
		String decryptStr = aes.decryptStr(encryptHex, CharsetUtil.CHARSET_UTF_8);
		System.out.println("decryptStr = " + decryptStr);
	}
}
