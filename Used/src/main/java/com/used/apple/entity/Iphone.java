package com.used.apple.entity;

import java.util.Date;

public class Iphone {
	
	private int priceid;
	private String model;
	private Date time;
	private String color;
	private String area;
	private String network;
	private String surface;
	private int price;
	public int getPriceid() {
		return priceid;
	}
	public void setPriceid(int priceid) {
		this.priceid = priceid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getSurface() {
		return surface;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Iphone [priceid=" + priceid + ", model=" + model + ", time=" + time + ", color=" + color + ", area="
				+ area + ", network=" + network + ", surface=" + surface + ", price=" + price + "]";
	}
	

}
