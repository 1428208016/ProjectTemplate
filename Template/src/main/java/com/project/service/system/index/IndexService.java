package com.project.service.system.index;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.dao.DaoSupport;
import com.project.service.system.index.impl.IndexServiceImpl;
import com.project.util.PageData;

@Service("indexService")
public class IndexService implements IndexServiceImpl {

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	@Override
	public PageData findUserByUserAndPwd(PageData pd) throws Exception {
		return (PageData) dao.findForObject("sysUserMapper.findUserByUserAndPwd", pd);
	}

}
