package com.djn.cn.spring.mongodbframework.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djn.cn.spring.mongodbframework.base.entity.FileInfo;
import com.djn.cn.spring.mongodbframework.base.repository.IFileInfoRepository;
import com.djn.cn.spring.mongodbframework.base.service.IFileInfoService;


@Service
public class FileInfoServiceImpl implements IFileInfoService {
	@Autowired
	private IFileInfoRepository iFileInfoRepository;
	@Override
	public FileInfo save(FileInfo fileInfo) {
		return iFileInfoRepository.save(fileInfo);
	}
	@Override
	public void delete(FileInfo fileInfo) {
		iFileInfoRepository.delete(fileInfo);
	}

}
