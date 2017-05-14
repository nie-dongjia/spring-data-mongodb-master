package com.djn.cn.spring.mongodbframework.sys.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.djn.cn.spring.mongodbframework.base.entity.BaseEntity;

/**
 * 
 * @ClassName RoleInfo
 * @Description  角色实体
 * @author NieDongjia
 * @date 2017年5月5日 下午2:49:29
 *
 */
@Document(collection = "T_SYS_RoleInfo")
public class RoleInfo extends BaseEntity{
	/** 模块 */
	List<ModuleInfo> moduleInfos ;

	public List<ModuleInfo> getModuleInfos() {
		return moduleInfos;
	}

	public void setModuleInfos(List<ModuleInfo> moduleInfos) {
		this.moduleInfos = moduleInfos;
	}

	@Override
	public String toString() {
		return "RoleInfo [moduleInfos=" + moduleInfos + "]";
	}
	
	
}
