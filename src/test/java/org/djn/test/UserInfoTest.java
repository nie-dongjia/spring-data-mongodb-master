package org.djn.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.djn.cn.spring.mongodbframework.sys.entity.UserInfo;
import com.djn.cn.spring.mongodbframework.sys.repository.IUserInfoRepository;
import com.djn.cn.spring.mongodbframework.sys.service.IUserInfoService;



@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/spring.xml" })
public class UserInfoTest {
	@Resource
	private IUserInfoRepository iUserInfoRepository;
	@Resource
	private IUserInfoService iUserInfoService;
	@Test
	public void save() {
		UserInfo userInfo = new UserInfo();
		userInfo.setNickName("AAA");
		userInfo.setPassword("1234556");
		userInfo.setUserName("聂冬佳3");
		System.out.println(iUserInfoRepository.save(userInfo));
	}
	@Test
	public void find() {
		System.out.println(iUserInfoRepository.findOneByUserName("聂冬佳3"));
	}
	@Test
	public void findAll() {
		System.out.println(iUserInfoRepository.findAll());
	}
	@Test
	public void findAllService() {
		System.out.println(iUserInfoService.findAll());
	}
	
	
}
