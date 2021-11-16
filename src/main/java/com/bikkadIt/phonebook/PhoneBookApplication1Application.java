package com.bikkadIt.phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhoneBookApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(PhoneBookApplication1Application.class, args);
	}

	
	/*
	 * spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
	 * spring.datasource.url=jdbc:mysql://localhost/PhoneBookApp
	 * spring.datasource.username=root spring.datasource.password=root
	 * 
	 * spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
	 * spring.jpa.show-sql=true spring.jpa.hibernate.ddl-auto=update
	 */
}
