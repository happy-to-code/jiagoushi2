package com.yida.test.d4;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/17 14:39
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        byte[] labelDataBytes = null;
        String labelDataTy = "";
        switch (labelDataTy) {
            case "base64":
                // labelData 数据格式是 base64形式
                labelDataBytes = new byte[2];
                break;
            case "hex16":
                // labelData 数据格式是 16进制形式
                labelDataBytes = new byte[3];
                break;
            default:
                System.out.println("\"12312\" = " + "12312");
        }
        System.out.println("labelDataBytes = " + labelDataBytes);
    }
}
