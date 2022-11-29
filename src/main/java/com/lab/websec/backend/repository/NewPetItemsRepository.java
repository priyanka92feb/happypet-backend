package com.lab.websec.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.lab.websec.backend.newpetstuff.api.dto.NewPetItems;

public interface NewPetItemsRepository extends CrudRepository<NewPetItems, Long> {
	
	/*
	 * @Query(value =
	 * "select \"ID\", \"QUANTITY\", \"CATEGORY\", \"ITEM_NAME\" from \"NEW_PET_ITEMS\""
	 * ) public List<NewPetItems> findAllNewPetItems();
	 */
	
}