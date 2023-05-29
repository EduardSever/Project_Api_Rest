package com.shops.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shops.store.entity.Clothing;
import com.shops.store.services.ClothingService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.POST, RequestMethod.PUT })
public class ClothingController {
	@Autowired
	private ClothingService cloSer;

	@PostMapping("/CreateClothing")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> CreateClothing(@RequestBody Clothing clothing) {
		return ResponseEntity.ok(cloSer.save(clothing));
	}

	@GetMapping("/getALLClothing")
	public ResponseEntity<?> findAllClothing() {
		return ResponseEntity.ok(cloSer.fidAll());
	}

	@PutMapping("/updateClothing")
	public ResponseEntity<?> updateClothing(@RequestBody Clothing clothing) {
		return ResponseEntity.ok(cloSer.update(clothing));
	}

	@PostMapping("/findByIdClothing")
	public ResponseEntity<?> findByIdClothing(@RequestBody Clothing clothing) {
		return ResponseEntity.ok(cloSer.findById(clothing));
	}

	@DeleteMapping("/eliminarClothing")
	public void eliminarClothing(@RequestBody Clothing clothing) {
		cloSer.delete(clothing);
	}
}