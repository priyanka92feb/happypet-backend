package com.lab.websec.backend.api.dto.newpetstuff;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cart_details")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
public class CartDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1749886094862007683L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;
	
	@Column(name="new_pet_item_id")
	private Integer newPetItemId;
	
	private Integer quantity;
	
	@Column(name="cart_id")
	private BigInteger cartId;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Integer getNewPetItemId() {
		return newPetItemId;
	}

	public void setNewPetItemId(Integer newPetItemId) {
		this.newPetItemId = newPetItemId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigInteger getCartId() {
		return cartId;
	}

	public void setCartId(BigInteger cartId) {
		this.cartId = cartId;
	}
	
}
