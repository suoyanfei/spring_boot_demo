package com.syf.service;

import java.util.List;

import com.syf.model.Goods;
import com.syf.page.Page;

public interface GoodsService {
	
	public List<Goods> getGoodsList(Page page);

}
