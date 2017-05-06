package org.djn.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.djn.cn.spring.mongodbframework.base.entity.FileInfo;
import com.djn.cn.spring.mongodbframework.base.service.IFileInfoService;

import com.djn.cn.spring.mongodbframework.sys.service.IUserInfoService;



@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/spring.xml" })
public class FileInfoTest {
	@Resource
	private IUserInfoService iUserInfoService;
	@Resource
	private IFileInfoService iFileInfoService;
	@Test
	public void save() {
		FileInfo fileInfo = new FileInfo();
		fileInfo.setFileName("666");
		
		System.out.println(iFileInfoService.save(fileInfo));
	}
	@Test
	public void find() {
		
	}
	@Test
	public void findAll() {
		
	}
	@Test
	public void findAllService() {
	
	}
	@Test
	public void saveOne() {
		
	}
	
	
}
