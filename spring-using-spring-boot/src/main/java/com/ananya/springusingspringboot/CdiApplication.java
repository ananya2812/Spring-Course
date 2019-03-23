package com.ananya.springusingspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ananya.springusingspringboot.CDI.CdiBusiness;

@SpringBootApplication
public class CdiApplication {

	private static Logger LOG = LoggerFactory.getLogger(CdiApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CdiApplication.class, args);
		CdiBusiness business = context.getBean(CdiBusiness.class);
		LOG.info("{} -> DAO {}", business, business.getCdiDao());
	}
}
