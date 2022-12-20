package com.medicare.service;

import java.util.List;

import com.medicare.dto.WishlistDTO;
import com.medicare.model.Wishlist;

public interface WishlistService {

	public Wishlist addToWishList(WishlistDTO dto);
	
	public List<Wishlist> getAllwishlist();
	
	public List<Wishlist> getAllDataWithSameUserId(long uid);
	
	public String deleteByUserIdAndProdId(long uid,long pid);
}
