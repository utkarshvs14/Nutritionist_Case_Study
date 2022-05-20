package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.FoodModel;
import com.cg.repository.FoodAppRepository;

@Service
public class FoodAppServiceImp implements FoodAppService {

	private FoodAppRepository repository;
	
	@Autowired 
	public FoodAppServiceImp(FoodAppRepository emprepo) {
		super();
		this.repository = emprepo;
	}
	
	
	@Override
	public FoodModel addFoodDetails(FoodModel empd) {
		FoodModel empsave=repository.save(empd);
		return empsave;
	}

	@Override
	public List<FoodModel> getallFoodDetails() {
		return (List<FoodModel>)repository.findAll();
	}

	@Override
	public void deleteFoodDetails(int empd) {
			repository.deleteById(empd);
	
		
	}


	@Override
	public FoodModel updateFoodDetails(FoodModel uempd) {
		FoodModel record;
		Optional<FoodModel> opt=repository.findById(uempd.getFoodNo());
		if(opt.isPresent()) {
	    record=opt.get();
		record.setFoodName(uempd.getFoodName());
		record.setFoodOrigin(uempd.getFoodOrigin());
		record.setComments(uempd.getComments());
		repository.save(record);
		}else {
			return new FoodModel();
		}
		return record;
	}

}
