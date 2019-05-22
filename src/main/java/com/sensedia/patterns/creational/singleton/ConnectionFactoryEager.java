package com.sensedia.patterns.creational.singleton;

import com.sensedia.patterns.creational.factory_method.Connection;
import com.sensedia.patterns.creational.factory_method.ConnectionType;
import com.sensedia.patterns.creational.factory_method.SocketConnection;
import com.sensedia.patterns.creational.factory_method.SqlConnection;

public class ConnectionFactoryEager {
	
	private static final ConnectionFactoryEager INSTANCE = new ConnectionFactoryEager();
	
	private ConnectionFactoryEager() {}
	
	public static ConnectionFactoryEager getInstance() {
		return INSTANCE;
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
