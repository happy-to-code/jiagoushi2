package com.yida.test.d1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/17 14:39
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        byte[] decode = Base64.getDecoder().decode("".getBytes());
        System.out.println("decode.toString() = " + decode.toString());
        System.out.println("decode.toString() = " + new String(decode));
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println("format = " + format);

        String format1 = LocalDate.now(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("format = " + format1);

        String s = "ABc1233";
        String format2 = String.format("%s.pdf", s);
        System.out.println("format2 = " + format2);
        Map m = new HashMap<>();
        m.put(1,1);
    }
}
