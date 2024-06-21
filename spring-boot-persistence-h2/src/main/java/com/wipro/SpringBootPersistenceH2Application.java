package com.wipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.dao.CountryRepository;
import com.wipro.model.Country;

@SpringBootApplication
public class SpringBootPersistenceH2Application implements CommandLineRunner{

	@Autowired
	private CountryRepository countryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPersistenceH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		countryRepository.save(new Country(null,"India"));
		countryRepository.save(new Country(null,"America"));
		countryRepository.save(new Country(null,"Japan"));
		
	}

}
