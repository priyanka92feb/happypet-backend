package com.lab.websec.backend.api.newpetstuff.service;

import com.lab.websec.backend.api.dto.newpetstuff.Cart;
import com.lab.websec.backend.api.dto.newpetstuff.CartDto;

public interface CartService {

	public Cart findCartByUserId(String userId);
	
	public void insertCartForUser(CartDto cartDto);
	
	public void clearCartForUser(String userId);
}
