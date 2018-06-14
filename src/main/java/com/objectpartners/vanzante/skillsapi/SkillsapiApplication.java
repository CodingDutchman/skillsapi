package com.objectpartners.vanzante.skillsapi;

import com.objectpartners.vanzante.skillsapi.repository.SkillsRepository;
import com.objectpartners.vanzante.skillsapi.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SkillsapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillsapiApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UsersRepository usersRepository,
						   SkillsRepository skillsRepository) {

	}
}
