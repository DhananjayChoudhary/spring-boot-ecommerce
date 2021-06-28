package com.training.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.training.ecommerce.domain.Country;

@CrossOrigin
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
