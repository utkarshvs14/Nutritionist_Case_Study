package com.cg.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.NutritionistAlreadyDeletedException;
import com.cg.exception.NutritionistAlreadyExistsException;
import com.cg.model.NutritionistAdmin;
import com.cg.repository.NutritionistRepository;
@Service
public class NutritionistServiceImpl implements NutritionistService{

private NutritionistRepository libRepo;
    @Autowired
	public NutritionistServiceImpl(NutritionistRepository libRepo) {
	super();
	this.libRepo = libRepo;
    }
	
	@Override
	public NutritionistAdmin addLibrary(NutritionistAdmin ad) throws NutritionistAlreadyExistsException {
		if(libRepo.existsById(ad.getAdminId())) {
			throw new NutritionistAlreadyExistsException();
			}
	   NutritionistAdmin saveli= libRepo.save(ad);
		return saveli;
	}

	@Override
	public List<NutritionistAdmin> getAllLibrary() {
		return (List<NutritionistAdmin>) libRepo.findAll();
	}

	@Override
	public void deleteLibraryBydeptno(int bookno) throws NutritionistAlreadyDeletedException{
		libRepo.deleteById(bookno);	
	}

	@Override
	public NutritionistAdmin updateLibrary(NutritionistAdmin ud) {
		NutritionistAdmin record;
		Optional<NutritionistAdmin> opt= libRepo.findById(ud.getAdminId());
		if(opt.isPresent()) {
		record=opt.get();
		record.setAdminname(ud.getAdminname());
		record.setProductName(ud.getProductName());
		libRepo.save(record);
		}else {
		return new NutritionistAdmin();
		}
		return record;
	}

	
}
