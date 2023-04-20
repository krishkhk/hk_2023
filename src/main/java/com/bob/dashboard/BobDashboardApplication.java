package com.bob.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.bob.dashboard.controller"})
public class BobDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BobDashboardApplication.class, args);
	}

}
