package com.lab.websec.backend.api.newpetstuff.repository;

import org.springframework.data.repository.CrudRepository;

import com.lab.websec.backend.api.dto.newpetstuff.CartDetails;

public interface CartDetailsRepository extends CrudRepository<CartDetails, Long> {
	
	
}