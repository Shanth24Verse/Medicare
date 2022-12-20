package com.medicare.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDTO {
	
	private long id;
	private String name;
	private double price;
	private String url;
	private String catagory;
	private int quantity;

}
