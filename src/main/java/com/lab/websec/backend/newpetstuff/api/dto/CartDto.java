package com.lab.websec.backend.newpetstuff.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6386735960031153147L;
	/**
	 * 
	 */
	private String userId;
	private List<CartDetails> cartDetails;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<CartDetails> getCartDetails() {
		return cartDetails;
	}
	public void setCartDetails(List<CartDetails> cartDetails) {
		this.cartDetails = cartDetails;
	}
	
}
