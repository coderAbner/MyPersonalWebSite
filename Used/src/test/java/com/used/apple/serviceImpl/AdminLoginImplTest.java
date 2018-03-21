package com.used.apple.serviceImpl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.used.apple.dao.GetManagerInfo;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({ "classpath*:spring/spring-dao.xml", "classpath*:spring/spring-service.xml" })
public class AdminLoginImplTest {

	@Autowired
	private GetManagerInfo getManagerInfoDao;
	@Test
	public void test() {
		System.out.println(getManagerInfoDao.getManagerInfo("asdf"));
		
	}

}
