package com.cg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Admin")
public class NutritionistUser {
	
//
	@Id
	private int adminid;
	private String adminname;
	private String bookno;
	
	
	//
	public NutritionistUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public NutritionistUser(int adminid, String adminname, String bookno) {
		super();
		this.adminid = adminid;
		this.adminname = adminname;
		this.bookno = bookno;
	}


	public int getAdminid() {
		return adminid;
	}


	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}


	public String getAdminname() {
		return adminname;
	}


	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}


	public String getBookno() {
		return bookno;
	}


	public void setBookno(String bookno) {
		this.bookno = bookno;
	}


	@Override
	public String toString() {
		return "LibraryUser [adminid=" + adminid + ", adminname=" + adminname + ", bookno=" + bookno + "]";
	}
	
	//
	

}
