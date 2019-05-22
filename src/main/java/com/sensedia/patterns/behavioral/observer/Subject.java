package com.sensedia.patterns.behavioral.observer;

public interface Subject {
	
	void addObserver(final Observer observer);

	void notifyAllObservers();
	
	String getState();
}
