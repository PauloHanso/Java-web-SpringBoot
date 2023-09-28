package com.paulohanso.myfirstproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.paulohanso.myfirstproject.entities.Category;
import com.paulohanso.myfirstproject.entities.Product;
import com.paulohanso.myfirstproject.repositories.CategoryRepository;
import com.paulohanso.myfirstproject.repositories.ProductRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category("Electronics");
		Category cat2 = new Category("Books");

		Product p1 = new Product("TV", 2200.00, cat1);
		Product p2 = new Product("DarkSouls", 120.00, cat2);
		Product p3 = new Product("PS5", 2800.00, cat1);
		Product p4 = new Product("O menino do pijama listrado", 100.00, cat2);
		Product p5 = new Product("Diario de um banana", 27.00,cat2);
		Product p6 = new Product("Microondas Consul 2.0", 499.97, cat1);
		Product p7 = new Product("Nazismos, como ele pode acontecer", 21.00, cat2);
		
		

		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		productRepository.save(p5);
		productRepository.save(p6);
		productRepository.save(p7);
		
		
		
	}
}
