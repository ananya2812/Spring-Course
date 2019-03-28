package com.ananya.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ananya.spring.xml.XmlPersonDAO;

public class XmlApplication {

	private static Logger LOG = LoggerFactory.getLogger(SpringBasicApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			XmlPersonDAO xmlPersonDAO = context.getBean(XmlPersonDAO.class);
			LOG.info("{} --- {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());
			LOG.info("Beans Loaded -> {} ", (Object) context.getBeanDefinitionNames());
			// Output without Component Scan : Beans Loaded -> [xmlJdbcConnection,
			// xmlPersonDAO]
		}

	}
}
