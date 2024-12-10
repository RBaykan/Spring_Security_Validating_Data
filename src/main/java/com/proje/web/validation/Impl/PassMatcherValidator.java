package com.proje.web.validation.Impl;

import com.proje.web.dto.UserDTO;
import com.proje.web.validation.PasswordMatches;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PassMatcherValidator implements ConstraintValidator<PasswordMatches, UserDTO> {

	@Override
	public boolean isValid(UserDTO value, ConstraintValidatorContext context) {
		
		return value.getPassword().equals(value.getMachingPassword());
	}

	

}
