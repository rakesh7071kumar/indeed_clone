package com.IndeedBackend.IndeedApplication.Controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.IndeedBackend.IndeedApplication.Entity.SaveJob;
import com.IndeedBackend.IndeedApplication.Model.ResponseBean;
import com.IndeedBackend.IndeedApplication.Service.JobService;
import com.IndeedBackend.IndeedApplication.Service.mongoServiceImpl;

@RestController
@CrossOrigin
public class JobSavingController {

	private static final Logger LOGGER = LogManager.getLogger(JobSavingController.class);

	@Autowired
	private JobService mongorepoimp;

	@PostMapping("/saveJobDetails")
	public ResponseBean saveJobDetails(@RequestBody SaveJob savejobDetails) {

		LOGGER.info("inside saveJobDetails api");

		ResponseBean response = new ResponseBean();
		boolean result = mongorepoimp.saveJobDetails(savejobDetails);
		if (result) {
			response.setCode(200);
			response.setMessage("save job details sucessfully..");
		} else {
			response.setCode(404);
			response.setMessage(" job details not saved.");
		}
		return response;

	}
	
	
	@GetMapping("/getAllJobs")
	public List<SaveJob> getAllDetails() {
		return  mongorepoimp.getAllDetails();
	}
	
	

}
