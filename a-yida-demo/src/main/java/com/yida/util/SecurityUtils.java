package com.yida.util;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.DigestUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: pz lv
 * @Date: 2022/11/8 15:29:54
 * @Description: 京东保险提供的AES加密类
 */
@Slf4j
public class SecurityUtils {
    /**
     * 解密-Aes
     *
     * @param data     数据
     * @param password 密钥
     * @return 解密后数据
     */
    public static String decryptAes(String data, String password) {
        return aesHandler(data, password, Cipher.DECRYPT_MODE);
    }

    /**
     * 加密-Aes
     *
     * @param data     数据
     * @param password 密钥
     * @return 加密后数据
     */
    public static String encryptAes(String data, String password) {
        return aesHandler(data, password, Cipher.ENCRYPT_MODE);
    }

    /**
     * Md5加密处理
     *
     * @param data data
     * @return md5Digest
     */
    public static String md5DigestAsHex(String data) {
        if (StringUtils.isBlank(data)) {
            return data;
        }
        return DigestUtils.md5DigestAsHex(data.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Md5加密处理
     *
     * @param data data
     * @return md5Digest
     */
    public static byte[] md5Digest(String data) {
        return DigestUtils.md5Digest(data.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Aes加解密处理
     *
     * @param data        数据
     * @param password    密钥
     * @param encryptMode 操作类型 DECRYPT_MODE or ENCRYPT_MODE
     * @return 处理后数据
     */
    private static String aesHandler(String data, String password, int encryptMode) {
        try {
            /*int pwdLen = 16;
            if (Optional.ofNullable(password).orElse(StringUtils.EMPTY).length() != pwdLen) {
                throw new ServiceException(2999, "密钥格式不正确");
            }*/
            // 是否解密操作
            boolean isDecrypt = encryptMode == Cipher.DECRYPT_MODE;
            byte[] bytes;
            if (isDecrypt) {
                bytes = hexStr2Byte(data);
            } else {
                bytes = data.getBytes(StandardCharsets.UTF_8);
            }
            SecretKeySpec keySpec = new SecretKeySpec(md5Digest(password), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/pkcs5padding");
            cipher.init(encryptMode, keySpec);
            byte[] result = cipher.doFinal(bytes);
            if (isDecrypt) {
                return new String(result, StandardCharsets.UTF_8);
            } else {
                return byte2HexStr(result);
            }
        } catch (Exception e) {
            log.info("aesHandler exception ", e);
        }
        return null;
    }

    /**
     * byte[]转换hax字符串
     *
     * @param bytes byte[]
     * @return hax字符串
     */
    private static String byte2HexStr(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(b & 255);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }

    /**
     * hax字符串转换byte[]
     *
     * @param str hax字符串
     * @return byte[]
     */
    private static byte[] hexStr2Byte(String str) {
        if (str.length() < 1) {
            throw new NullPointerException();
        } else {
            int rate = 2;
            byte[] result = new byte[str.length() / 2];
            for (int i = 0; i < str.length() / rate; ++i) {
                int high = Integer.parseInt(str.substring(i * 2, i * 2 + 1), 16);
                int low = Integer.parseInt(str.substring(i * 2 + 1, i * 2 + 2), 16);
                result[i] = (byte) (high * 16 + low);
            }
            return result;
        }
    }


    public static void main(String[] args) {
        String secretKey= "123456123456abcd";
        Map productInfo = new HashMap<>();
        productInfo.put("empId", "QZ000009");
        productInfo.put("productId", 1402);
        productInfo.put("promoterName","张云雷");
        System.out.println("productInfo = " + productInfo.toString());
        String temp = SecurityUtils.encryptAes(productInfo.toString(), secretKey);
        log.info("加密后的内容为:{}",temp);
        String t = "5c98027cdc811e789020f8ad70f74c6099b5c41e6665c6a5f413abed1af2a4562c3bc1ccf8caace6c29effcb99e37b72116d92013dba5d1f7dc3b66a5cb6c4b4";
        log.info("加密后的内容为:{}",t);
        String s = SecurityUtils.decryptAes(t, secretKey);
        log.info("解密后的内容为:{}",s);
    }
}
