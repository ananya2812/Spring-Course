package com.ananya.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ananya.spring.CDI.CdiBusiness;

@Configuration
@ComponentScan
public class CdiApplication {

	private static Logger LOG = LoggerFactory.getLogger(CdiApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringBasicApplication.class)) {
			CdiBusiness business = context.getBean(CdiBusiness.class);
			LOG.info("{} -> DAO {}", business, business.getCdiDao());
		}
	}
}
