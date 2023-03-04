package com.yida.test3.test4;

/**
 * @Auther: yida
 * @Date: 2023/2/28 19:30
 * @Description:
 */
public class Demo {
	public static void main(String[] args) {
		// String s = "1.01";
		// String[] split = s.split("\\.");
		// // System.out.println("split = " + split);
		// for (String s1 : split) {
		// 	System.out.println("s1 = " + s1);
		// 	int i = Integer.parseInt(s1);
		// 	System.out.println("i = " + i);
		// }
		
		int i = func1("1.001", "1.0001");
		System.out.println("i = " + i);
		
		
	}
	
	public static int func1(String version1, String version2) {
		// if (version1 == null || version2 == null) {
		// 	throw new Exception("compareVersion error:illegal params.");
		// }
		String[] versionArray1 = version1.split("\\.");//注意此处为正则匹配，不能用"."；
		String[] versionArray2 = version2.split("\\.");
		int idx = 0;
		int minLength = Math.min(versionArray1.length, versionArray2.length);//取最小长度值
		int diff = 0;
		while (idx < minLength && (diff = versionArray1[idx].length() - versionArray2[idx].length()) == 0//先比较长度
				&& (diff = versionArray1[idx].compareTo(versionArray2[idx])) == 0) {//再比较字符
			++idx;
		}
		//如果已经分出大小，则直接返回，如果未分出大小，则再比较位数，有子版本的为大；
		diff = (diff != 0) ? diff : versionArray1.length - versionArray2.length;
		return diff;
	}
	
	
	
	public static int compareVersion(String version1, String version2) {
		if (version1.equals(version2)) {
			return 0;
		}
		String[] version1Array = version1.split("\\.");
		String[] version2Array = version2.split("\\.");
		int index = 0;
		int minLen = Math.min(version1Array.length, version2Array.length);
		long diff = 0;
		
		while (index < minLen
				&& (diff = Long.parseLong(version1Array[index])
				- Long.parseLong(version2Array[index])) == 0) {
			index++;
		}
		if (diff == 0) {
			for (int i = index; i < version1Array.length; i++) {
				if (Long.parseLong(version1Array[i]) > 0) {
					return 1;
				}
			}
			
			for (int i = index; i < version2Array.length; i++) {
				if (Long.parseLong(version2Array[i]) > 0) {
					return -1;
				}
			}
			return 0;
		} else {
			return diff > 0 ? 1 : -1;
		}
	}
}
