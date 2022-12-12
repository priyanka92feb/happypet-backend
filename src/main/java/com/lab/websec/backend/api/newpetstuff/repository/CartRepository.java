package com.lab.websec.backend.api.newpetstuff.repository;

import org.springframework.data.repository.CrudRepository;

import com.lab.websec.backend.api.dto.newpetstuff.Cart;

public interface CartRepository extends CrudRepository<Cart, Long> {
	
	
}