package com.yida.test2.junit_test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Type: CalculatorTest.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/30 17:53
 * @Version:
 */
public class CalculatorTest extends TestCase {

    private static Calculator cal = new Calculator();

    @Test
    public void testAdd() {
        int add = cal.add(1, 2);
        Assert.assertEquals(3, add);
    }

    @Test
    public void testSubtract() {
        int subtract = cal.subtract(2, 1);
        System.out.println("subtract = " + subtract);
    }

    @Test
    public void testMultiple() {
        int multiple = cal.multiple(2, 5);
        System.out.println("multiple = " + multiple);
    }

    @Test
    public void testDivide() {
        int divide = cal.divide(40, 10);
        System.out.println("divide = " + divide);
    }

}
