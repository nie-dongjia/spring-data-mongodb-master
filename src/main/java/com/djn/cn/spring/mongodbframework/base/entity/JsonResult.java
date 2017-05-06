package com.djn.cn.spring.mongodbframework.base.entity;
/**
 * 
 * @ClassName JsonResult
 * @Description  封装返回Json数据格式
 * @author BigJia-Perfect
 * @date 2017年5月6日 下午9:00:51
 *
 */
public class JsonResult {
	private Object results;// 结果集
	private Integer code;// 状态200、400
	private String description;// 描述
	public JsonResult() {
		super();
	}
	public Object getResults() {
		return results;
	}
	public void setResults(Object results) {
		this.results = results;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "JsonResult [results=" + results + ", code=" + code + ", description=" + description + "]";
	}
}
