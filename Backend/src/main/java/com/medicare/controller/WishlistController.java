package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.dto.WishlistDTO;
import com.medicare.model.Wishlist;
import com.medicare.service.WishlistService;

@RestController
@RequestMapping("/wishlist")
@CrossOrigin("http://localhost:4200/")
public class WishlistController {
	
	@Autowired
	private WishlistService service;
	
	@GetMapping("/add/{uid}/{pid}")
	public Wishlist addWishlist(@PathVariable long uid, @PathVariable long pid ) {
		WishlistDTO list=new WishlistDTO(uid,pid);
		return service.addToWishList(list);
	}
	
	@GetMapping("/getAll")
	public List<Wishlist> getAllList(){
		return service.getAllwishlist();
	}
	
	@GetMapping("/get-user-wishlist/{uid}")
	public List<Wishlist> getUserWishlit(@PathVariable long uid)
	{
		return service.getAllDataWithSameUserId(uid);
	}
	
	@DeleteMapping("/delete/{uid}/{pid}")
	public String deleteData(@PathVariable long uid, @PathVariable long pid) {
		service.deleteByUserIdAndProdId(uid, pid);
		return "data deleted";
	}
	

}
