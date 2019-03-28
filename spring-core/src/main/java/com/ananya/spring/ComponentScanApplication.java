package com.ananya.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ananya.ComponentScan.ComponentDAO;

@Configuration
@ComponentScan("com.ananya.ComponentScan")
public class ComponentScanApplication {

	private static Logger LOG = LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringBasicApplication.class)) {
			ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
			LOG.info("{} -> JDBCConn {}", componentDAO, componentDAO.getComponentJDBCConnection());
		}
	}
}
