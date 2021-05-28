package com.training.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.ecommerce.domain.Product;

@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long>{

	 Page<Product> findByProductCategoryId(@RequestParam("id") Long id, Pageable pageable);
	
}
