package com.syf.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.OutputBuffer;
import org.eclipse.jdt.internal.compiler.ast.ModuleDeclaration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.syf.model.Brand;
import com.syf.model.DataGrid;
import com.syf.model.Goods;
import com.syf.model.Json;
import com.syf.page.Page;
import com.syf.service.BrandService;
@Controller
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	
	//@RequestMapping("/getBrandList")
	@GetMapping("/getBrandList")
	@ResponseBody
	public List<Brand> getBrandList(){
		Page page = new Page();
		page.setPageno(1);
		page.setPagesize(10);
		Map<String, Object> pd = new HashMap<>();
		page.setPd(pd);
		List<Brand> list = brandService.getBrandList(page);
		return list;
		
	}
	/**
	 * 跳转文件上传测试页面
	 * @return
	 */
	@RequestMapping("/toBrand")
	//@ResponseBody
	public ModelAndView toBrand() {
		ModelAndView model = new ModelAndView();
		System.out.println("aaaaaa");
		model.setViewName("uploadBrand");
		return model;
		
	}
	/*public ModelAndView toAddBrand() {
		ModelAndView model = new ModelAndView();
		model.setViewName("addBrand");
		return model;
	}*/
	/**
	 * 使用表单的方式提交
	 * @param file
	 */
	@RequestMapping("/addFile")
	public void addFile(@RequestParam("file") MultipartFile file3) {
		String name = file3.getName();
		String fileName = file3.getOriginalFilename();
		System.out.println(name);
		System.out.println(fileName);
		File path = new File("E:\\test"+File.separator+fileName);
		try {
			//这是springmvc提供的 上传问价的功能
			//file.transferTo(path);
			
			//以流的方式 上传 创建输入流
			InputStream in = file3.getInputStream();
			//创建输出流
			OutputStream out = new FileOutputStream(path);
			byte[] b = new byte[1024];
			int i=0;
			//输入流是读到-1 代表没有数据
			while((i=in.read(b))!=-1) {
				out.write(b, 0, i);
			}
			out.close();
			out.flush();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	/**
	 * 使用ajax的方式提交
	 * @param file
	 * @param file1
	 */
	@RequestMapping("/addFile1")
	public void addFile1(@RequestParam("file") MultipartFile file,
			@RequestParam("file1") MultipartFile file1) {
		String name = file.getName();
		String fileName = file.getOriginalFilename();
		String fileName1 = file1.getOriginalFilename();
		System.out.println(name);
		System.out.println(fileName);
		File path = new File("E:\\360downloads"+File.separator+fileName);
		File path1 = new File("E:\\360downloads"+File.separator+fileName1);
		try {
			//这是springmvc提供的 上传问价的功能
			//file.transferTo(path1);
			
			//以流的方式 上传 创建输入流
			InputStream in = file.getInputStream();
			//创建输出流
			OutputStream out = new FileOutputStream(path);
			byte[] b = new byte[1024];
			int i=0;
			//输入流是读到-1 代表没有数据
			while((i=in.read(b))!=-1) {
				out.write(b, 0, i);
			}
			out.close();
			out.flush();
			
			//以流的方式 上传 创建输入流
			InputStream in1 = file1.getInputStream();
			//创建输出流
			OutputStream out1 = new FileOutputStream(path1);
			byte[] b1 = new byte[1024];
			int i1=0;
			//输入流是读到-1 代表没有数据
			while((i1=in1.read(b1))!=-1) {
				out1.write(b1, 0, i1);
			}
			out1.close();
			out1.flush();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@RequestMapping("/uploadOnChange")
	@ResponseBody
	public Map<String,Object> uploadOnChange(@RequestParam("file") MultipartFile  upLoadFile,Model m) {
		Map<String,Object> map  = new HashMap<String, Object>();
		
		String fileName = upLoadFile.getOriginalFilename();
		File file = new File("E:\\Adobe"+File.separator+fileName);
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put("filePath", "http://localhost:8080/image/001.jpg");
		
		return map;
	}
	@RequestMapping("/toOnChangeFile")
	public ModelAndView toOnChangeFile() {
		ModelAndView model = new ModelAndView();
		model.setViewName("onChangeFile");
		
		return model;
	}
    @RequestMapping("/toTab")
	public ModelAndView toTab() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("tabjsp");
		return mv;
	}
	@RequestMapping("test")
    public ModelAndView test() {
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("filePath", "http://localhost:8080/image/001.jpg");
    	mv.addObject("data", "我是域中数据data");
    	mv.addObject("data1", "我是域中数据data1");
    	mv.addObject("data2", "我是域中数据data2");
    	mv.addObject("data3", "我是域中数据data3");
    	mv.setViewName("test");
    	return mv;
    }
	
	@RequestMapping("toBrandGrid")
	public ModelAndView toBrandGrid() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("brand");
		return mv;
	}
	/**
	 * 初始化dataGrid
	 * @return
	 */
	@RequestMapping("/initDataGrid")
	@ResponseBody
	public DataGrid initDataGrid(HttpServletRequest request) {
		String pageno = request.getParameter("page");
		String size = request.getParameter("rows");
		
		String name = request.getParameter("name");
		DataGrid da = new DataGrid();
		Page page = new Page();
		page.setPageno(Integer.valueOf(pageno));
		page.setPagesize(Integer.valueOf(size));
		Map<String, Object> pd = new HashMap<String,Object>();
		pd.put("name", name);
		page.setPd(pd);
		List<Brand> list = brandService.getBrandList(page);
		da.setTotal(brandService.getTotal());
		da.setRows(list);
		return da;
		
	}
	
	/**
	 * 基本数据导出
	 */
	@RequestMapping("/exprot")
	public void exprot(String rows) {
		List<Map> list = JSONArray.parseArray(rows, Map.class);
	    for(Map map : list) {
	    	Iterator iterator = map.keySet().iterator();
	    	while(iterator.hasNext()) {
	    		String next = (String) iterator.next();
	    		System.out.println("key----"+next  +"    value   "+map.get(next));
	    	}
	    }
		
	}
	/**
	 *详细数据导出
	 */
	@RequestMapping("/exprotDetail")
	public void exprotDetail(@RequestParam("list[]") List<Integer> ids) {
	for(Integer id : ids) {
		System.out.println(id);
	 }
	}
	
	/**
	 * 新增数据
	 */
	//@RequestMapping("/saveBrand")
	@PostMapping("/saveBrand/{type}")
	@ResponseBody
	public Json saveBrand(@RequestBody Brand brand,@PathVariable("type") String type) {
		Json json = new Json();
		try {
			brandService.insertUser(brand);
			json.setMsg("新增成功哦!!!");
			json.setSuccess(true);
		} catch (Exception e) {
			json.setMsg("新增失败哦!!!");
			json.setSuccess(false);
			e.printStackTrace();
		}
		
		return json;
	}
	/**
	 * @RequestParam 和 @PathVariable 注解是用于从request中接收请求的，两个都可以接收参数
	 * 关键点不同的是@RequestParam 是从request当前请求里面拿取值，
	 * 而 @PathVariable 是从一个URI模板里面来填充拿值
	 * @param id
	 */
	@GetMapping("/user/{id}")
	//@RequestMapping("/user")
	@ResponseBody
	public void index(@PathVariable("id") long id) {
		System.out.println(id);
	}
	
	
	
}
