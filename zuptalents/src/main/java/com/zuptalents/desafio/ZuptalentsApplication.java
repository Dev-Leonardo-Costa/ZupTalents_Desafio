package com.zuptalents.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zuptalents.desafio.repository.UsuarioRepository;

@SpringBootApplication
public class ZuptalentsApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuariorepository;

	public static void main(String[] args) {
		SpringApplication.run(ZuptalentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
