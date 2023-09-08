package com.yida.test4.weixin;

import cn.hutool.json.JSONObject;
import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;

/**
 * @author zhangyifei
 * @Date 2023/7/10 10:05
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws InvalidAlgorithmParameterException, UnsupportedEncodingException {
        Integer ty = null;

        System.out.println("(ty==1 = " + (ty==1));




        String encryptedData = "8agdsFmgdFQnwDJPt7J1k/NEY8Kann5ki22ENDSLdaHoVz2sL+UDAnskf8CBwlh9kRg8ZRK5/GFzkVf0euJYLRMNBY1sgSfOl6eVFbvetTBG9i7nv4p+IRLnCnGLFvUDRQGFOMeBGtbCWcNrUbaFRNUamedP9uA9r8VnE4LzOseUgP3GpHyvx1s/yDbNlBh9utl4S3A7fAAsu/6A3fHCtg==";
        String iv = "o8JSBqTGC2XP0HdU4FlJ5w==";


        AESUtils aes = new AESUtils();
        // 调用AESUtils工具类decrypt方法解密获取json串
        byte[] resultByte = aes.decrypt(Base64.decodeBase64(encryptedData), Base64.decodeBase64(encryptedData), Base64.decodeBase64(iv));
        // 判断返回参数是否为空
        if (null != resultByte && resultByte.length > 0) {
            String jsons = new String(resultByte, "UTF-8");
            System.out.println(jsons);
            JSONObject json = new JSONObject(jsons);


            System.out.println("json = " + json);

        }
    }
}