package com.lab.websec.backend.newpetstuff.service;

import java.sql.SQLException;
import java.util.List;

import com.lab.websec.backend.newpetstuff.api.dto.NewPetItem;

public interface PetItemsService {

	public List<NewPetItem> findAllNewPetItems()  throws SQLException;
	
	public void saveNewPetItems(List<NewPetItem> newPetItem)  throws SQLException;
}
