package com.spring.domain;

import java.util.Date;

public class GoodsVO {
	/* CREATE TABLE tbl_goods(
			gdsNum int not null primary key,
			gdsName VARCHAR(50) not null,
			cateCode VARCHAR(50) not null,
			gdsPrice Int not null,
			gdsStock Int null,
			gdsDes VARCHAR(50) null,
			gdsIMG VARCHAR(50) NULL,
			gdsDate date default 0); */
	
	private int gdsNum;
	private String gdsName;
	private String cateCode;
	private int gdsPrice;
	private int gdsStock;
	private String gdsDes;
	private String gdsImg;
	private Date gdsDate;
	public int getGdsNum() {
		return gdsNum;
	}
	public void setGdsNum(int gdsNum) {
		this.gdsNum = gdsNum;
	}
	public String getGdsName() {
		return gdsName;
	}
	public void setGdsName(String gdsName) {
		this.gdsName = gdsName;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public int getGdsPrice() {
		return gdsPrice;
	}
	public void setGdsPrice(int gdsPrice) {
		this.gdsPrice = gdsPrice;
	}
	public int getGdsStock() {
		return gdsStock;
	}
	public void setGdsStock(int gdsStock) {
		this.gdsStock = gdsStock;
	}
	public String getGdsDes() {
		return gdsDes;
	}
	public void setGdsDes(String gdsDes) {
		this.gdsDes = gdsDes;
	}
	public String getGdsImg() {
		return gdsImg;
	}
	public void setGdsImg(String gdsImg) {
		this.gdsImg = gdsImg;
	}
	public Date getGdsDate() {
		return gdsDate;
	}
	public void setGdsDate(Date gdsDate) {
		this.gdsDate = gdsDate;
	}
	
}
