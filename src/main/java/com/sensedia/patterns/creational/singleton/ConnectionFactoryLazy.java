package com.sensedia.patterns.creational.singleton;

import java.util.Objects;

import com.sensedia.patterns.creational.factory_method.Connection;
import com.sensedia.patterns.creational.factory_method.ConnectionType;
import com.sensedia.patterns.creational.factory_method.SocketConnection;
import com.sensedia.patterns.creational.factory_method.SqlConnection;

public class ConnectionFactoryLazy {
	
	private static ConnectionFactoryLazy instance = null;
	
	private ConnectionFactoryLazy() {}
	
	public static ConnectionFactoryLazy getInstance() {
		
		if(Objects.isNull(instance)) {
			instance = new ConnectionFactoryLazy();
		}
		
		return instance;
	}
	
	public Connection get(ConnectionType type) {
		
		Connection connection = null;
		
		switch (type) {
		
			case SQL:
				connection = SqlConnection.with("localhost", 10);
				break;
			case SOCKET:
				connection = new SocketConnection();
				break;
	
			default: throw new IllegalArgumentException();
			
		}
		
		return connection;
	}

}
