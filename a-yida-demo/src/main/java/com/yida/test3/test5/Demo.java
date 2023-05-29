package com.yida.test3.test5;

/**
 * @Auther: yida
 * @Date: 2023/3/9 18:51
 * @Description:
 */
public class Demo {
	public static void main(String[] args) {
		String property = System.getProperty("user.dir");
		System.out.println("property = " + property);
		
		
		String s = "111.png";
		String substring = s.substring(s.lastIndexOf(".") + 1);
		System.out.println("substring = " + substring);
		System.out.println("s = " + s);
	}
}
