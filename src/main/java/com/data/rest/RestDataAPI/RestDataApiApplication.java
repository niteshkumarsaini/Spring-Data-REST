package com.data.rest.RestDataAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.data.rest.RestDataAPI.Repos.BookRepository;

@SpringBootApplication
public class RestDataApiApplication {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestDataApiApplication.class, args);
	}

	

}
