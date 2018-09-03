package com.cos_home.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos_home.entity.View;
import com.cos_home.service.ViewService;
import com.cos_home.util.ListPaginationUtil;

@Controller
@Scope("prototype")
@RequestMapping("coshome/view")
public class ViewController {

	@Resource
	ViewService viewService;

	/**
	 * 景点列表
	 * 
	 * @author pengzhen
	 * @param str
	 *            搜索关键字 （景点名/景区名）
	 * @param pageSize
	 *            页面大小
	 * @param pageIndex
	 *            当前页码
	 * @return
	 * @throws Exception
	 * @date 2018-08-29 23:09
	 */
	@RequestMapping(value = "viewList", method = RequestMethod.GET)
	public @ResponseBody String viewList(String str, @RequestParam(defaultValue = "10") Integer pageSize,
			@RequestParam(defaultValue = "1") Integer pageIndex,Model model) throws Exception {

		List<View> parkList = viewService.findViewList(pageSize, pageIndex, str);
		Map<String, Object> map=new HashMap<String,Object>();
		map=ListPaginationUtil.pagination(parkList, pageIndex, pageSize);
		
		model.addAttribute("map", map);
		
		return "viewList";
	}

	/**
	 * 景点详情
	 * 
	 * @author pengzhen
	 * @param viewId
	 *            景点Id
	 * @return
	 * @throws Exception
	 * @date 2018-08-29 23:14
	 */
	@RequestMapping(value = "viewInfo", method = RequestMethod.GET)
	public String viewDetail(Long viewId,Model model) throws Exception {
		View view = viewService.findViewById(viewId);//景点详情
		List<View> viewList=viewService.viewList();
		
		model.addAttribute("view", view);
		model.addAttribute("viewList", viewList);
		
		return "front/viewDetail";
	}
}
