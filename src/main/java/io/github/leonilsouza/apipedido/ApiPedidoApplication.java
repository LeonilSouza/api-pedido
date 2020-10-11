package io.github.leonilsouza.apipedido;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiPedidoApplication implements CommandLineRunner {
		
	public static void main(String[] args) {
		SpringApplication.run(ApiPedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
	}

}
