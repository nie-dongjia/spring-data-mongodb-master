package com.djn.cn.spring.mongodbframework.base.entity;

import java.io.Serializable;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


/**
 * 
 * @ClassName SpringDataPageable
 * @Description  公用分页参数类
 * @author BigJia-Perfect
 * @date 2017年5月14日 下午10:43:39
 *
 */
public class SpringDataPageable implements Serializable, Pageable {	    
	private static final long serialVersionUID = 1L;
	/**
	 *  当前页
	 */
	private Integer currentPageNumber = 1;
	/**
	 *  当前页面条数
	 */
	private Integer currentPageSize = 10;
	/**
	 *  排序条件
	 */
	private Sort sort;
	public Integer getCurrentPageNumber() {
		return currentPageNumber;
	}
	public void setCurrentPageNumber(Integer currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}
	public Integer getCurrentPageSize() {
		return currentPageSize;
	}
	public void setCurrentPageSize(Integer currentPageSize) {
		this.currentPageSize = currentPageSize;
	}
	@Override 
	public Sort getSort() {
		return sort;
	}
	public void setSort(Sort sort) {
		this.sort = sort;
	}
	// 当前页面  
	@Override
	public int getPageNumber() {
		return getCurrentPageNumber();
	}
	// 每一页显示的条数 
	@Override
	public int getPageSize() {
		return getCurrentPageSize();
	}
	// 第二页所需要增加的数量  
	@Override
	public int getOffset() {
		return  (getCurrentPageNumber() - 1) * getCurrentPageSize();
	}
	@Override
	public Pageable next() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Pageable previousOrFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Pageable first() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
