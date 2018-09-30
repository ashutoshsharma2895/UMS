package com.example.UMS;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SignInPageRepo extends CrudRepository<UserDetailsModel,String>{
	

	List<UserDetailsModel> getAlluserId();
	
}
