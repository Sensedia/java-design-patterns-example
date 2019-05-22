package com.sensedia.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Logistica implements Observer {
	
	private final Observable observable;

	public Logistica(final Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object arg) {
		
		if(observable instanceof Pedido) {
			System.out.println("Logistica " + (Pedido) observable);
		}
		
	}

}
