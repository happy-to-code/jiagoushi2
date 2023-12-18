package com.yida.test5.sm2_t;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;


/**
 * @author zhangyifei
 * @Date 2023/9/14 10:55
 * @Version 1.0
 */
public class Demo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "\\344\\274\\201\\344\\270\\232\\344\\270\\215\\345\\255\\230\\345\\234\\2507\\";
        convert(str);


        // String s = transfromOctalToString(str);
        // System.out.println("s = " + s);
    }

    private static String convert(String str) {
        Pattern pattern = compile("\\\\");
        String[] strs = pattern.split(str);
        StringBuffer sb = new StringBuffer();
        for (String s : strs) {
            if (s != null && s.trim().length() > 0) {
                String st = Integer.toHexString(Integer.valueOf(s, 8));
                sb.append("%").append(st);
            }
        }
        try {
            return URLDecoder.decode(sb.toString(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    public static String transfromOctalToString(String dataStr) throws UnsupportedEncodingException {
        if (!dataStr.contains("\\")) {
            return dataStr;
        }
        // 不属于八进制内容的字符
        StringBuilder oldBuffer = new StringBuilder();
        // 属于八进制的内容，转成十六进制后缓存在这里
        StringBuilder hexBuffer = new StringBuilder();
        for (int i = 0; i < dataStr.length(); i++) {
            char c = dataStr.charAt(i);
            if (c != '\\') {
                oldBuffer.append(c);
            }
            // 反斜杠往后3个为一组，组成了一个八进制数。例如\20710,其实是207组成了一个八进制数
            else {
                char c1 = dataStr.charAt(i + 1);
                char c2 = dataStr.charAt(i + 2);
                char c3 = dataStr.charAt(i + 3);
                i += 3;
                // 将八进制转换为十进制，再转换为十六进制
                String hex = Integer.toHexString((Integer.valueOf("" + c1 + c2 + c3, 8)));
                // 先缓存住，直到凑够三个字节
                hexBuffer.append(hex);
                String hexString = hexBuffer.toString();
                // utf8编码中，三个字节为一个汉字
                if (hexString.length() == 6) {
                    // 凑够三个字节了，转成汉字后放入oldBuffer中
                    oldBuffer.append(hexStr2Str(hexString));
                    // 凑够一个汉字了，清空缓存
                    hexBuffer = new StringBuilder();
                }
            }
        }
        return oldBuffer.toString();
    }

    private static String hexStr2Str(String hexStr) throws UnsupportedEncodingException {
        String str = "0123456789abcdef";
        char[] hexs = hexStr.toCharArray();
        byte[] bytes = new byte[hexStr.length() / 2];
        int n;
        for (int i = 0; i < bytes.length; i++) {
            n = str.indexOf(hexs[2 * i]) * 16;
            n += str.indexOf(hexs[2 * i + 1]);
            bytes[i] = (byte) (n & 0xff);
        }
        return new String(bytes, "utf-8");
    }
}
