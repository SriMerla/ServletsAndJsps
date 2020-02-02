package com.practise.mvc.service;

import java.util.HashMap;

import com.practise.mvc.dto.User;

public class LoginService {
	// can write code to retrieve data from database and can check the credential 
	
	   HashMap<String, String> users = new HashMap<String, String>();
	public LoginService(){
		 users.put("Sri", "sri");
		 users.put("Teja", "teja");
		 users.put("Deepu", "deepu");
		
	}
	   
	public boolean authenticate(String userId, String password){
		
	   if(password == null || password.trim() == " "){
			return false;
		}
		return true;
    }
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}

}
