package com.ananya.springusingspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ananya.springusingspringboot.Properties.ExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	private static Logger LOG = LoggerFactory.getLogger(PropertiesApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				PropertiesApplication.class)) {
			ExternalService service = context.getBean(ExternalService.class);
			LOG.info("{}", service.returnServiceUrl());
		}

	}
}
