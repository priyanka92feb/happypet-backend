package com.lab.websec.backend.api.newpetstuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.websec.backend.api.dto.newpetstuff.Cart;
import com.lab.websec.backend.api.dto.newpetstuff.CartDto;
import com.lab.websec.backend.api.newpetstuff.service.CartService;

@RestController
@RequestMapping("/happypet")
public class CartController {
	
	/**
	 * Add items to cart
	 * maintain cart
	 * Confirm cart
	 */

	@Autowired
	private CartService cartService;
	
	@GetMapping(value = "/carts/users/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cart> findCartbyUserId(@PathVariable String userId) {
		Cart cart = cartService.findCartByUserId(userId);
		return new ResponseEntity<Cart>(cart, HttpStatus.OK);
	}

	@PostMapping(value = "/carts/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity insertCartForUser(@RequestBody CartDto cartDto) {
		cartService.insertCartForUser(cartDto);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@DeleteMapping("/carts/users/{userId}")
	public ResponseEntity<?> clearCartForUser(@PathVariable String userId) {
		cartService.clearCartForUser(userId);
		return new ResponseEntity(HttpStatus.OK);
	}
	
}
