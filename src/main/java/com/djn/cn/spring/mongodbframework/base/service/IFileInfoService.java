package com.djn.cn.spring.mongodbframework.base.service;

import com.djn.cn.spring.mongodbframework.base.entity.FileInfo;

/**
 * 
 * @ClassName IFileInfoService
 * @Description  文件service接口
 * @author 聂冬佳
 * @date 2017年2月28日 上午10:54:56
 *
 */
public interface IFileInfoService {
	/**
	 * 添加文件信息
	 * @Title  save  
	 * @return ManagerUserInfo   
	 *
	 */
	FileInfo save(FileInfo fileInfo);
	/**
	 * 删除单个文件信息
	 * @Title  delete  
	 * @return void   
	 *
	 */
    void delete(FileInfo fileInfo);
}
