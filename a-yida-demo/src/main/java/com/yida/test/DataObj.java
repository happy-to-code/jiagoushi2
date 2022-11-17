package com.yida.test;

import lombok.Data;

import java.util.List;

/**
 * @Auther: yida
 * @Date: 2022/11/14 22:00
 * @Description:
 */
@Data
public class DataObj {
	private String msg;
	private List<Item> items;
	private String sender_references;
	private Boolean isSuccess;
}
