package com.ananya.ComponentScan;

import org.springframework.stereotype.Component;

@Component
public class ComponentJDBCConnection {

	public ComponentJDBCConnection() {
		System.out.println("Component JDBC Connection");
	}
}
