package io.github.farrukhjon.experiment;

import io.github.farrukhjon.experiment.service.UserService;
import io.github.farrukhjon.experiment.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
