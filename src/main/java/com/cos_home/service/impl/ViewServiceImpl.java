package com.cos_home.service.impl;

import java.util.Date;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cos_home.entity.View;
import com.cos_home.entity.ViewExample;
import com.cos_home.mapper.ViewMapper;
import com.cos_home.service.ViewService;
import com.cos_home.util.PageUtil;



@Service("viewService")
public class ViewServiceImpl implements ViewService {

	@Resource
	ViewMapper viewMapper;
	
	@Override
	public List<View> findViewList(Integer pageSize, Integer pageIndex, String str) throws Exception {
		ViewExample example = new ViewExample();
		ViewExample.Criteria criteria = example.createCriteria();
		ViewExample.Criteria criteria2 = example.createCriteria();
		if(str!=null&&!"".equals(str)) {
			criteria.andViewNameLike('%'+str+'%');
			criteria2.andViewSpotLike('%'+str+'%');
		}
		criteria.andViewIsDelEqualTo(0);
		example.setLimitStart(PageUtil.startNo(pageIndex, pageSize));
		example.setLimitEnd(pageSize);
		return viewMapper.selectByExample(example);
	}

	@Override
	public View findViewById(Long viewId) throws Exception {
		
		return viewMapper.selectByPrimaryKey(viewId);
	}

	@Override
	public boolean deleteViewById(Long viewId) throws Exception {
		int mark = viewMapper.deleteByPrimaryKey(viewId);
		if(mark > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean addView(View view) throws Exception {
		int mark = viewMapper.insert(view);
		if(mark > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateView(View view) throws Exception {
		int mark = viewMapper.updateByPrimaryKeySelective(view);
		if(mark > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean softDeleteView(View view) throws Exception {
		view.setViewIsDel(1);
		view.setViewUpdateDate(new Date());
		int mark = viewMapper.updateByPrimaryKeySelective(view);
		if(mark > 0) {
			return true;
		}
		return false;
	}

}
