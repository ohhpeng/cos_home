package com.cos_home.service;

import java.util.List;

import com.cos_home.entity.View;

public interface ViewService {

	/**
	 * 获取景点列表
	 * 
	 * @author pengzhen
	 * @param pageSize
	 *            页面大小
	 * @param pageIndex
	 *            当前页码
	 * @param str
	 *            搜索关键字
	 * @return
	 * @throws Exception
	 * @date 2018-08-28 21:32
	 */
	public List<View> findViewList(Integer pageSize, Integer pageIndex, String str) throws Exception;

	/**
	 * 获取景点详情
	 * 
	 * @author pengzhen
	 * @param viewId
	 *            景点id
	 * @return
	 * @throws Exception
	 * @date 2018-08-28 21:33
	 */
	public View findViewById(Long viewId) throws Exception;

	/**
	 * 删除景点信息
	 * 
	 * @author pengzhen
	 * @param viewId
	 * @return
	 * @throws Exception
	 * @date 2018-08-28 21:34
	 */
	public boolean deleteViewById(Long viewId) throws Exception;

	/**
	 * 新增景点
	 * 
	 * @author pengzhen
	 * @param view
	 * @return
	 * @throws Exception
	 * @date 2018-08-28 21:36
	 */
	public boolean addView(View view) throws Exception;

	/**
	 * 编辑景点
	 * 
	 * @author pengzhen
	 * @param view
	 * @return
	 * @throws Exception
	 * @date 2018-08-28 21:37
	 */
	public boolean updateView(View view) throws Exception;

	/**
	 * 软删除景点信息
	 * 
	 * @author pengzhen
	 * @param view
	 * @return
	 * @throws Exception
	 * @date 2018-08-28 22:06
	 */
	public boolean softDeleteView(View view) throws Exception;
	
	/**
	 * 人气景点推荐
	 * @author pengzhen
	 * @return
	 * @throws Exception
	 * @date 2018-09-03 11:32
	 */
	public List<View> viewList() throws Exception;
}
