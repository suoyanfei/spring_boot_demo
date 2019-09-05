package com.syf.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excel {
	
	
	public static HSSFWorkbook importWight(List<LinkedHashMap<String, Object>> list) {
		
		
		 String[] excelHeader = {"商品名称","首字母排序"};
		 
			
			// 第一步，创建一个webbook，对应一个Excel文件
			
			HSSFWorkbook wb = new HSSFWorkbook();

			// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
			HSSFSheet sheet = wb.createSheet("列表");

			// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
			HSSFRow row = sheet.createRow((int) 0);

			HSSFCellStyle style = wb.createCellStyle();
			style.setAlignment(HSSFCellStyle.ALIGN_CENTER);

			/**设置单元格格式为文本格式*/
			HSSFDataFormat format = wb.createDataFormat();
			style.setDataFormat(format.getFormat("@"));
			

			HSSFFont font = wb.createFont();
		    font.setFontHeightInPoints((short)11);
		    font.setFontName("楷书");
		    
		    
		    style.setFont(font);
		    int length = excelHeader.length;
			for (int i = 0; i < length; i++) {
				if (excelHeader[i] == null) {
					break;
				}
					HSSFCell cell = row.createCell(i);
					cell.setCellValue(excelHeader[i]);
					cell.setCellStyle(style);
					sheet.setColumnWidth(i, 6000);
					cell.setCellType(HSSFCell.CELL_TYPE_STRING); 
			}
			for (int i = 0; i < list.size(); i++) {
				row = sheet.createRow(i + 1);
				row.setHeightInPoints(20);
				HashMap map = (HashMap) list.get(i);

				Set<String> keys = map.keySet();// 得到全部的key
				Iterator<String> iter = keys.iterator();
				int m = 0;
				while (iter.hasNext()) {
						String str = iter.next();
						row.createCell(m).setCellValue(String.valueOf(map.get(str)));
						row.getCell(m).setCellStyle(style);
					m++;
				}
			}
			return wb;
		
		}
}
