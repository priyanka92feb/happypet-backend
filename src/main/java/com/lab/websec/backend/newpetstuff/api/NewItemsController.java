package com.lab.websec.backend.newpetstuff.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.websec.backend.newpetstuff.api.dto.NewPetItems;
import com.lab.websec.backend.newpetstuff.api.dto.NewPetItemsResponse;
import com.lab.websec.backend.newpetstuff.service.PetItemsService;


@RestController
@RequestMapping("/happypet")
public class NewItemsController {
	/**
	 * 1. Show all items catalog 2. Add new items 3. Update QTY 4. Remove items
	 */

	@Autowired
	private PetItemsService newPetItemsService;
	
	@GetMapping("/newPetItems")
	@CrossOrigin(origins = "http://localhost:9092")
	public ResponseEntity<?> findAllNewPetItems() {
		List<NewPetItems> allNewPetItems = newPetItemsService.findAllNewPetItems();
		System.out.println(allNewPetItems.get(0).toString());
		return new ResponseEntity<>(new NewPetItemsResponse(allNewPetItems), HttpStatus.OK);
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
