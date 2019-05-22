package com.sensedia.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Financeiro implements Observer {
	
	private final Observable observable;

	public Financeiro(final Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update(Observable observable, Object arg) {
		if(observable instanceof Pedido) {
			System.out.println("Financeiro " + (Pedido) observable);
		}
	}

}
