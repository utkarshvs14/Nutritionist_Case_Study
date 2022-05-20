package com.cg.controller;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.NutritionistAlreadyDeletedException;
import com.cg.exception.NutritionistAlreadyExistsException;
import com.cg.model.NutritionistAdmin;
    import com.cg.service.NutritionistService;

	@RestController
	@RequestMapping("/api/v1")
	public class NutritionistController {		
			private NutritionistService liserv;
			@Autowired
			public NutritionistController(NutritionistService isroserv) {
				super();
				this.liserv =isroserv;
			}
		@PostMapping("/add")
		public ResponseEntity<NutritionistAdmin>addLibraryAdmin(@RequestBody NutritionistAdmin dept) throws NutritionistAlreadyExistsException{
			NutritionistAdmin  savedDept = liserv.addLibrary(dept);
			 return new ResponseEntity<>(savedDept, HttpStatus.CREATED);
		}
		
		@GetMapping("/getall")
		public ResponseEntity<List<NutritionistAdmin>> getAllLibraryAdmin(){
	    return new ResponseEntity<List<NutritionistAdmin>>((List<NutritionistAdmin>)liserv.getAllLibrary(),HttpStatus.OK);
		}

	    @DeleteMapping("/delete/{bookno}") 
	    public ResponseEntity<Void> deletebookById(@PathVariable int bookno) throws NutritionistAlreadyDeletedException{
	    liserv.deleteLibraryBydeptno(bookno);
	    return ResponseEntity.noContent().build();
	    }

	    @PutMapping("/update")
		public NutritionistAdmin updateLibraryAdmin(@RequestBody NutritionistAdmin dname) {  
		return liserv.updateLibrary(dname);
		}

}
