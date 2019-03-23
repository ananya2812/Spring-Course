package com.ananya.springusingspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ananya.springusingspringboot.Basic.BinarySearchImpl;

@SpringBootApplication
public class SpringBootBasicApplication {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootBasicApplication.class);

	public static void main(String[] args) {
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new
		// QuickSortAlgorithm());

		ApplicationContext context = SpringApplication.run(SpringBootBasicApplication.class, args);
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] { 1, 2, 3 }, 3);
		LOG.info("{}", result);
	}
}
