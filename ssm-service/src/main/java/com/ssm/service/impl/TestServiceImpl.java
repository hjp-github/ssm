package com.ssm.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.SysUserMapper;
import com.ssm.entity.SysUser;
import com.ssm.service.ITestService;

@Service
public class TestServiceImpl implements ITestService {
	
	@Autowired
	private SysUserMapper sysUserMapper;

	public void test() throws Exception {
		SysUser user = new SysUser();
		user.setId("4");
		user.setBranchId("1");
		user.setUsername("username");
		user.setPassword("password");
		user.setStaffName("staffName");
		user.setStatus("1");
		user.setCreateTime(new Date());
		sysUserMapper.insert(user);
		if(true) {
			throw new Exception();
		}
	}

}