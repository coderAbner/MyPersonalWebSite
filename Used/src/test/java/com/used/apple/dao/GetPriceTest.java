package com.used.apple.dao;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.used.apple.entity.Iphone;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath*:spring/spring-dao.xml", "classpath*:spring/spring-service.xml" })
public class GetPriceTest {

	@Autowired
	private GetPrice getPrice;

	@Test
	public void test3() {
		final Logger logger=LoggerFactory.getLogger(this.getClass());
		List<Iphone> iphone = getPrice.model("5s");
		Iterator it = iphone.iterator();
		while (it.hasNext()) {
			System.out.println();
			logger.info("查到：" + it.next().toString());
			System.out.println();
		}
	}

}
