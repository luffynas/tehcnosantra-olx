package com.olxsample.technosantraolx;

import com.olxsample.technosantraolx.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechnosantraOlxApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnosantraOlxApplication.class, args);

//		UserService service = new UserService();
//		System.out.println("Hello "+service.findAll());
	}

}

