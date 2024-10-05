package com.gst.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NgPaymentApplication {

	public static void main(String[] args) {
		System.out.println("Application Before Started");
		SpringApplication.run(NgPaymentApplication.class, args);
		System.out.println("Application Started");
	}

}
