package com.training.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.training.ecommerce.domain.Product;

@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long>{

}
