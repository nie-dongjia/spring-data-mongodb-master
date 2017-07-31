package com.djn.cn.spring.mongodbframework.base.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.djn.cn.spring.mongodbframework.base.entity.FileInfo;
import com.djn.cn.spring.mongodbframework.base.entity.JsonResult;
import com.djn.cn.spring.mongodbframework.base.service.IFileInfoService;
import com.djn.cn.spring.mongodbframework.util.ConfigUtil;
import com.djn.cn.spring.mongodbframework.util.FileUtil;

/**
 * 
 * @ClassName FileInfoController
 * @Description 文件controller
 * @author BigJia-Perfect
 * @date 2017年5月6日 下午9:11:23
 *
 */
@Controller
@RequestMapping("/web/file_info")
public class FileInfoController  {
	@Autowired
	private IFileInfoService iFileInfoService;
	@RequestMapping("/upload")
	@ResponseBody
	public Object upload(HttpServletRequest request, HttpServletResponse response) {
		JsonResult jsonResult = new  JsonResult();
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		if (multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			Iterator<String> iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				MultipartFile file = multiRequest.getFile((String) iter.next());
				if (file != null) {
					String fileName = file.getOriginalFilename();  	// 获取文件真实名称
					String path = ConfigUtil.getValue("file.path"); // 保存本地目录
					String saveFileName = FileUtil.generateFileName(fileName); // 保存的文件名 
					String savePath = FileUtil.generateSavePath(path, saveFileName); // 生成路径
					String realPath = savePath + File.separator + saveFileName;    // 完整路径 
					
					File localFile = new File(realPath);
					try {
						file.transferTo(localFile);
						FileInfo fileInfo = new FileInfo();
						fileInfo.setFileName(fileName);
						fileInfo.setUuidName(saveFileName);
						fileInfo.setSavePath(realPath);
						String tempPath = realPath.replaceAll("\\\\", "/");
						fileInfo.setAccessoryPath("/"+ConfigUtil.getValue("webserver.file.path")
								+ tempPath.replaceAll(ConfigUtil.getValue("file.path").replaceAll("\\\\", "/"),""));
						iFileInfoService.save(fileInfo);
						jsonResult.setDescription("保存成功");
					} catch (IllegalStateException | IOException e) {
						e.printStackTrace();
						jsonResult.setDescription("保存失败");
					}
					
				}
			}
		}
	return jsonResult;
}
	
	
}
