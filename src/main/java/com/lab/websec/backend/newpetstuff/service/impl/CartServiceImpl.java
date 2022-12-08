package com.lab.websec.backend.newpetstuff.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.websec.backend.newpetstuff.api.dto.Cart;
import com.lab.websec.backend.newpetstuff.api.dto.CartDetails;
import com.lab.websec.backend.newpetstuff.api.dto.CartDto;
import com.lab.websec.backend.newpetstuff.repository.CartDetailsRepository;
import com.lab.websec.backend.newpetstuff.repository.CartRepository;
import com.lab.websec.backend.newpetstuff.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	CartDetailsRepository cartDetailsRepository;
	
	public Cart findCartByUserId(String userId) {
		return cartRepository.findById(Long.valueOf(userId)).get();
	}

	public void insertCartForUser(CartDto cartDto) {
		Cart cart = new Cart(Integer.valueOf(cartDto.getUserId()), new Date(), cartDto.getCartDetails());
		cartRepository.save(cart);
		for(CartDetails cartDetails : cart.getCartDetails()) {
			cartDetails.setCartId(cart.getId());
			cartDetailsRepository.save(cartDetails);
		}
	}

	public void clearCartForUser(String userId) {
		Cart cart = cartRepository.findById(Long.valueOf(userId)).get();
		cartRepository.delete(cart);
	}

}
