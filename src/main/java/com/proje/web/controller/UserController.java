package com.proje.web.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proje.web.dto.UserDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/user")
public class UserController {

	// 
	@PostMapping("register")
	public String register(@RequestBody @Valid UserDTO user) {
		
		
		
		return "Validation complete";
	}
}
