package com.sensedia.patterns.structural.flyweight;

public class Windows implements OperatingSystem {

	@Override
	public OperatingSystemType getType() {
		return OperatingSystemType.WINDOWS;
	}

	@Override
	public String getKernel() {
		return "Windows NT";
	}

}
