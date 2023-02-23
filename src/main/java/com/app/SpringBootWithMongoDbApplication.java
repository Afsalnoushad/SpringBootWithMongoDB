package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.model.Product;
import com.app.repo.ProductRepo;

@SpringBootApplication
public class SpringBootWithMongoDbApplication implements CommandLineRunner {

	@Autowired
	ProductRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// Store all data in MongoDB database
		
		repo.save(new Product("1","Pizza",200));
		repo.save(new Product("2","Burger",100));
		repo.save(new Product("3","Samosa",300));
		repo.save(new Product("4","Banana",400));
		repo.save(new Product("5","Apple",350));
		
		
		// Display all data
		
	    System.out.println("All data is inserted");
		
		
	}

}
