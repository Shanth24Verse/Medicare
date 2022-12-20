package com.medicare.service;

import java.util.List;

import com.medicare.dto.UserDTO;
import com.medicare.model.User;

public interface UserService {

	public String addUser(UserDTO userDto);
	
	public List<User> getAllUser();
	
	public String updateUser(UserDTO userDto);
	
	public User getUserById(long id);
	
	public String deleteUser(long id);
}
