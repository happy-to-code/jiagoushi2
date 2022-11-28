package com.yida.service;

import com.yida.self_anno.demo_1.MyAnnotation;
import com.yida.self_anno.demo_1.ResponseInfo;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TestOne {
	
	@MyAnnotation(name = "a")
	public ResponseInfo gateWayOne(Map<String, Object> map) {
		System.out.printf("gateWayOne printf" + map.get("Key1"));
		ResponseInfo res = new ResponseInfo();
		res.setTestId("000001");
		res.setTestName("U get Class gateWayOne");
		return res;
	}
	
	@MyAnnotation(name = "b")
	public ResponseInfo gateWayTwo(Map<String, Object> map) {
		System.out.printf("gateWayOne printf" + map.get("Key2"));
		ResponseInfo res = new ResponseInfo();
		res.setTestId("000002");
		res.setTestName("U get Class gateWayTwo");
		return res;
	}
	
	@MyAnnotation(name = "c")
	ResponseInfo gateWayThree(Map<String, Object> map) {
		System.out.printf("gateWayThree printf" + map.get("Key3"));
		ResponseInfo res = new ResponseInfo();
		res.setTestId("000003");
		res.setTestName("U get Class gateWayThree");
		return res;
	}
	
	public ResponseInfo gateWayFour(Map<String, Object> map) {
		System.out.printf("gateWayThree printf" + map.get("Key4"));
		ResponseInfo res = new ResponseInfo();
		res.setTestId("000004");
		res.setTestName("U get Class gateWayFour");
		return res;
	}
}