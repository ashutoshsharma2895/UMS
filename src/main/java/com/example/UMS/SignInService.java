package com.example.UMS;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInService {

	@Autowired
	private SignInPageRepo signInRepo;
	
	UserDetailsModel saveUser(UserDetailsModel userDetailModel)
	{
		return signInRepo.save(userDetailModel);
		
	}
	
	Optional<UserDetailsModel> getUsers(Integer x)
	{
		return signInRepo.findById(x);
	}
}