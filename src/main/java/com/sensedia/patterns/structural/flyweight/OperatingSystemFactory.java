package com.sensedia.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OperatingSystemFactory {
	
	private OperatingSystemFactory() {}
	
	private static final Map<OperatingSystemType, OperatingSystem> TYPES = new HashMap<>();
	
	public static OperatingSystem get(final OperatingSystemType type) {
		
		OperatingSystem operatingSystem = TYPES.get(type);

		if(Objects.isNull(operatingSystem)) {
			
			switch (type) {
			case WINDOWS:
				operatingSystem = new Windows();
				break;
			case LINUX:
				operatingSystem = new Linux();
				break;
			case MACOS:
				operatingSystem = new MacOS();
				break;

			default:
				throw new IllegalArgumentException();
			}
			
			TYPES.put(type, operatingSystem);
		}
		
		return operatingSystem;
	}

}
