package com.djn.cn.spring.mongodbframework.shiro;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.djn.cn.spring.mongodbframework.sys.entity.UserInfo;
import com.djn.cn.spring.mongodbframework.sys.service.IUserInfoService;

public class UserRealmImpl extends AuthorizingRealm {
	@Autowired
	private IUserInfoService iUserInfoService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String) principals.getPrimaryPrincipal();
		// 角色名的集合
		Set<String> roles = new HashSet<String>();
		UserInfo userInfo = iUserInfoService.findByUserName(userName);
		if(userInfo==null){
			//木有找到用户
			throw new UnknownAccountException("没有找到该账号");
		}
		/**
		 * 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以在此判断或自定义实现  
		 */
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userInfo.getUserName(), userInfo.getPassword(),getName());
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

}
