package com.djn.cn.spring.mongodbframework.sys.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.djn.cn.spring.mongodbframework.base.entity.BaseEntity;

/**
 * 
 * @ClassName ModuleInfo
 * @Description  模块信息表 
 * @author NieDongjia
 * @date 2017年5月9日 下午3:57:22
 *
 */
@Document(collection = "T_SYS_ModuleInfo")
public class ModuleInfo extends BaseEntity{
	
}
