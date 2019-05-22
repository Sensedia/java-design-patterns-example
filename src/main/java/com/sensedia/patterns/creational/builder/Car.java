package com.sensedia.patterns.creational.builder;

import java.time.YearMonth;

public class Car {
	
	private String make;
	private String model;
	private double value;
	private YearMonth fabrication;
	private boolean automatic;
	private boolean utility;
	private String[] reviews;
	
	private Car(Builder builder) {
		this.make = builder.make;
		this.model = builder.model;
		this.value = builder.value;
		this.fabrication = builder.fabrication;
		this.automatic = builder.automatic;
		this.utility = builder.utility;
		this.reviews = builder.reviews;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}
	
	public double getValue() {
		return value;
	}
	
	public YearMonth getFabrication() {
		return fabrication;
	}
	
	public boolean isAutomatic() {
		return automatic;
	}
	
	public boolean isUtility() {
		return utility;
	}
	
	public String[] getReviews() {
		return reviews;
	}
	
	public static class Builder {
		
		private String make;
		private String model;
		private double value;
		private YearMonth fabrication;
		private boolean automatic;
		private boolean utility;
		private String[] reviews;

		public Builder make(String make) {
			this.make = make;
			return this;
		}
		
		public Builder model(String model) {
			this.model = model;
			return this;
		}

		public Builder value(double value) {
			this.value = value;
			return this;
		}
		
		public Builder fabrication(YearMonth fabrication) {
			this.fabrication = fabrication;
			return this;
		}
		
		public Builder automatic(boolean automatic) {
			this.automatic = automatic;
			return this;
		}
		
		public Builder utility(boolean utility) {
			this.utility = utility;
			return this;
		}
		
		public Builder reviews(String ... reviews) {
			this.reviews = reviews;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
		
	}

}
