package com.lab.websec.backend.newpetstuff.service;

import com.lab.websec.backend.newpetstuff.api.dto.Cart;
import com.lab.websec.backend.newpetstuff.api.dto.CartDto;

public interface CartService {

	public Cart findCartByUserId(String userId);
	
	public void insertCartForUser(CartDto cartDto);
	
	public void clearCartForUser(String userId);
}
