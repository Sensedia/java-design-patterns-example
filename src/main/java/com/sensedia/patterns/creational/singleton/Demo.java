package com.sensedia.patterns.creational.singleton;

import com.sensedia.patterns.creational.factory_method.ConnectionType;

public class Demo {
	
	public static void main(String[] args) {
		
		ConnectionFactoryEager.getInstance().get(ConnectionType.SOCKET);
		
		ConnectionFactoryLazy.getInstance().get(ConnectionType.SQL);
		
	}

}
