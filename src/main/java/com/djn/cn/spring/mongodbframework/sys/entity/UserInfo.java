package com.djn.cn.spring.mongodbframework.sys.entity;


import org.springframework.data.mongodb.core.mapping.Document;

import com.djn.cn.spring.mongodbframework.base.entity.BaseEntity;

/**
 * 
 * @ClassName UserInfo
 * @Description  用户Entity
 * @author NieDongjia
 * @date 2017年4月25日 上午11:11:53
 *
 */
@Document(collection = "T_BD_UserInfo")
public class UserInfo extends BaseEntity{
	/** 登录名*/
	private String userName;
	/**昵称*/
	private String nickName;
	/**密码*/
	private String password;	
	/**邮箱*/
	private String email; 		

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", nickName=" + nickName + ", password=" + password + ", email="
				+ email + "]";
	}
}