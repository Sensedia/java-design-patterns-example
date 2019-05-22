package com.sensedia.patterns.structural.adapter;

import java.util.Collection;
import java.util.stream.Stream;

public class Demo {
	
	private static void process(CsvFile ... csvFiles) {
		
		Stream
			.of(csvFiles)
			.map(CsvFile::getLines)
			.flatMap(Collection::stream)
			.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		
		//BEFORE
		
		CsvFile boletoCsv = new BoletoCsv();
		JsonFile boletoJson = new BoletoJson();
		
		//interfaces diferentes
		//process(boletoCsv, boletoJson);
		
		//AFTER
		
		JsonAdapter jsonAdapter = new JsonAdapter(boletoJson);
		
		process(boletoCsv, jsonAdapter);
		
	}

}
