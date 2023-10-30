package com.javaschool.finaltask;

import com.javaschool.finaltask.Domain.AppUser.AppUser;
import com.javaschool.finaltask.Domain.AppUser.AppUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FinaltaskApplication {
	private static final Logger log = LoggerFactory.getLogger(FinaltaskApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FinaltaskApplication.class);
	}

}


