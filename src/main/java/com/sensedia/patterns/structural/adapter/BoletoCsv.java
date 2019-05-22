package com.sensedia.patterns.structural.adapter;

import java.util.Collection;
import java.util.Collections;

public class BoletoCsv implements CsvFile {
	
	@Override
	public Collection<String> getLines() {
		return Collections.singletonList("ABC");
	}
}
