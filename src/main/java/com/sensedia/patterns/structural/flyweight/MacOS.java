package com.sensedia.patterns.structural.flyweight;

public class MacOS implements OperatingSystem {

	@Override
	public OperatingSystemType getType() {
		return OperatingSystemType.MACOS;
	}

	@Override
	public String getKernel() {
		return "XNU";
	}

}
