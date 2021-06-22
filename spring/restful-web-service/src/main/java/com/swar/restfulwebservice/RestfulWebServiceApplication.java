package com.swar.restfulwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestfulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServiceApplication.class, args);
	}

}
