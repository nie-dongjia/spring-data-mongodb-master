package com.djn.cn.spring.mongodbframework.sys.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.djn.cn.spring.mongodbframework.base.entity.SpringDataPageable;
import com.djn.cn.spring.mongodbframework.sys.entity.ModuleInfo;

/**
 * 
 * @ClassName IModuleInfoService
 * @Description 模块接口
 * @author BigJia-Perfect
 * @date 2017年5月14日 下午10:41:54
 *
 */
public interface IModuleInfoService {
	/**
	 * 保存单个实体
	 * 
	 * @Title save
	 * @return Module
	 * 
	 */
	public ModuleInfo save(ModuleInfo moduleInfo);

	/**
	 * 删除单个实体
	 * 
	 * @Title delete
	 * @return void
	 *
	 */
	public void delete(ModuleInfo moduleInfo);

	/**
	 * 通过id查找
	 * 
	 * @Title findById
	 * @return Module
	 *
	 */
	public ModuleInfo findById(String id);

	/**
	 * 查询所有
	 * 
	 * @Title findAll
	 * @return List<Module>
	 *
	 */
	public List<ModuleInfo> findAll();

	/**
	 * 更新
	 * 
	 * @Title update
	 * @return Module
	 *
	 */
	public ModuleInfo update(ModuleInfo modul);

	/**
	 * 分页查找
	 * 
	 * @Title findByPage
	 * @return Page<Module>
	 *
	 */
	public Page<ModuleInfo> findByPage(SpringDataPageable pageable);

	/**
	 * 通过ID 删除MRole
	 * 
	 * @Title deleteByID
	 * @return void
	 *
	 */
	public void deleteByID(String id);

	/**
	 * 通过Name查找角色
	 * 
	 * @Title findByName
	 * @return ModuleInfo
	 *
	 */
	public ModuleInfo findByName(String Name);

	/**
	 * 查询所有的父节点
	 * 
	 * @Title findParentModule
	 * @return List<ModuleInfo>
	 *
	 */
	public List<ModuleInfo> findParentModuleInfo();

	/**
	 * 查找父节点的所有子节点
	 * 
	 * @Title findByParentModule
	 * @return List<ModuleInfo>
	 *
	 */
	public List<ModuleInfo> findByParentModule(ModuleInfo parentModuleInfo);

	/**
	 * 通过id数组查询 Module
	 * 
	 * @Title findModuleByIds
	 * @return List<ModuleInfo>
	 *
	 */
	public List<ModuleInfo> findModuleByIds(String[] ids);

}
