package com.lab.websec.backend.newpetstuff.api.dto;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="\"NEW_PET_ITEMS\"", schema="dev")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewPetItems implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="\"ID\"")
	BigInteger id;
	
	@Column(name="\"ITEM_NAME\"")
	String itemName;
	
	@Column(name="\"QUANTITY\"")
	Integer quantity;
	
}
