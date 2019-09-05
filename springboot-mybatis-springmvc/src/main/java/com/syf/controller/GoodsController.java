package com.syf.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.syf.model.Goods;
import com.syf.page.Page;
import com.syf.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService  goodsService;
	@RequestMapping("/")
	public ModelAndView brandTab() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("brandTab");
		return mv;
	}
	
	@RequestMapping("/getGoodsList")
	//@ResponseBody
    public String getGoodsList(HttpServletRequest request,Model model){
		String id = request.getParameter("id");
		//ModelAndView mv = new ModelAndView();
		Page page = new Page();
		Map<String, Object> pd = new HashMap<String, Object>();
		pd.put("id", id);
		page.setPd(pd);
		List<Goods> list = goodsService.getGoodsList(page);
		/*mv.setViewName("Goods");
		mv.addObject("list", list);*/
		model.addAttribute("list", list);
		return "Goods";
	}

}
