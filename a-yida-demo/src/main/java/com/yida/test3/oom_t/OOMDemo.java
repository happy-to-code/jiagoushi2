package com.yida.test3.oom_t;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yida
 * @Date: 2023/2/22 18:13
 * @Description:
 */
public class OOMDemo {
	static class OOMObject {
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<>();
		while (true) {
			list.add(new OOMObject());
		}
	}
}
