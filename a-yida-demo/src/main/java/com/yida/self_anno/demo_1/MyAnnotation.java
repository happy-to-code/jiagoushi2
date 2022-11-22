package com.yida.self_anno.demo_1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface MyAnnotation {
	String name() default "";
}
