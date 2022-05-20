package com.cg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="foodapp")
public class FoodModel {

	//Attributes
	@Id
	private int foodNo;
	private String foodName,foodOrigin,comments;
	public FoodModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodModel(int foodNo, String foodName, String foodOrigin, String comments) {
		super();
		this.foodNo = foodNo;
		this.foodName = foodName;
		this.foodOrigin = foodOrigin;
		this.comments = comments;
	}
	public int getFoodNo() {
		return foodNo;
	}
	public void setFoodtNo(int foodNo) {
		this.foodNo = foodNo;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String food) {
		this.foodName = foodName;
	}
	public String getFoodOrigin() {
		return foodOrigin;
	}
	public void setFoodOrigin(String foodOrigin) {
		this.foodOrigin = foodOrigin;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "FoodModel [foodNo=" + foodNo + ", foodName=" + foodName + ", foodOrigin=" + foodOrigin
				+ ", comments=" + comments + "]";
	}
	
}
