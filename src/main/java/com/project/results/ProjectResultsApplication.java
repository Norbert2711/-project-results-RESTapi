package com.project.results;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration
public class ProjectResultsApplication{

	public static void main(String[] args) {

		SpringApplication.run(ProjectResultsApplication.class, args);
	}

}
