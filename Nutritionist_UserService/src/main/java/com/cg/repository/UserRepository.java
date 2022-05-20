package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.cg.model.NutritionistUser;

public interface UserRepository extends MongoRepository<NutritionistUser, Integer> {

}
