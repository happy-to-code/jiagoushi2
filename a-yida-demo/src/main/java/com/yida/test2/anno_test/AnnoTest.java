package com.yida.test2.anno_test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Type: AnnoTest.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/2/1 11:07
 * @Version:
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnoTest {
    String val() default "";

    int num() default 0;
}
