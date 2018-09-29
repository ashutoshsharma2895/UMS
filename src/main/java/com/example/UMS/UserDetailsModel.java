package com.example.UMS;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name= "Users")
public class UserDetailsModel {

	@Id
	private Integer userId; 
	private String name;
	private String emailId;
	private String address;
	private String gender;
	
	private Integer getUserId() {
		return userId;
	}
	private void setUserId(Integer userId) {
		this.userId = userId;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getEmailId() {
		return emailId;
	}
	private void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	private String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	private String getGender() {
		return gender;
	}
	private void setGender(String gender) {
		this.gender = gender;
	}
	
}
