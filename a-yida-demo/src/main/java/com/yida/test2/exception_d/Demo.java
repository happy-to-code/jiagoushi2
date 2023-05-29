package com.yida.test2.exception_d;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/15 14.sql:41
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        try {
            Integer i = 10;
            Integer j = 0;
            System.out.println((i / j));
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            Throwable[] throwables = e.getSuppressed();
            for (Throwable throwable : throwables) {
                System.out.println("throwable.getStackTrace() = " + throwable.getStackTrace());
                System.out.println("throwable.getCause() = " + throwable.getCause());
                System.out.println("throwable.getLocalizedMessage() = " + throwable.getLocalizedMessage());
            }

            for (StackTraceElement stackTraceElement : stackTrace) {
                System.out.println("stackTraceElement.getLineNumber() = " + stackTraceElement.getLineNumber());
                System.out.println("stackTraceElement.getClassName() = " + stackTraceElement.getClassName());
                System.out.println("stackTraceElement.getMethodName() = " + stackTraceElement.getMethodName());

            }

        }
    }
}
