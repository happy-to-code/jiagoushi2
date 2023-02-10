package com.yida.test2.temp;

/**
 * @Auther: yida
 * @Date: 2023/2/5 20:48
 * @Description:
 */
public class Demo {
	public static void main(String[] args) {
		String x = "string";
		String y = "string";
		String z = new String("string");
		
		System.out.println(x==y);
		System.out.println(x==z);
		
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		
	}
}
