package com.library.bookmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BookManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookManageApplication.class, args);
	}
}
