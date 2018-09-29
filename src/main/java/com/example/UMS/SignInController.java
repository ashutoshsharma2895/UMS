package com.example.UMS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {

	@Autowired
	SignInService signInService;
	
	@RequestMapping(method = RequestMethod.GET,value = "/SignInDetails")
	List<UserDetailsModel> getAllUsers()
	{
		return signInService.getUsers();
	}
}
