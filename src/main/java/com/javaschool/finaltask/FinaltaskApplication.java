package com.javaschool.finaltask;

import com.javaschool.finaltask.Entity.AppUser;
import com.javaschool.finaltask.Repository.AppUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinaltaskApplication {
	private static final Logger log = LoggerFactory.getLogger(FinaltaskApplication.class);
	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(FinaltaskApplication.class);
	}

	@Bean
	public CommandLineRunner demo(AppUserRepository repository) {
		return args -> {
			//Save a few users
			repository.save(new AppUser("asdf@asdf.com", "1234", "USER"));
			repository.save(new AppUser("qwer@asdf.com", "1234", "USER"));
			repository.save(new AppUser("zxcv@asdf.com", "1234", "USER"));
			repository.save(new AppUser("admin@asdf.com", "1234", "ADMIN"));

			//Fetch all users
			log.info("Users found with findAll()");
			log.info("--------------------------");
			for (AppUser user : repository.findAll()){
				log.info(user.toString());
			}
			log.info("");
			//Fetch an individual user by ID
			AppUser user=repository.findByEmail("asdf@asdf.com");
			log.info("Users found with findByID()");
			log.info("--------------------------");
			log.info(user.toString());
			log.info("");

			//fetch users by role
			log.info("Customer found with findByRole('USER'):");
			log.info("--------------------------------------------");
			for (AppUser user1 : repository.findByRole("USER")) {
				log.info(user1.toString());
				}
			log.info("");
		};
	}
}


