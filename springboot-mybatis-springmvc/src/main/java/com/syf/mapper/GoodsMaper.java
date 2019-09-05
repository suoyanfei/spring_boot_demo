package com.syf.mapper;

import java.util.List;

import com.syf.model.Brand;
import com.syf.model.Goods;
import com.syf.page.Page;

public interface GoodsMaper {
	
	public List<Goods> getGoodsList(Page page);
	
	

}
