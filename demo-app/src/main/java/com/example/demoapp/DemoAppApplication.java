package com.example.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demospringbootstarter.service.MyService;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

	@Autowired
	private MyService myService;

	@PostConstruct
	public void printMessages() {
		System.out.println("Use service MyService from demo-spring-boot-starter:");
		myService.printHelloMessage();
		myService.printOtherMessage();
	}

}
