package com.training.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.ecommerce.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
