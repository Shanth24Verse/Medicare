package com.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.model.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

}
