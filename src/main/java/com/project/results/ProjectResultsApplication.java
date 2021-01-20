package com.project.results;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ProjectResultsApplication{

	public static void main(String[] args) {

		SpringApplication.run(ProjectResultsApplication.class, args);
	}

}
