package com.medicare.service;

import java.util.List;

import com.medicare.dto.AdminDTO;
import com.medicare.model.Admin;

public interface AdminService {
	public String addAdmin(AdminDTO adminDto);
	
	public List<Admin> getAllAdmin();
}
