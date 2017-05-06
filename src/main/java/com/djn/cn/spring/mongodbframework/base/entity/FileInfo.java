package com.djn.cn.spring.mongodbframework.base.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @ClassName FileInfo
 * @Description  文件实体
 * @author BigJia-Perfect
 * @date 2017年5月6日 下午8:43:43
 *
 */
@Document(collection="T_BD_FileInfo")
public class FileInfo extends BaseEntity{
	private String uuidName; //文件的UUIDName 
	private String fileName; //上传文件的真实名称 
	private String savePath; //记住文件的位置 
	private String relativeAddress; // 相对地址 
	private String accessoryPath;   // 访问路径 
	public String getUuidName() {
		return uuidName;
	}
	public void setUuidName(String uuidName) {
		this.uuidName = uuidName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public String getRelativeAddress() {
		return relativeAddress;
	}
	public void setRelativeAddress(String relativeAddress) {
		this.relativeAddress = relativeAddress;
	}
	public String getAccessoryPath() {
		return accessoryPath;
	}
	public void setAccessoryPath(String accessoryPath) {
		this.accessoryPath = accessoryPath;
	}
	@Override
	public String toString() {
		return "FileInfo [uuidName=" + uuidName + ", fileName=" + fileName + ", savePath=" + savePath
				+ ", relativeAddress=" + relativeAddress + ", accessoryPath=" + accessoryPath + "]";
	}
}
