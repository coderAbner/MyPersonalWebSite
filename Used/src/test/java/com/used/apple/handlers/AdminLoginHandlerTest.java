package com.used.apple.handlers;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.used.apple.service.AdminLoginService;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({ "classpath*:spring/spring-dao.xml", "classpath*:spring/spring-service.xml" })
public class AdminLoginHandlerTest {
	

	@Autowired
	private AdminLoginService adminLoginService;

	@Test
	public void test() {
		String pass = adminLoginService.getPassord("asdf");
		System.out.println("查到的密码是："+pass);
	}

}

