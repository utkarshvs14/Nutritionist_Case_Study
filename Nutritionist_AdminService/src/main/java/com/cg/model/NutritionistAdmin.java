package com.cg.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="NutritionistAdmin")
public class NutritionistAdmin {
//
@Id
private int adminId;
private String adminname;
private String  ProductName;
public NutritionistAdmin() {
	super();
	// TODO Auto-generated constructor stub
}
public NutritionistAdmin(int adminId, String adminname, String productName) {
	super();
	this.adminId = adminId;
	this.adminname = adminname;
	this.ProductName = productName;
}
@Override
public String toString() {
	return "NutritionistAdmin [adminId=" + adminId + ", adminname=" + adminname + ", ProductName=" + ProductName + "]";
}
public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getAdminname() {
	return adminname;
}
public void setAdminname(String adminname) {
	this.adminname = adminname;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
}


