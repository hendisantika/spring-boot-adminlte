package com.hendisantika.adminlte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hendisantika.adminlte.model.OutletSetUp;
import com.hendisantika.adminlte.repository.OutletSetUpRepository;

@Service
public class OutletSetUpService extends AbstractService<OutletSetUp, Long> {

	@Autowired
	private OutletSetUpRepository outletsetupRepo;

	public List<OutletSetUp> getAllOutlet() {
		return outletsetupRepo.findAll();
	}

	@Override
	protected JpaRepository<OutletSetUp, Long> getRepository() {
		return outletsetupRepo;
	}

   public void deleteOutlet(Long id){
	   outletsetupRepo.delete(id);
   }
	


}
