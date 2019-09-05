package com.syf.page;

import java.util.Map;

public class Page {
	
	private Integer pagesize;
	
	private Integer pageNo;
	
	private Integer startPage;
	
	private Integer endPage;
	
	private Map<String, Object> pd;

	public Map<String, Object> getPd() {
		return pd;
	}

	public void setPd(Map<String, Object> pd) {
		this.pd = pd;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	public Integer getStartPage() {
		return (pageNo-1)*pagesize;
	}

	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}

	public Integer getEndPage() {
		return pageNo*pagesize;
	}

	public void setEndPage(Integer endPage) {
		this.endPage = endPage;
	}

	public Integer getPageno() {
		return pageNo;
	}

	public void setPageno(Integer pageno) {
		this.pageNo = pageno;
	}
	
	

}
