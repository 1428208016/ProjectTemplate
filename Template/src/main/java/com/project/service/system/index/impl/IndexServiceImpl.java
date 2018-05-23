package com.project.service.system.index.impl;

import com.project.util.PageData;

public interface IndexServiceImpl {
	
	/**
	 * 通过用户名密码查询
	 * @return
	 */
	public PageData findUserByUserAndPwd(PageData pd) throws Exception;

}
