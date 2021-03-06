package com.barclays.rest.works.config;

import com.barclays.rest.works.entity.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.barclays.rest.works.entity.Employee;
import com.barclays.rest.works.repo.EmployeeRepository;


// if the class is annotated with configuration then
// this class will be the first class to be loaded
@Configuration
@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
public class MongoConfig  {

	@Bean
	public CommandLineRunner commandLineRunner(EmployeeRepository repo) {
		return string -> {
//			repo.insert(new Employee(101, "Harshitha", 2233, new Account(101, 444)));
//			repo.insert(new Employee(102, "Apoorv", 1123));
		};

//	 	return null;
	}
}
