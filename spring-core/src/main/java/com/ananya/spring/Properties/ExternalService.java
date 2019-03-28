package com.ananya.spring.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalService {

	@Value("${external.service.url}")
	private String url;

	public String returnServiceUrl() {
		return url;
	}
}
