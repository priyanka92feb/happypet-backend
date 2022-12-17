package com.lab.websec.backend.api.newpetstuff.service;

import java.sql.SQLException;
import java.util.List;

import com.lab.websec.backend.api.dto.newpetstuff.NewPetItem;

public interface PetItemsService {

	public List<NewPetItem> findAllNewPetItems()  throws SQLException;
	
	public void saveNewPetItems(List<NewPetItem> newPetItem)  throws SQLException;

	public void deleteNewPetItem(String newPetItemId);
}
