package com.cos_home.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListPaginationUtil {
	/**
	 * 列表分页工具
	 */
	public static Map<String, Object> pagination(List allList, Integer pageIndex, Integer pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> data = new HashMap<String, Object>();
		Integer total = allList.size();
		Integer pages = total / pageSize + 1;
		if (total % pageSize == 0) {
			pages = total / pageSize;
		}
		Integer fromIndex = (pageIndex - 1) * pageSize;
		Integer toIndex = fromIndex + pageSize;
		if (toIndex >= total) {
			toIndex = total;
		}
		
		data.put("pageIndex", pageIndex);
		data.put("pageSize", pageSize);
		data.put("pages", pages);
		data.put("total", total);
		map.put("code", 1);
		map.put("message", "获取成功");
		map.put("data", data);//安卓参数需要
		List<Object> partList = new ArrayList<Object>();
		if (pageIndex <= pages || pages == 0) {
			partList = allList.subList(fromIndex, toIndex);	
		} 
		data.put("partList", partList);
		return map;
	}
}
