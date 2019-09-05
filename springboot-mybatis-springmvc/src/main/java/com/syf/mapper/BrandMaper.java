package com.syf.mapper;

import java.util.List;

import com.syf.model.Brand;
import com.syf.page.Page;

public interface BrandMaper {
	
	public List<Brand> getBrandList(Page page);
	
	public void updateBrandBy(Brand user);
	
	public void deleteBrandById(long id);
	
	
	public void insertUser(Brand user);
	
	public int getTotal();
	
	

}
