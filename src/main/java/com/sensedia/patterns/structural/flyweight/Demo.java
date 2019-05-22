package com.sensedia.patterns.structural.flyweight;

import java.time.Instant;

public class Demo {
	
	public static void main(String[] args) {
		
		long noFlyweightStart = Instant.now().toEpochMilli();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("NOK: " + new Windows());
		}
		
		System.out.println(Instant.now().minusMillis(noFlyweightStart).toEpochMilli());
		
		
		long flyweightStart = Instant.now().toEpochMilli();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("OK: "+ OperatingSystemFactory.get(OperatingSystemType.WINDOWS));
		}
		
		System.out.println(Instant.now().minusMillis(flyweightStart).toEpochMilli());
	}

}
