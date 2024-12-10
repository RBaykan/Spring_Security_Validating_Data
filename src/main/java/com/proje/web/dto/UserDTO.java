package com.proje.web.dto;


import com.proje.web.validation.EmailValid;
import com.proje.web.validation.PasswordMatches;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@PasswordMatches
public class UserDTO {
	
	
	@NotNull private String firstname;
	@NotNull private String lastname;
	@NotNull private String username;
	@NotNull @NotBlank private String password;
	@NotNull @NotBlank private String machingPassword;
	
	
	@EmailValid() private String email;
	/* ya da 
	@NotNull @NotBlank @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", 
    message = "Invalid email format") private String email;*/
	
}
