package com.cg.repository;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.cg.model.NutritionistAdmin;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class NutritionistRepositoryTest {
	

	@Autowired
	private NutritionistRepository isRepo;

	@Test
	public void givenLibraryAdminShouldReturnLibraryAdminObject() 
	{
    NutritionistAdmin l1 = new NutritionistAdmin (7, "vasu","phy"); //// Input Given By User.
	isRepo.save(l1); // Given Data is Saved in DataBase.
	NutritionistAdmin l2=isRepo.findById(l1.getAdminId()).get();
	assertNotNull(l2); // check for returning Library object.
	assertEquals(l1.getProductName(), l2.getProductName());
	}



	@Test
	public void getAllmustReturnAllLibraryAdmin()
	{
		NutritionistAdmin l3 = new NutritionistAdmin(3, "sam","bio");
		NutritionistAdmin l4 = new NutritionistAdmin(5, "sanju","chme");
	isRepo.save(l3);
	isRepo.save(l4);
	List<NutritionistAdmin>stdList = (List<NutritionistAdmin>) isRepo.findAll();
	assertEquals("sanju",stdList.get(1).getAdminname());
	//assertEquals(2, stdList.size()); // CHECKING SIZE
	}
}

