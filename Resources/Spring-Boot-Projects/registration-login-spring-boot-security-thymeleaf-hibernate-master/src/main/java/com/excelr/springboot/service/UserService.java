package com.excelr.springboot.service;

import com.excelr.springboot.model.User;
import com.excelr.springboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
