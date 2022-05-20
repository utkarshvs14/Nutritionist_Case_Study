package com.cg.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.model.NutritionistUser;
import com.cg.repository.UserRepository;


@SpringBootTest
@ExtendWith(MockitoExtension.class)
class UserServiceTest {


    @Mock
    private UserRepository pr;

    @InjectMocks             //used in implementation layer
    private UserServiceImpl asl;

    @Test
    public void testGetAllLibrary()
    {
    	NutritionistUser p1=new NutritionistUser(10,"Sanjeev","magical"); // user input
    	NutritionistUser p2=new NutritionistUser(18,"Virat","networking"); //user input
    	NutritionistUser p3=new NutritionistUser(45,"Rohit","Art"); //user input
        pr.save(p1); //data saved to database
        pr.save(p2); //data saved to database
        pr.save(p3); //data saved to database


        List<NutritionistUser> plist=new ArrayList<>(); // crating list object
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);


        when(pr.findAll()).thenReturn(plist); // return student list
        List<NutritionistUser> plist1 = asl.getAllLibrary();
        assertEquals(plist, plist1); //checking both objects are equal
        verify(pr,times(1)).save(p1);
        verify(pr,times(1)).findAll();


}	
}
