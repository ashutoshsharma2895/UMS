package com.example.UMS;

import java.util.Iterator;


import org.springframework.beans.factory.annotation.Autowired;

public class SignInService {

	@Autowired
	private SignInPageRepo signInRepo;
	
	Iterable<UserDetailsModel> getUsers()
	{
		return signInRepo.findAll();
	}
}
