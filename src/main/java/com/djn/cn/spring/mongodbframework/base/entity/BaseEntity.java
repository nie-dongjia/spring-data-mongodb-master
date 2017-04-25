package com.djn.cn.spring.mongodbframework.base.entity;

import java.util.Date;

/**
 * 
 * @ClassName BaseEntity
 * @Description  基础封装实体
 * @author NieDongjia
 * @date 2017年4月25日 上午11:13:10
 *
 */
public class BaseEntity {
	private String id;
	private String name;
	private Date   createTime;
	private Date   updateTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
