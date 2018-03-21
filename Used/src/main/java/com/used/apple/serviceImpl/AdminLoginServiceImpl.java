package com.used.apple.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.used.apple.dao.GetManagerInfo;
import com.used.apple.service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{

	@Autowired
	private GetManagerInfo getManagerInfoDao;
	@Override
	public String getPassord(String username) {
		// TODO Auto-generated method stub
		String password = getManagerInfoDao.getManagerInfo(username);
		return password;
	}

}
