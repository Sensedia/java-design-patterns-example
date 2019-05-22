package com.sensedia.patterns.creational.factory_method;

public class SocketConnection implements Connection {
	
	private String address;
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public void execute(String command) {
		System.out.println(address.concat(command));
	}

}
