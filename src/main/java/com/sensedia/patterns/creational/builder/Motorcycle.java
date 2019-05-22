package com.sensedia.patterns.creational.builder;

import java.time.YearMonth;
import java.util.Arrays;

public class Motorcycle {
	
	private String make;
	private String model;
	private double value;
	private YearMonth fabrication;
	private boolean automatic;
	private boolean utility;
	private String[] reviews;
	
	public Motorcycle() {}
	
	public Motorcycle(String make, String model) {
		this(make, model, 0, null, false, false);
	}
	
	public Motorcycle(String make, String model, double value) {
		this(make, model, value, null, false, false);
	}
	
	public Motorcycle(String make, String model, boolean automatic) {
		this(make, model, 0, null, automatic, false);
	}
	
	public Motorcycle(String make, String model, double value, YearMonth fabrication, boolean automatic, boolean utility, String ... reviews) {
		this.make = make;
		this.model = model;
		this.value = value;
		this.fabrication = fabrication;
		this.automatic = automatic;
		this.utility = utility;
		this.reviews = reviews;
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public YearMonth getFabrication() {
		return fabrication;
	}
	public void setFabrication(YearMonth fabrication) {
		this.fabrication = fabrication;
	}
	public boolean isAutomatic() {
		return automatic;
	}
	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	public boolean isUtility() {
		return utility;
	}
	public void setUtility(boolean utility) {
		this.utility = utility;
	}
	public String[] getReviews() {
		return reviews;
	}
	public void setReviews(String ... reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Motorcycle [make=" + make + ", model=" + model + ", value=" + value + ", fabrication=" + fabrication
				+ ", automatic=" + automatic + ", utility=" + utility + ", reviews=" + Arrays.toString(reviews) + "]";
	}

}
