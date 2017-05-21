package com.djn.cn.spring.mongodbframework.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.djn.cn.spring.mongodbframework.sys.entity.UserInfo;
import com.djn.cn.spring.mongodbframework.sys.service.IUserInfoService;

/**
 * 
 * @ClassName UserRealmImpl
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author BigJia-Perfect
 * @date 2017年5月21日 下午12:46:07
 *
 */
public class UserRealmImpl extends AuthorizingRealm {
	@Autowired
	private IUserInfoService iUserInfoService;

	/**
	 * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String) principals.getPrimaryPrincipal();
		// 角色名的集合
		// Set<String> roles = new HashSet<String>();
		// 权限集合
		// Set<String> permissions = new HashSet<String>();
		UserInfo userInfo = iUserInfoService.findByUserName(userName);
		if (userInfo == null) {
			// 没有找到用户
			throw new UnknownAccountException("没有找到该账号");
		}
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		return authorizationInfo;
	}

	/**
	 * 认证回调函数, 登录时调用
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
			throws AuthenticationException {
		// 获取基于用户名和密码的令牌
		// 实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		String userName = token.getUsername();
		UserInfo userInfo = iUserInfoService.findByUserName(userName);
		if (userInfo == null) {
			throw new UnknownAccountException();// 没找到帐号
		}
		if (Boolean.TRUE.equals(userInfo.isLocked())) {
			throw new AuthenticationException("msg:该已帐号禁止登录.");
		}
		AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(userInfo.getUserName(), userInfo.getPassword(),
				this.getName());
		this.setSession("currentUserInfo", userInfo);
		return authcInfo;
	}

	/**
	 * 将一些数据放到ShiroSession中,以便于其它地方使用
	 * 
	 * @see 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
	 */
	private void setSession(Object key, Object value) {
		Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			Session session = currentUser.getSession();
			System.out.println("Session默认超时时间为[" + session.getTimeout() + "]毫秒");
			if (null != session) {
				session.setAttribute(key, value);
			}
		}
	}
}
