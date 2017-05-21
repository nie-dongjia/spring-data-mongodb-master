package org.djn.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.djn.cn.spring.mongodbframework.sys.entity.DepartmentInfo;
import com.djn.cn.spring.mongodbframework.sys.entity.UserInfo;
import com.djn.cn.spring.mongodbframework.sys.repository.IDepartmentInfoRepository;
import com.djn.cn.spring.mongodbframework.sys.repository.IUserInfoRepository;
import com.djn.cn.spring.mongodbframework.sys.service.IUserInfoService;
import com.djn.cn.spring.mongodbframework.util.EncryptUtil;



@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/spring.xml" })
public class UserInfoTest {
	@Resource
	private IUserInfoRepository iUserInfoRepository;
	@Resource
	private IUserInfoService iUserInfoService;
	@Resource
	private IDepartmentInfoRepository iDepartmentInfoRepository;
	@Test
	public void save() {
		UserInfo userInfo = iUserInfoRepository.findOneByUserName("admin");
		userInfo.setPassword(EncryptUtil.encryptToMD5(userInfo.getPassword()));
		System.out.println(iUserInfoRepository.save(userInfo));
//		userInfo.setName("管理员");
//		userInfo.setPassword("123456");
//		userInfo.setUserName("admin");
////		userInfo.setDepartmentInfo(	iDepartmentInfoRepository.findOne("591d6e9a2973d270b70d6e13"));
//		System.out.println(iUserInfoRepository.save(userInfo));
	}
//	@Test
//	public void find() {
//		System.out.println(iUserInfoRepository.findOneByUserName("niedongjia"));
//		System.out.println(iUserInfoRepository.findOneByUserName("niedongjia").getId());
//		System.out.println(iUserInfoRepository.findOneByUserName("niedongjia").getCreateTime());
//		System.out.println(iUserInfoRepository.findOneByUserName("niedongjia").getCreator());
//	}
//	@Test
//	public void findAll() {
//		System.out.println(iUserInfoRepository.findAll());
//	}
//	@Test
//	public void findAllService() {
//		System.out.println(iUserInfoService.findAll());
//	}
//	@Test
//	public void saveOne() {
//		//590dd39818a8b7f020226db6
//		UserInfo userInfo = new UserInfo();
//		userInfo.setName("聂冬佳");
//		userInfo.setPassword("123456");
//		userInfo.setUserName("niedongjia");
//		userInfo.setCreator(iUserInfoRepository.findOne("590dd39818a8b7f020226db6"));
//		iUserInfoRepository.save(userInfo);
//	}
//	
//	@Test
//	public void save() {
//		UserInfo userInfo = new UserInfo();
//		userInfo.setName("管理员");
//		userInfo.setPassword("123456");
//		userInfo.setUserName("admin");
//		System.out.println(iUserInfoService.save(userInfo));
//	}
//	
	@Test
	public void find() {
		DepartmentInfo departmentInfo = iDepartmentInfoRepository.findOne("591d6e9a2973d270b70d6e13");
		System.out.println(iUserInfoRepository.findOneByDepartmentInfo(departmentInfo).size()+"####");
		System.out.println(iUserInfoRepository.findOneByDepartmentInfo(departmentInfo).get(0).getName()+"####");
	}
	
}
