package com.sensedia.patterns.behavioral.observer;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Internet implements Subject {
	
	private Set<Observer> observers;
	
	private boolean power;

	@Override
	public void addObserver(Observer observer) {
		if(Objects.isNull(observers)) {
			this.observers = new HashSet<>();
		}
		this.observers.add(observer);
	}

	@Override
	public void notifyAllObservers() {
		for (final Observer observer : observers) {
			observer.update();
		}
	}
	
	public void on() {
		this.power = true;
		this.notifyAllObservers();
	}
	
	public void off() {
		this.power = false;
		this.notifyAllObservers();
	}
	
	public boolean isPower() {
		return power;
	}

	@Override
	public String getState() {
		return this.toString();
	}

	@Override
	public String toString() {
		return "Internet [power=" + power + "]";
	}

}
