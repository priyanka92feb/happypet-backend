package com.lab.websec.backend.newpetstuff.repository;

import org.springframework.data.repository.CrudRepository;

import com.lab.websec.backend.newpetstuff.api.dto.CartDetails;

public interface CartDetailsRepository extends CrudRepository<CartDetails, Long> {
	
	
}