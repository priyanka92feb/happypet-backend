package com.lab.websec.backend.newpetstuff.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;
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
import lombok.NoArgsConstructor;

@Entity
@Table(name="\"NEW_PET_ITEMS\"")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewPetItem implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="\"ID\"")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	BigInteger id;
	
	@Column(name="\"ITEM_NAME\"")
	String itemName;
	
	@Column(name="\"QUANTITY\"")
	Integer quantity;
	
	@Column(name="\"DESCRIPTION\"")
	String description;
	
	@Column(name="\"PRICE\"")
	BigDecimal price;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
