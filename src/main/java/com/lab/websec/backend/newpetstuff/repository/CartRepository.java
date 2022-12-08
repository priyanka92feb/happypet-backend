package com.lab.websec.backend.newpetstuff.repository;

import org.springframework.data.repository.CrudRepository;

import com.lab.websec.backend.newpetstuff.api.dto.Cart;

public interface CartRepository extends CrudRepository<Cart, Long> {
	
	
}