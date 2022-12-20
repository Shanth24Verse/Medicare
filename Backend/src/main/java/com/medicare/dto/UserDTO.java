package com.medicare.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	private long id;
	private String name;
	private String email;
	private String password;
	private long phone;
	

}