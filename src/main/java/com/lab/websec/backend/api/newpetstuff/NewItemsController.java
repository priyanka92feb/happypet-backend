package com.lab.websec.backend.api.newpetstuff;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public NewPetItemsDto findAllNewPetItems() {
		List<NewPetItem> allNewPetItems = new ArrayList<NewPetItem>();
		try {
		allNewPetItems = newPetItemsService.findAllNewPetItems();
		} catch(SQLException ex) {
			logger.error("Eception in retreiving all new pet item",ex.getMessage());
		}
		if(allNewPetItems != null) {
			return (new NewPetItemsDto(allNewPetItems));
		}
		return null;
	}

	@PostMapping(value = "/newPetItem", consumes = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity addNewItems(@RequestBody NewPetItemsDto newPetItemsDto) {
		if(newPetItemsDto == null) {
			return ResponseEntity.badRequest().build();
		}
		try {
			newPetItemsService.saveNewPetItems(newPetItemsDto.getAllNewPetItems());
		} catch (SQLException ex) {
			logger.error("Eception in saving the new pet item",ex.getMessage());
		}
		return ResponseEntity.noContent().build();
	}

	
	@DeleteMapping(value = "/newPetItem")
	@PreAuthorize("hasRole('ADMIN')")
	  public ResponseEntity removeNewItems(@Valid@RequestParam String newPetItemId) {
		newPetItemsService.deleteNewPetItem(newPetItemId);
		  return ResponseEntity.noContent().build();
	  }
	  
		/*
		 * public List<PetItems> updateNewItems() {
		 * 
		 * }
		 */
	 

}
