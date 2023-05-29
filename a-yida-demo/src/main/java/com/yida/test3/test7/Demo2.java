package com.yida.test3.test7;

/**
 * @Auther: yida
 * @Date: 2023/5/22 13:53
 * @Description:
 */
public class Demo2 {
	public static void main(String[] args) {
		String s = "data:image/png;base64,xxxf";
		String[] split = s.split(",");
		String s1 = split[0];
		System.out.println("s1 = " + s1);
		
		String[] split1 = s1.split("/");
		System.out.println("split1 = " + split1);
		System.out.println(split1[0]);
		System.out.println(split1[1]);
		
		String[] split2 = split1[1].split(";");
		System.out.println(split2[0]);
		
		System.out.println("----------------------------");
		String substring = split[0].substring(split[0].indexOf("/") + 1, split[0].indexOf(";"));
		System.out.println("substring = " + substring);
		
	}
}
