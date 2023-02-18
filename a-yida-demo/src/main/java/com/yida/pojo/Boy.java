package com.yida.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: yida
 * @Date: 2023/2/18 21:11
 * @Description:
 */
@Data
@TableName("boy")
public class Boy implements Serializable {
	private static final long serialVersionUID = 4462743168115185463L;
	
	@TableId(value = "id", type = IdType.ASSIGN_ID)
	private String id;
	private String name;
	private Integer age;
	private String detail;
}
