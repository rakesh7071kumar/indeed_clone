package com.IndeedBackend.IndeedApplication.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.IndeedBackend.IndeedApplication.Entity.SaveJob;


@Repository
public interface mongoRepositoryJobSave  extends MongoRepository<SaveJob, String> {

	
}
