package com.sensedia.patterns.behavioral.observer;

public class Notebook implements Observer {
	
	private final Subject subject;

	public Notebook(final Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Notebook " + subject.getState());
	}

}
