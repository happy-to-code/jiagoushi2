package com.yida.test3.transaction_1;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Auther: yida
 * @Date: 2023/5/16 10:32
 * @Description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Dog extends BaseEntity implements Serializable {
	private static final long serialVersionUID = -6549624005566109369L;
	
	private String name;
	private Integer age;
	
	private LocalDateTime createTime;

	private LocalDateTime updateTime;
}
