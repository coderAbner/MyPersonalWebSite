package com.used.apple.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.used.apple.entity.Iphone;

public interface GetPrice {
	

	public List<Iphone> model(String model);
	/**
	 * 
	 * @param minPrice
	 * @param maxPrice
	 * @return
	 */
	public List<Iphone> price(@Param("minPrice")int minPrice,@Param("maxPrice")int maxPrice);
	public List<Iphone> surface(String surface);
	public List<Iphone> time(Date model);
	public List<Iphone> color(String color);
	public List<Iphone> arear(String area);
}
