package com.example.vicky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class VickyApplication {

	public static void main(String[] args) {
		SpringApplication.run(VickyApplication.class, args);
	}

}
