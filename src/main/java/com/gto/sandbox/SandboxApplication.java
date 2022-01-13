package com.gto.sandbox;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SandboxApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sandbox");
		System.out.println("Port : 9000");
		System.out.println("Serveur lancé !");
	}

}
