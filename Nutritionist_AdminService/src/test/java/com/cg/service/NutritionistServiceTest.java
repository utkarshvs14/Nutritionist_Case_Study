package com.cg.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.exception.NutritionistAlreadyExistsException;
import com.cg.model.NutritionistAdmin;
import com.cg.repository.NutritionistRepository;
 
@SpringBootTest
@ExtendWith(MockitoExtension.class)
class NutritionistServiceTest {

	
	    @Mock
	    private NutritionistRepository pr;

	    @InjectMocks             //used in implementation layer
	    private NutritionistServiceImpl asl;

	    @Test
	    public void TestAddLibrary() throws NutritionistAlreadyExistsException 
	    {
	        NutritionistAdmin p1=new NutritionistAdmin(10,"sanjeev","magical"); // user input
	        when(pr.save(any())).thenReturn(p1); //save any object to repository
	        asl.addLibrary(p1); //data saved in database
	        verify(pr,times(1)).save(any()); //calling any method once
	    }


	    @Test
	    public void testGetAllLibrary()
	    {
	    	NutritionistAdmin p1=new NutritionistAdmin(10,"Sanjeev","magical"); // user input
	    	NutritionistAdmin p2=new NutritionistAdmin(18,"Virat","networking"); //user input
	    	NutritionistAdmin p3=new NutritionistAdmin(45,"Rohit","Art"); //user input
	        pr.save(p1); //data saved to database
	        pr.save(p2); //data saved to database
	        pr.save(p3); //data saved to database


	        List<NutritionistAdmin> plist=new ArrayList<>(); // crating list object
	        plist.add(p1);
	        plist.add(p2);
	        plist.add(p3);


	        when(pr.findAll()).thenReturn(plist); // return student list
	        List<NutritionistAdmin> plist1 = asl.getAllLibrary();
	        assertEquals(plist, plist1); //checking both objects are equal
	        verify(pr,times(1)).save(p1);
	        verify(pr,times(1)).findAll();


	}
	}

