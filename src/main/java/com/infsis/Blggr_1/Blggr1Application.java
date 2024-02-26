package com.infsis.Blggr_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Blggr1Application {

	public static void main(String[] args) {
		SpringApplication.run(Blggr1Application.class, args);
	}

}
