package com.djn.cn.spring.mongodbframework.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;

/**
 * 
 * @ClassName FileUtil
 * @Description 文件工具类
 * @author BigJia-Perfect
 * @date 2017年5月6日 下午8:55:44
 *
 */
public class FileUtil {

	/**
	 * 返回文件保存的路径
	 * 
	 * @Title generateSavePath
	 * @return String
	 *
	 */
	public static String generateSavePath(String path, String fileName) {
		int hashcode = fileName.hashCode(); // 121221
		int dir1 = hashcode & 15;
		int dir2 = (hashcode >> 4) & 0xf;
		String savePath = path + File.separator + dir1 + File.separator + dir2;
		File file = new File(savePath);
		if (!file.exists()) {
			file.mkdirs();
		}
		return savePath;
	}

	/**
	 * 获取保存文件的名字
	 * 
	 * @Title generateFileName
	 * @return String
	 *
	 */
	public static String generateFileName(String fileName) {
		return UUID.randomUUID().toString() + "_" + fileName;
	}

	/**
	 * 根据图片路径下载图片
	 * 
	 * @param sourceURL
	 * @param filePath
	 * @param fileName
	 */
	public static String uploadImageFileByUrl(String sourceURL, String savePath) {
		String fileName = "";
		URL url = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		HttpURLConnection conn = null;
		try {
			url = new URL(sourceURL);
			conn = (HttpURLConnection) url.openConnection();
			String fileType = conn.getContentType();
			if ("image/gif".equalsIgnoreCase(fileType) || "image/jpeg".equalsIgnoreCase(fileType)
					|| "image/bmp".equalsIgnoreCase(fileType) || "image/png".equalsIgnoreCase(fileType)) {
				bis = new BufferedInputStream(url.openStream());
				fileName = UUID.randomUUID().toString() + "."
						+ fileType.substring(fileType.indexOf("/") + 1, fileType.length());
				bos = new BufferedOutputStream(new FileOutputStream(new File(savePath + fileName)));
				byte[] b = new byte[2048];
				int length = bis.read(b);
				while (length > -1) {
					bos.write(b, 0, length);
					length = bis.read(b);
				}
				System.out.println(fileName);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bos != null) {
					bos.close();
				}
				if (conn != null) {
					conn.disconnect();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return fileName;
	}
}
