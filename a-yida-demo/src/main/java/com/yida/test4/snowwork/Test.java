package com.yida.test4.snowwork;

/**
 * @Author zhangyifei
 * @Date 2023/6/6 10:36
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        SnowFlakeUtil snowFlakeUtil = new SnowFlakeUtil (12,13);

        for (int i = 0; i < 100; i++) {
            System.out.println(snowFlakeUtil.getNextId());
        }

        // LY_PROJECT_INFO_ID_SEQ
        // svca73539e7e112ffd4d942f5aa1817bbe8d0d25054a445bfaee4d1029b
    }
}
