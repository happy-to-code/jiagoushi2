package com.yida.test3.transaction_1;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 实体基类
 *
 * @author： zhangyifei
 * @date 2023/05/15
 */
@Data
public abstract class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = -4047172228834854319L;
	/**
	 * id
	 */
	@TableId(type = IdType.ASSIGN_ID)
	private String id;
	
	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
	private LocalDateTime createTime;
	
	/**
	 * 更新时间
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
	private LocalDateTime updateTime;
	
	
	/**
	 * 创建人
	 */
	@TableField(fill = FieldFill.INSERT)
	private String createBy;
	
	/**
	 * 更新人
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private String updateBy;
	
	/**
	 * 删除
	 */
	@TableLogic(value = "0", delval = "1")
	private String deleted;
	
}
