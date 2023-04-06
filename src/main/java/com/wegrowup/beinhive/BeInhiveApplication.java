package com.wegrowup.beinhive;

import com.wegrowup.beinhive.entities.OffreEmploi;
import com.wegrowup.beinhive.servive.OffreService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class BeInhiveApplication implements CommandLineRunner {

	private OffreService offreService;

	public BeInhiveApplication(OffreService offreService) {
		this.offreService = offreService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BeInhiveApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		offreService.save(new OffreEmploi( "Ingénieur java", LocalDate.now()));
	}
}
