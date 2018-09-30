package com.example.UMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {

	@Autowired
	SignInService signInService;

	@RequestMapping(method = RequestMethod.GET, value = "/SignInDetails")
	Iterable<UserDetailsModel> getAllUsers() {
		return signInService.getUsers();
	}
}
