package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

// A classe é de configuração SPRING
// A config só ativa quando test é ativado
@Configuration
@Profile("test")
// significa que a classe tem metodo RUN e EXECUTA quando app for inicializada
public class TestConfig implements CommandLineRunner {
	// Injecao de dependencia automatica do SPRING
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
	
	
}
