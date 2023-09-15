package com.dnb.testDemo;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dnb.testDemo.dto.Application;
import com.dnb.testDemo.exceptions.IdNotFoundException;
import com.dnb.testDemo.service.ApplicationService;

@SpringBootApplication
public class TestDemoApplication {
	@Autowired
	static ApplicationService applicationService;
	public static void main(String[] args) throws IdNotFoundException {
	ApplicationContext applicationContext=SpringApplication.run(TestDemoApplication.class, args);
//		applicationService=applicationContext.getBean(ApplicationService.class);
		//applicationService.createApplication(new Application(LocalDate.now(),194));
		
	}

}
