package org.djn.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.djn.cn.spring.mongodbframework.sys.entity.DepartmentInfo;
import com.djn.cn.spring.mongodbframework.sys.repository.IDepartmentInfoRepository;




@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/spring.xml" })
public class DepartmentInfoTest {
	@Resource
	private IDepartmentInfoRepository iDepartmentInfoRepository;

	@Test
	public void save() {
		DepartmentInfo departmentInfo = new DepartmentInfo();
		departmentInfo.setName("研发部");
		System.out.println(iDepartmentInfoRepository.save(departmentInfo));
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
	
}
