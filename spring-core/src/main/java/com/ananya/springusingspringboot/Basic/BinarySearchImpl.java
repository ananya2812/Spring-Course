package com.ananya.springusingspringboot.Basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	private static Logger LOG = LoggerFactory.getLogger(BinarySearchImpl.class);

	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

	/*
	 * Injection By Name
	 */
	// @Autowired
	// private SortAlgorithm sortAlgorithm;

	/*
	 * Constructor Injection
	 */
	// public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
	// this.sortAlgorithm = sortAlgorithm;
	// }

	@PreDestroy
	public void destroy() {
		LOG.info("Before Destroy");
	}

	public int binarySearch(int[] numbers, int numberToSearch) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		return sortedNumbers[0];
	}

	@PostConstruct
	public void postConstruct() {
		LOG.info("Post Construct");
	}

}
