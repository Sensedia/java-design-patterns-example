package com.sensedia.patterns.structural.adapter;

import java.util.Collection;
import java.util.Collections;

public class JsonAdapter implements CsvFile {
	
	private final JsonFile jsonFile;
	
	public JsonAdapter(final JsonFile jsonFile) {
		this.jsonFile = jsonFile;
	}

	@Override
	public Collection<String> getLines() {
		//Adaptação
		return Collections.singletonList(this.jsonFile.getContent());
	}



}
