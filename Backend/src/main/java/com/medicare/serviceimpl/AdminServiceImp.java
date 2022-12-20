package com.medicare.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.dto.AdminDTO;
import com.medicare.model.Admin;
import com.medicare.repository.AdminRepository;
import com.medicare.service.AdminService;

@Service
public class AdminServiceImp implements AdminService {
	
	
	@Autowired
	private AdminRepository repo;

	@Override
	public String addAdmin(AdminDTO adminDto) {
		Admin admin=new Admin();
		admin.setEmail(adminDto.getEmail());
		admin.setPassword(adminDto.getPassword());
			repo.save(admin);
			return "New Admin data saved";
	}

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
}