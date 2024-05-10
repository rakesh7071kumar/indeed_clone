package com.IndeedBackend.IndeedApplication.Entity;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "SaveJobDetails")
public class SaveJob {

	@Id
	private String Id;
	private String profile;
	private String type;
	private String description;
	private String experience;
	private String[] technology;
	private String salary;
	
	
	public String getId() {
		return Id;
	}
	public String getProfile() {
		return profile;
	}
	public String getType() {
		return type;
	}
	public String getDescription() {
		return description;
	}
	public String getExperience() {
		return experience;
	}
	public String[] getTechnology() {
		return technology;
	}
	public String getSalary() {
		return salary;
	}
	public void setId(String id) {
		Id = id;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public void setTechnology(String[] technology) {
		this.technology = technology;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public SaveJob(String id, String profile, String type, String description, String experience, String[] technology,
			String salary) {
		super();
		Id = id;
		this.profile = profile;
		this.type = type;
		this.description = description;
		this.experience = experience;
		this.technology = technology;
		this.salary = salary;
	}
	
	public SaveJob() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "SaveJob [Id=" + Id + ", profile=" + profile + ", type=" + type + ", description=" + description
				+ ", experience=" + experience + ", technology=" + Arrays.toString(technology) + ", salary=" + salary
				+ "]";
	}
	
	

	
	
	
	
	
	
}
