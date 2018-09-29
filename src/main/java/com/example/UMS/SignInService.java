package com.example.UMS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class SignInService {

	@Autowired
	private SignInPageRepo signInRepo;
	
	List<UserDetailsModel> getUsers()
	{
		return signInRepo.getAlluserId();
	}
}
