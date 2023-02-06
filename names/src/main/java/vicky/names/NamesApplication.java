package vicky.names;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableAutoConfiguration




@SpringBootApplication
public class NamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamesApplication.class, args);
	}

}
