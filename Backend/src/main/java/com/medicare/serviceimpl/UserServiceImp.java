package com.medicare.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.dto.UserDTO;
import com.medicare.model.User;
import com.medicare.repository.UserRepository;
import com.medicare.service.UserService;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository repo;

	@Override
	public String addUser(UserDTO userDto) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setEmail(userDto.getEmail());
		user.setName(userDto.getName());
		user.setPassword(userDto.getPassword());
		user.setPhone(userDto.getPhone());
		repo.save(user);
			return "New User Registered";
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String updateUser(UserDTO userDto) {
		// TODO Auto-generated method stub
		User userToUpdate=new User();
		userToUpdate.setId(userDto.getId());
		userToUpdate.setEmail(userDto.getEmail());
		userToUpdate.setName(userDto.getName());
		userToUpdate.setPhone(userDto.getPhone());
		userToUpdate.setPassword(userDto.getPassword());
		
		repo.save(userToUpdate);
		
		return "User Updated Successfully";
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public String deleteUser(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "User deleted";
	}
	


}
