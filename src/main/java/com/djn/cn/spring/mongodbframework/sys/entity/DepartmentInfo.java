package com.djn.cn.spring.mongodbframework.sys.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.djn.cn.spring.mongodbframework.base.entity.BaseEntity;

/**
 * 
 * @ClassName DepartmentInfo
 * @Description  部门实体 
 * @author NieDongjia
 * @date 2017年5月5日 上午11:02:38
 *
 */
@Document(collection = "T_SYS_DepartmentInfo")
public class DepartmentInfo extends BaseEntity{
}
