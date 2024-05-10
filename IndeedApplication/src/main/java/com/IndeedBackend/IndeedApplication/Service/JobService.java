package com.IndeedBackend.IndeedApplication.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.IndeedBackend.IndeedApplication.Entity.SaveJob;
import com.IndeedBackend.IndeedApplication.Model.ResponseBean;

@Service
public interface JobService {

	public boolean saveJobDetails(SaveJob savejob);

	public List<SaveJob> getAllDetails();
}
