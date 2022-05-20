package com.cg.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.model.NutritionistUser;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserRepositoryTest {

	@Autowired
	private UserRepository isRepo;

	@Test
	public void givenNutritionistAdminShouldReturnNutritionistAdminObject() 
	{
    NutritionistUser l1 = new NutritionistUser (7, "vasu","phy"); //// Input Given By User.
	isRepo.save(l1); // Given Data is Saved in DataBase.
	NutritionistUser l2=isRepo.findById(l1.getAdminid()).get();
	assertNotNull(l2); // check for returning Library object.
	assertEquals(l1.getBookno(), l2.getBookno());
	}



	@Test
	public void getAllmustReturnAllNutritionistAdmin()
	{
		NutritionistUser l3 = new NutritionistUser(3, "sam","bio");
		NutritionistUser l4 = new NutritionistUser(5, "sanju","chme");
	isRepo.save(l3);
	isRepo.save(l4);
	List<NutritionistUser>stdList = (List<NutritionistUser>) isRepo.findAll();
	assertEquals("sanju",stdList.get(1).getAdminname());
	//assertEquals(2, stdList.size()); // CHECKING SIZE
	}
}
