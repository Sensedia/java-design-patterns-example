package com.sensedia.patterns.creational.factory_method;

public class ConnectionFactory {
	
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
