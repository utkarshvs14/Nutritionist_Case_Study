package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.cg.model.NutritionistAdmin;

public interface NutritionistRepository extends MongoRepository<NutritionistAdmin, Integer>  {

}
