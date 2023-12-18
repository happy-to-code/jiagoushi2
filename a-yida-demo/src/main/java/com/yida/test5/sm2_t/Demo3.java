package com.yida.test5.sm2_t;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;


/**
 * @author zhangyifei
 * @Date 2023/9/14 10:55
 * @Version 1.0
 */
public class Demo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String sss = URLEncoder.encode("企业不存在7","utf-8");
        System.out.println("sss = " + sss);

        String input = "\\344\\274\\201\\344\\270\\232\\347\\256\\200\\347\\247\\2607\\";
        String decodedString = decodeOctal(input);
        System.out.println(decodedString);
    }

    public static String decodeOctal(String octalString) {
        StringBuilder sb = new StringBuilder();
        String[] octalValues = octalString.split("\\\\");
        for (String octal : octalValues) {
            if (!octal.isEmpty()) {
                int decimal = Integer.parseInt(octal, 8);
                sb.append((char) decimal);
            }
        }
        return sb.toString();
    }
}
