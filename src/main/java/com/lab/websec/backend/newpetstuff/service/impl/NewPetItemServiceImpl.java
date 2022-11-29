package com.lab.websec.backend.newpetstuff.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lab.websec.backend.newpetstuff.api.dto.NewPetItems;
import com.lab.websec.backend.newpetstuff.service.PetItemsService;
import com.lab.websec.backend.repository.NewPetItemsRepository;

@Component
public class NewPetItemServiceImpl implements PetItemsService{

	@Autowired
	NewPetItemsRepository newPetItemsRepository;
	
	public List<NewPetItems> findAllNewPetItems() {
		return (List<NewPetItems>) newPetItemsRepository.findAll();
	}
}
