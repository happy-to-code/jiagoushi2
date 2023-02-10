package com.yida.test2.d_2;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/2/8 16:18
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        TestEnum[] testEnums = TestEnum.values();
        for (TestEnum testEnum : testEnums) {
            System.out.println("testEnum = " + testEnum);
        }

        System.out.println("-----------------------------------");
        TestEnum xiaoHong = TestEnum.valueOf("XH");
        System.out.println("xiaoHong = " + xiaoHong);
    }
}
