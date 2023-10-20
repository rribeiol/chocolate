package br.com.telefonica.chocolate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class ChocolateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChocolateApplication.class, args);
	}

}
