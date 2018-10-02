package com.example.UMS;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {

	@Autowired
	SignInService signInService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/SignInDetails")
	
	UserDetailsModel enterUserDetails(@RequestBody UserDetailsModel userDetailsModel) {
		return signInService.putUsers(userDetailsModel);
	}
	
    @RequestMapping(method = RequestMethod.GET, value = "/Sign", produces = "application/json")
	
	Optional<UserDetailsModel> getDetails() {
		return signInService.getUsers(1);
	}
}
