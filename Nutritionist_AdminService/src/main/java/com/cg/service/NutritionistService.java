package com.cg.service;

import java.util.List;

import com.cg.exception.NutritionistAlreadyDeletedException;
import com.cg.exception.NutritionistAlreadyExistsException;
import com.cg.model.NutritionistAdmin;

public interface NutritionistService {
	
	public NutritionistAdmin addLibrary(NutritionistAdmin ad) throws NutritionistAlreadyExistsException;
	public List<NutritionistAdmin> getAllLibrary();
	public void deleteLibraryBydeptno(int bookno) throws NutritionistAlreadyDeletedException;
	public NutritionistAdmin updateLibrary(NutritionistAdmin ud);
	
}