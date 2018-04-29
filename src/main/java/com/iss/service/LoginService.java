package com.iss.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String userid, String password) {		
		return userid.equalsIgnoreCase("bhairav") && password.equalsIgnoreCase("test321");
	}
}
