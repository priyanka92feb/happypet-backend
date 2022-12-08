package com.lab.websec.backend.newpetstuff.api.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Data
public class NewPetItemsResponse {
	
	List<NewPetItems> allNewPetItems;
	
	public NewPetItemsResponse(List<NewPetItems> allNewPetItems) {
		this.allNewPetItems = allNewPetItems;
	}
}
