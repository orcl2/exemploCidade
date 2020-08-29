package br.com.ftec.exemploCidade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExemploCidadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploCidadeApplication.class, args);
	}

}
