package com.lab.websec.backend.newpetstuff.repository;

import org.springframework.data.repository.CrudRepository;

import com.lab.websec.backend.newpetstuff.api.dto.NewPetItem;

public interface NewPetItemsRepository extends CrudRepository<NewPetItem, Long> {
	
	
}