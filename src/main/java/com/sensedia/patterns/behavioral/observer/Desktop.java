package com.sensedia.patterns.behavioral.observer;

public class Desktop implements Observer {
	
	private final Subject subject;

	public Desktop(final Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Desktop " + subject.getState());
	}

}
