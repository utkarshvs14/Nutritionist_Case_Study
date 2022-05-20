package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.FoodModel;


public interface FoodAppRepository extends MongoRepository<FoodModel, Integer> {

}
