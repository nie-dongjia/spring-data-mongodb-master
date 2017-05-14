package com.djn.cn.spring.mongodbframework.sys.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.djn.cn.spring.mongodbframework.base.entity.SpringDataPageable;
import com.djn.cn.spring.mongodbframework.sys.entity.RoleInfo;


/**
 * 
 * @ClassName IRoleInfoService
 * @Description  角色服务接口
 * @author BigJia-Perfect
 * @date 2017年5月14日 下午10:35:45
 *
 */
public interface IRoleInfoService {
	RoleInfo save(RoleInfo roleInfo);
    void delete(RoleInfo roleInfo);
    RoleInfo findById(String id);
	List<RoleInfo> findAll();
	RoleInfo update(RoleInfo roleInfo);
	Page<RoleInfo> findByPage(SpringDataPageable pageable);
	void deleteByID(String id);
	RoleInfo findByName(String Name);
}
