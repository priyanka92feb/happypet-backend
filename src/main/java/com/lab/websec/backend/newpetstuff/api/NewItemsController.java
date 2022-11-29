package com.lab.websec.backend.newpetstuff.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.websec.backend.newpetstuff.api.dto.NewPetItems;
import com.lab.websec.backend.newpetstuff.service.PetItemsService;


@RestController
@RequestMapping("/happypet")
public class NewItemsController {
	/**
	 * 1. Show all items catalog 2. Add new items 3. Update QTY 4. Remove items
	 */

	@Autowired
	private PetItemsService newPetItemsService;
	
	@GetMapping("/petItems")
	public List<NewPetItems> findAllNewPetItems() {
		return newPetItemsService.findAllNewPetItems();
	}

	/*
	 * public List<PetItems> addNewItems() {
	 * 
	 * }
	 * 
	 * public List<PetItems> removeNewItems() {
	 * 
	 * }
	 * 
	 * public List<PetItems> updateNewItems() {
	 * 
	 * }
	 */
}
