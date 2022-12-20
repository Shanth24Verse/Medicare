package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.dto.AdminDTO;
import com.medicare.model.Admin;
import com.medicare.service.AdminService;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:4200/")
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@PostMapping("/add-admin")
	public String addAdmin(@RequestBody AdminDTO dto) {
		return service.addAdmin(dto);
	}
	
	@GetMapping("/getAll")
	public List<Admin> getAllAdmins(){
		return service.getAllAdmin();
	}
	
}
