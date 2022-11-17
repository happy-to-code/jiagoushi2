package com.yida.test;

import lombok.Data;

import java.util.List;

@Data
class Temp {
	private Integer code;
	private List<DataObj> data;
//	private DataObj dataObjList;
}