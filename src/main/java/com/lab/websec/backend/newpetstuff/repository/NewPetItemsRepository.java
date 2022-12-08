package com.lab.websec.backend.newpetstuff.repository;

import org.springframework.data.repository.CrudRepository;

import com.lab.websec.backend.newpetstuff.api.dto.NewPetItems;

public interface NewPetItemsRepository extends CrudRepository<NewPetItems, Long> {
	
	
}