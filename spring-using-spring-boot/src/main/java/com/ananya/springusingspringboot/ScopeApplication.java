package com.ananya.springusingspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ananya.springusingspringboot.Scope.PersonDAO;

@SpringBootApplication
public class ScopeApplication {

	private static Logger LOG = LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ScopeApplication.class, args);
		PersonDAO person1 = context.getBean(PersonDAO.class);
		PersonDAO person2 = context.getBean(PersonDAO.class);
		LOG.info("{} -> JDBCConn {}", person1, person1.getJdbcConnection());
		LOG.info("{} -> JDBCConn {}", person2, person2.getJdbcConnection());
	}
}
