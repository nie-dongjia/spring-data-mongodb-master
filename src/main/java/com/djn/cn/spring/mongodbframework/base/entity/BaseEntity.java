package com.djn.cn.spring.mongodbframework.base.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.djn.cn.spring.mongodbframework.sys.entity.UserInfo;

/**
 * 
 * @ClassName BaseEntity
 * @Description  基础封装实体
 * @author NieDongjia
 * @date 2017年4月25日 上午11:13:10
 *
 */
public class BaseEntity {
	@Id
	/**id*/
	private String id;
	/**名称*/
	private String name;
	/**创建日期*/
	private Date   createTime = new Date();
	/**  最后修改日期 */ 
	private Date   lastUpdateTime;
    /** 描述 */
    private String description;
    /**创建者*/
    @DBRef(lazy = true)
	private UserInfo creator;
    /**最后修改者*/
    @DBRef(lazy = true)
    private UserInfo lastUpdateUser;
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
	public UserInfo getCreator() {
		return creator;
	}
	public void setCreator(UserInfo creator) {
		this.creator = creator;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public UserInfo getLastUpdateUser() {
		return lastUpdateUser;
	}
	public void setLastUpdateUser(UserInfo lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}
	
}
