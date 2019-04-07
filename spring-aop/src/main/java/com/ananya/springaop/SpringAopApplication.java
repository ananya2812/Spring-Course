package com.ananya.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ananya.springaop.business.Business1;
import com.ananya.springaop.business.Business2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringAopApplication.class);

	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}

}