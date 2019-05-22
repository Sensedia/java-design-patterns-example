package com.sensedia.patterns.creational.factory_method;

import java.util.Objects;

public class Demo {
	
	public static void main(String[] args) {
		
		//pojo
		SocketConnection socket = new SocketConnection();
		socket.setAddress(null);
		//ou faz validação
		if(Objects.isNull(socket.getAddress())) {
			throw new IllegalStateException();
		}
		//ou toma erro
		socket.execute("blablers");
		
		//static factory method
		Connection sql = SqlConnection.with("localhost", 80);
		sql.execute("blablers");
		
		//factory method
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		Connection socketConnection = connectionFactory.get(ConnectionType.SOCKET);
		socketConnection.execute("aaa");
		
		Connection sqlConnection = connectionFactory.get(ConnectionType.SQL);
		sqlConnection.execute("bbb");
		
	}

}
