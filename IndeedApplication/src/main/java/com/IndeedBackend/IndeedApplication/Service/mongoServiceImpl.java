package com.IndeedBackend.IndeedApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.IndeedBackend.IndeedApplication.Entity.SaveJob;
import com.IndeedBackend.IndeedApplication.Model.ResponseBean;
import com.IndeedBackend.IndeedApplication.Repository.mongoRepositoryJobSave;


@Component
public class mongoServiceImpl implements JobService {

	@Autowired
	public mongoRepositoryJobSave respo;

	@Override
	public boolean saveJobDetails(SaveJob savejob) {
		respo.save(savejob);
      return true;
	}
	

	@Override
	public List<SaveJob> getAllDetails() {
		
		return respo.findAll();
		
	}

}
