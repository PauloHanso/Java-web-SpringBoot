package com.paulohanso.myfirstproject.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohanso.myfirstproject.entities.Category;
import com.paulohanso.myfirstproject.repositories.CategoryRepository;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> List = categoryRepository.findAll();
		return ResponseEntity.ok().body(List);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Category>> findById(@PathVariable Long id) {
		Optional<Category> cat = categoryRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
}
