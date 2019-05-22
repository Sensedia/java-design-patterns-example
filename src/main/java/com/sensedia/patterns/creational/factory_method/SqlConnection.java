package com.sensedia.patterns.creational.factory_method;

import java.util.Objects;

public class SqlConnection implements Connection {
	
	private final String host;
	private final int port;
	
	private SqlConnection(String host, int port) {
		this.host = host;
		this.port = port;
	}
	
	public static SqlConnection with(String host, int port) {
		
		if(Objects.isNull(host)) {
			throw new IllegalArgumentException("URL cannot be null");
		}
		
		return new SqlConnection(host, port);
	}
	
	@Override
	public void execute(String command) {
		System.out.println("Host: ".concat(this.host));
		System.out.println("Port: " + this.port);
	}

}
