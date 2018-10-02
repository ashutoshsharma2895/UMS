package com.example.UMS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name= "user")
public class UserDetailsModel {

	@Id
	@Column(name="userid")
	private Integer userId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="gender")
	private String gender;
	@Column(name="role")
	private String role;
	@Column(name="dob")
	private String dob;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="phno")
	private String phoneNo;
	@Column(name="password")
	private String password;
	@Column(name="created_at")
	private String createdAt;
	@Column(name="updated_at")
	private String updatedAt;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreated_at() {
		return createdAt;
	}
	public void setCreated_at(String created_at) {
		this.createdAt = created_at;
	}
	public String getUpdated_at() {
		return updatedAt;
	}
	public void setUpdated_at(String updated_at) {
		this.updatedAt = updated_at;
	}
	
	
}
