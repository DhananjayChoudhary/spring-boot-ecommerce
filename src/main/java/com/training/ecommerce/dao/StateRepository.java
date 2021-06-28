package com.training.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.ecommerce.domain.State;

@CrossOrigin
public interface StateRepository extends JpaRepository<State, Integer> {
	
	Page<State> findByCountryCode(@RequestParam("code")String code, Pageable pageable);
}
