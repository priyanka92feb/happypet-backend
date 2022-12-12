package com.lab.websec.backend.api.newpetstuff;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.websec.backend.api.dto.newpetstuff.NewPetItem;
import com.lab.websec.backend.api.dto.newpetstuff.NewPetItemsDto;
import com.lab.websec.backend.api.newpetstuff.service.PetItemsService;

@RestController
@RequestMapping("/happypet")
public class NewItemsController {
	/**
	 * 1. Show all items catalog 2. Add new items 3. Update QTY 4. Remove items
	 */
	private static final Logger logger = LoggerFactory.getLogger(NewItemsController.class);


	
	@Autowired
	private PetItemsService newPetItemsService;

	@GetMapping(value = "/newPetItems", produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins = "http://localhost:9092")
	public NewPetItemsDto findAllNewPetItems() {
		List<NewPetItem> allNewPetItems = new ArrayList<NewPetItem>();
		try {
		allNewPetItems = newPetItemsService.findAllNewPetItems();
		} catch(SQLException ex) {
			logger.error("Eception in retreiving all new pet item",ex.getMessage());
		}
		return (new NewPetItemsDto(allNewPetItems));
	}

	@PostMapping(value = "/newPetItem", consumes = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public ResponseEntity addNewItems(@RequestBody NewPetItemsDto newPetItemsDto) {
		try {
			newPetItemsService.saveNewPetItems(newPetItemsDto.getAllNewPetItems());
		} catch (SQLException ex) {
			logger.error("Eception in saving the new pet item",ex.getMessage());
		}
		return ResponseEntity.noContent().build();
	}

	/*
	 * public List<PetItems> removeNewItems() {
	 * 
	 * }
	 * 
	 * public List<PetItems> updateNewItems() {
	 * 
	 * }
	 */

}
