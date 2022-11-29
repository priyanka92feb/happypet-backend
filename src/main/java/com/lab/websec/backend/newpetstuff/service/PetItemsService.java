package com.lab.websec.backend.newpetstuff.service;

import java.util.List;

import com.lab.websec.backend.newpetstuff.api.dto.NewPetItems;

public interface PetItemsService {

	public List<NewPetItems> findAllNewPetItems();
}
