package com.cg.service;

import java.util.List;

import com.cg.model.FoodModel;

public interface FoodAppService {

	public FoodModel addFoodDetails(FoodModel empd);
	public List<FoodModel> getallFoodDetails();
	public void deleteFoodDetails(int empd);
	public FoodModel updateFoodDetails(FoodModel uempd);
	
	
}
