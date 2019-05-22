package com.sensedia.patterns.structural.flyweight;

public class Linux implements OperatingSystem {

	@Override
	public OperatingSystemType getType() {
		return OperatingSystemType.LINUX;
	}

	@Override
	public String getKernel() {
		return "Linux";
	}

}
