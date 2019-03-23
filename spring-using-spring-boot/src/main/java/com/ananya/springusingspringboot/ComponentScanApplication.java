package com.ananya.springusingspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ananya.ComponentScan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.ananya.ComponentScan")
public class ComponentScanApplication {

	private static Logger LOG = LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ComponentScanApplication.class, args);
		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
		LOG.info("{} -> JDBCConn {}", componentDAO, componentDAO.getComponentJDBCConnection());
	}
}
