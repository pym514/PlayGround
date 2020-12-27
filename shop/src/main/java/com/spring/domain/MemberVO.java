package com.spring.domain;

import java.util.Date;

public class MemberVO {
	/* create table tbl_member(
userId VARCHAR(50) not null primary key, 
userPass VARCHAR(150) not null,
userName VARCHAR(50) not null,
userPhone VARCHAR(50) not null,
userAddr1 VARCHAR(50) null,
userAddr2 VARCHAR(50) null,
userAddr3 VARCHAR(50) null,
regiDate DATE DEFAULT 0,
verify int default 0); */
	
	private String userId;
	private String userPass;
	private String userName;
	private String userPhone;
	private String userAddr1;
	private String userAddr2;
	private String userAddr3;
	private Date regDate;
	private int verify;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAddr1() {
		return userAddr1;
	}
	public void setUserAddr1(String userAddr1) {
		this.userAddr1 = userAddr1;
	}
	public String getUserAddr2() {
		return userAddr2;
	}
	public void setUserAddr2(String userAddr2) {
		this.userAddr2 = userAddr2;
	}
	public String getUserAddr3() {
		return userAddr3;
	}
	public void setUserAddr3(String userAddr3) {
		this.userAddr3 = userAddr3;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getVerify() {
		return verify;
	}
	public void setVerify(int verify) {
		this.verify = verify;
	}
	
} 
