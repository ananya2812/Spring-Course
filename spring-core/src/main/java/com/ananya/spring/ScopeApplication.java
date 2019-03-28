package com.ananya.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ananya.spring.Scope.PersonDAO;

@Configuration
@ComponentScan
public class ScopeApplication {

	private static Logger LOG = LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringBasicApplication.class)) {
			PersonDAO person1 = context.getBean(PersonDAO.class);
			PersonDAO person2 = context.getBean(PersonDAO.class);
			LOG.info("{} -> JDBCConn {}", person1, person1.getJdbcConnection());
			LOG.info("{} -> JDBCConn {}", person2, person2.getJdbcConnection());
		}

	}
}
