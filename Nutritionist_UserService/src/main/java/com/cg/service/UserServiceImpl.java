package com.cg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.NutritionistUser;
import com.cg.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	private UserRepository libRepo;
	@Autowired
	public UserServiceImpl(UserRepository libRepo) {
		super();
		this.libRepo = libRepo;
	    }
	@Override
	public List<NutritionistUser> getAllLibrary() {
		
		return (List<NutritionistUser>) libRepo.findAll();
		
	}
	
}
