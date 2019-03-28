package com.ananya.ComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {

	@Autowired
	private ComponentJDBCConnection componentJDBCConnection;

	public ComponentJDBCConnection getComponentJDBCConnection() {
		return componentJDBCConnection;
	}

	public void setComponentJDBCConnection(ComponentJDBCConnection componentJDBCConnection) {
		this.componentJDBCConnection = componentJDBCConnection;
	}

}
