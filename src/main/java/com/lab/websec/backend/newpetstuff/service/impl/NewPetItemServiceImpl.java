package com.lab.websec.backend.newpetstuff.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lab.websec.backend.newpetstuff.api.dto.NewPetItem;
import com.lab.websec.backend.newpetstuff.repository.NewPetItemsRepository;
import com.lab.websec.backend.newpetstuff.service.PetItemsService;

@Component
public class NewPetItemServiceImpl implements PetItemsService{

	@Autowired
	NewPetItemsRepository newPetItemsRepository;
	
	public List<NewPetItem> findAllNewPetItems() throws SQLException {
		return (List<NewPetItem>) newPetItemsRepository.findAll();
	}
	
	public void saveNewPetItems(List<NewPetItem> newPetItemList) throws SQLException{
		for(NewPetItem newPetItem : newPetItemList) {
			newPetItemsRepository.save(newPetItem);
		}
		
	}
}
