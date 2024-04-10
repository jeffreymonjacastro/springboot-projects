package com.jamcycoding.jpa;

import com.jamcycoding.jpa.models.Author;
import com.jamcycoding.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// Useful for testing
	// @Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	) {
		return args -> {
			var author = Author.builder()
					.firstName("Romy")
					.lastName("Ames")
					.age(19)
					.email("valeames.a@gmail.com")
					.build();
			repository.save(author);
		};
	}

}
