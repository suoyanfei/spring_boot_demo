package com.syf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syf.mapper.BrandMaper;
import com.syf.model.Brand;
import com.syf.page.Page;
import com.syf.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private BrandMaper brandMapper;

	@Override
	public List<Brand> getBrandList(Page page) {
		// TODO Auto-generated method stub
		return brandMapper.getBrandList(page);
	}

	@Override
	public void updateBrandBy(Brand user) {
		brandMapper.updateBrandBy(user);
		
	}

	@Override
	public void deleteBrandById(long id) {
		brandMapper.deleteBrandById(id);
		
	}



	@Override
	public void insertUser(Brand user) {
		brandMapper.insertUser(user);
		
	}

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return brandMapper.getTotal();
	}
	

}
