package com.lab.websec.backend.api.newpetstuff.repository;

import org.springframework.data.repository.CrudRepository;

import com.lab.websec.backend.api.dto.newpetstuff.NewPetItem;

public interface NewPetItemsRepository extends CrudRepository<NewPetItem, Long> {
	
	
}