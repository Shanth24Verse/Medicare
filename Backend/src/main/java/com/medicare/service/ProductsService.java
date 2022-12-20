package com.medicare.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.medicare.dto.ProductsDTO;
import com.medicare.model.Products;

public interface ProductsService {
	
	public String addProducts(ProductsDTO productDto);
	
	public List<Products> getAllProducts();
	
	public String updateProducts(ProductsDTO productDto);
	
	public String deleteProducts(long id);
	
	public Products getProductById(long id);
	
	public void saveMultiple(MultipartFile file);
	
	public List<Products> getSortedProduct();
}
