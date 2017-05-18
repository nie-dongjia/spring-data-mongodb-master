package com.djn.cn.spring.mongodbframework.sys.entity;




import org.springframework.data.mongodb.core.mapping.DBRef;
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
@Document(collection = "T_SYS_UserInfo")
public class UserInfo extends BaseEntity{
	/** 登录名*/
	private String userName;
	/**昵称*/
	private String nickName;
	/**密码*/
	private String password;	
	/**邮箱*/
	private String email;
	/**部门 */
    @DBRef(lazy = true)
	private DepartmentInfo departmentInfo;
	/**角色*/
    @DBRef(lazy = true)
	private RoleInfo roleInfo;
	
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
	public DepartmentInfo getDepartmentInfo() {
		return departmentInfo;
	}
	public void setDepartmentInfo(DepartmentInfo departmentInfo) {
		this.departmentInfo = departmentInfo;
	}
	public RoleInfo getRoleInfo() {
		return roleInfo;
	}
	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}
	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", nickName=" + nickName + ", password=" + password + ", email="
				+ email + "]";
	}
}
