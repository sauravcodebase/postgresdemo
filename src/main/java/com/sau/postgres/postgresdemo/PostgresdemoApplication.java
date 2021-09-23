package com.sau.postgres.postgresdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.sau.postgres","com.sau.postgres.service",})
@EntityScan("com.sau.postgres.model")
@EnableJpaRepositories("com.sau.postgres.repository")

public class PostgresdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresdemoApplication.class, args);
	}

}
