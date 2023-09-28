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
	public void run(String... args) {
		Category cat1 = new Category("Electronics");
		Category cat2 = new Category("Books");

		Product p1 = new Product("TV", 2200.00, cat1);
		Product p2 = new Product("DarkSouls", 120.00, cat2);
		Product p3 = new Product("PS5", 2800.00, cat1);
		Product p4 = new Product("O MENINO DO PIJAMA LISTRADO", 100.00, cat2);
		Product p5 = new Product("DIÁRIO DE UM BANANA", 27.00,cat2);
		Product p6 = new Product("MICROONDAS CONSUL 2.0", 499.97, cat1);
		Product p7 = new Product("NAZISMOS, COMO ELE PODE ACONTECER", 21.00, cat2);
		Product p8 = new Product("MONITOR GAMER AOC SPEED 23,8", 689.90, cat1);
		Product p9 = new Product("O ANTICRISTO, DE NIETZSCHE", 14.99, cat2);
		Product p10 = new Product("APPLE IPHONE 13(128 GB) - ROSA", 4.299, cat1);
		Product p11 = new Product("QCY FONE DE OUVIDO SEM FIO", 109.65, cat1);
		Product p12 = new Product("SMARTPHONE FREEYOND 8GB + 50MP ULTRA ANGULAR", 827.08, cat1);
		Product p13 = new Product("TICWTATCH PRO 5 SMARTWATCH", 1549.00, cat1);
		Product p14 = new Product("PC GAMER Ryzen 5 4600G, 1TB, Fonte 500W", 2099.90, cat1);
		Product p15 = new Product("O PROFESSOR ARROGANTE", 2.70, cat2);
		Product p16 = new Product("DOMINADA PELO REIO DO CARTEL", 3.99, cat2);
		Product p17 = new Product("UMA ESPOSA AZARADA E GRÁVIDA PARA O CEO", 1.99, cat2);
		Product p18 = new Product("ALÉM DO BEM E DO MAL", 25.65, cat2);
		Product p19 = new Product("A GENEALIDADE DA MORAL", 5.60, cat2);

		
		

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
		productRepository.save(p8);
		productRepository.save(p9);
		productRepository.save(p10);
		productRepository.save(p11);
		productRepository.save(p12);
		productRepository.save(p13);
		productRepository.save(p14);
		productRepository.save(p15);
		productRepository.save(p16);
		productRepository.save(p17);
		productRepository.save(p18);
		productRepository.save(p19);


		
	}
}
