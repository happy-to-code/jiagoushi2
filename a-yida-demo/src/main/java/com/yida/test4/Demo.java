package com.yida.test4;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;

import java.sql.Struct;
import java.util.Date;

/**
 * @author zhangyifei
 * @Date 2023/6/27 17:00
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        // String value = YamlUtil.getValue("abc.d");
        // System.out.println("value = " + value);

        String value = PropertyUtil.getValue("abc.d");
        System.out.println("value = " + value);


        String s = "【市场动态】上海市中小企业办主任吴志琦带队调研上海股交中心";
        boolean b = StrUtil.containsAny(s, "【市场动态】");
        System.out.println("b = " + b);


        String ss = "tmp_003537c00a77e65e9dc3e431060a872d.jpg";

        String tmp = ss.replaceFirst("tmp_", "");
        System.out.println("tmp = " + tmp);


        String sss = "17611113333";
        String phoneResult = sss.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
        System.out.println("phoneResult = " + phoneResult);


        DateTime date = DateUtil.date(1689151831);

        System.out.println("date = " + date);

        long l = 1689151831000L;
        Date date1 = new Date(l);
        System.out.println("date1 = " + date1);
        String format = DateUtil.format(date1, "yyyy-MM-dd HH:mm:ss");
        System.out.println("format = " + format);

        long currentTimeStamp = System.currentTimeMillis() / 1000;
        System.out.println("currentTimeStamp = " + currentTimeStamp);
    }
}
