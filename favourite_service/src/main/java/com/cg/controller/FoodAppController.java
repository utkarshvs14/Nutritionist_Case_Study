package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.FoodModel;
import com.cg.service.FoodAppService;

@Component
@RestController
@RequestMapping("/api/v1")
public class FoodAppController {
	
	private FoodAppService service;
	
	@Autowired
	public FoodAppController(FoodAppService emps) {
		super();
		this.service = emps;
	}
	
	@PostMapping("/add")
	public ResponseEntity<FoodModel>addFoodDetail(@RequestBody  FoodModel empadd){
		FoodModel empsave=service.addFoodDetails(empadd);
		return new ResponseEntity<>(empsave,HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<FoodModel>> foodDetail(){
	return new ResponseEntity<List<FoodModel>>((List<FoodModel>)service.getallFoodDetails(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{foodNo}")
	public ResponseEntity<Void> deleteFoodDetailById(@PathVariable int foodNo){
		service.deleteFoodDetails(foodNo);
		return ResponseEntity.noContent().build();
	}
	@PutMapping("/update")
	public FoodModel updateFoodDetail(@RequestBody FoodModel empu) {
		return service.updateFoodDetails(empu);
		
	}
	

}
