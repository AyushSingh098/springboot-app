package com.springboot.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@SpringBootApplication
@EnableCouchbaseRepositories
@ComponentScan({ "com.springboot.demoapp.*" })
public class DemoappApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoappApplication.class, args);
	}
}