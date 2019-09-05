package com.syf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syf.mapper.GoodsMaper;
import com.syf.model.Goods;
import com.syf.page.Page;
import com.syf.service.GoodsService;
@Service
public class GoosServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsMaper goodsMapper;

	@Override
	public List<Goods> getGoodsList(Page page) {
		
		return goodsMapper.getGoodsList(page);
	}

}
