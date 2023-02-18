package com.yida.service;

import cn.hutool.core.lang.Assert;
import com.yida.pojo.Boy;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IBoyServiceTest extends TestCase {
	@Autowired
	private IBoyService iBoyService;
	
	@Test
	public void add(){
		Boy b = new Boy();
		b.setName("xm");
		b.setAge(16);
		b.setDetail("desc222");
		boolean save = iBoyService.save(b);
		System.out.println("save = " + save);
		Assert.isTrue(save);
		
	}
	
	@Test
	public void getByIdTest(){
		
		Boy byId = iBoyService.getById("1626944512803270650");
		System.out.println("byId = " + byId);
	}
}