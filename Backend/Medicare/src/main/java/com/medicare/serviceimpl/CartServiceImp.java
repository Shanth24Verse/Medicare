package com.medicare.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.model.Cart;
import com.medicare.repository.CartRepository;
import com.medicare.service.CartService;

@Service
public class CartServiceImp implements CartService{
	
	@Autowired
	private CartRepository repo;
	
	@Override
	public Cart addToCart(Cart cart) {
		// TODO Auto-generated method stub
		return repo.save(cart);
	}

	@Override
	public List<Cart> getAllByUserCart(long id) {
		// TODO Auto-generated method stub
		return repo.findAllByUserId(id);
	}

	@Override
	public void deleteCart(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void updateCart(Cart cart, long cid) {
		// TODO Auto-generated method stub
		Cart updated=repo.findById(cid).get();
		updated=cart;
		repo.save(updated);
	}

}
