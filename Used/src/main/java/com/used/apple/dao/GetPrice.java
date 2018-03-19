package com.used.apple.dao;

import java.util.Date;
import java.util.List;

import com.used.apple.entity.Iphone;

public interface GetPrice {

	List<Iphone> model(String model);
	List<Iphone> price(int price);
	List<Iphone> surface(String surface);
	List<Iphone> time(Date model);
	List<Iphone> color(String color);
	List<Iphone> arear(String area);
}
