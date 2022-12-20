package com.medicare.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.dto.WishlistDTO;
import com.medicare.model.Wishlist;
import com.medicare.repository.WishlistRepository;
import com.medicare.service.WishlistService;

@Service
public class WishlistServiceImp implements WishlistService{
	
	@Autowired
	private WishlistRepository repo;
	
	@Override
	public Wishlist addToWishList(WishlistDTO dto) {
		// TODO Auto-generated method stub
		Wishlist list=new Wishlist();
		list.setPid(dto.getPid());
		list.setUid(dto.getUid());
		
		return repo.save(list);
	}

	@Override
	public List<Wishlist> getAllwishlist() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Wishlist> getAllDataWithSameUserId(long uid) {
		// TODO Auto-generated method stub
		List<Wishlist> userProductList=new ArrayList<>();
		List<Wishlist> mainList=this.getAllwishlist();
		for(Wishlist a: mainList) {
			if(a.getUid()==uid) {
				userProductList.add(a);
			}
		}
		
		
		return userProductList;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public String deleteByUserIdAndProdId(long uid, long pid) {
		// TODO Auto-generated method stub
		List<Wishlist> userProductListToDelete=new ArrayList<>();
		List<Wishlist> mainList=this.getAllwishlist();
		for(Wishlist a: mainList) {
			if(a.getUid()==uid && a.getPid()==pid) {
				userProductListToDelete.add(a);
			}
		}
		repo.deleteInBatch(userProductListToDelete);
		
		
		return "data deleted";
	}

}
