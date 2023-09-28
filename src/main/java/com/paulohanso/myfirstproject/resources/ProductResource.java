package com.paulohanso.myfirstproject.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohanso.myfirstproject.entities.Product;
import com.paulohanso.myfirstproject.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductRepository categoryRepository;
	
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> List = categoryRepository.findAll();
		return ResponseEntity.ok().body(List);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Product>> findById(@PathVariable Long id) {
		Optional<Product> cat = categoryRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
}
