package com.ananya.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ananya.spring.Basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringBasicApplication {

	private static Logger LOG = LoggerFactory.getLogger(SpringBasicApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringBasicApplication.class)) {
			BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
			int result = binarySearch.binarySearch(new int[] { 5, 2, 3 }, 3);
			LOG.info("{}", result);
		}

	}
}
