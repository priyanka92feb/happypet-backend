package com.lab.websec.backend.newpetstuff.api.dto;

import java.util.List;

public class NewPetItemsDto {
	
	List<NewPetItem> allNewPetItems;
	
	public NewPetItemsDto() {
		
	}
	
	public NewPetItemsDto(List<NewPetItem> allNewPetItems) {
		this.allNewPetItems = allNewPetItems;
	}

	public List<NewPetItem> getAllNewPetItems() {
		return allNewPetItems;
	}

	public void setAllNewPetItems(List<NewPetItem> allNewPetItems) {
		this.allNewPetItems = allNewPetItems;
	}
}
