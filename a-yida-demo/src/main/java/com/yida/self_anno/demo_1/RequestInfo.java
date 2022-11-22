package com.yida.self_anno.demo_1;

import lombok.Data;

import java.util.Map;

/**
 * @Auther: yida
 * @Date: 2022/11/22 22:57
 * @Description:
 */
@Data
public class RequestInfo {
	private String wayCode;
	private String wayName;
	private Map<String, Object> map;
}
