package com.sensedia.patterns.creational.builder;

import java.time.Month;
import java.time.YearMonth;

public class Demo {
	
	public static void main(String[] args) {
		
		//construtor
		
		new Motorcycle("Indian", "101 Scout");
		
		new Motorcycle("Indian", "101 Scout", true);
		
		new Motorcycle("Indian", "101 Scout", 1.1, YearMonth.of(1931, Month.MAY), false, false, "ok", "good", "nice");
		
		//pojo
		
		Motorcycle moto1 = new Motorcycle();
		moto1.setMake("Indian");
		moto1.setModel("101 Scout");
		moto1.setAutomatic(false);
		moto1.setUtility(false);
		moto1.setReviews("bad idea", "buy much glue", "argh");
		
		//builder
		
		new Car.Builder()
			.make("Hyundai")
			.model("Genesis")
			.automatic(true)
			.utility(false)
			.reviews("ok", "great stuff", "4tw")
			.build();
		
	}
	
}
