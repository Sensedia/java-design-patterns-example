package com.sensedia.patterns.structural.adapter;

public class BoletoJson implements JsonFile {

	@Override
	public String getContent() {
		return "[]";
	}

}
