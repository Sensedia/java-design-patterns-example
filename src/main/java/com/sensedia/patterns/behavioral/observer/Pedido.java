package com.sensedia.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Observable;
import java.util.Random;

public class Pedido extends Observable {
	
	private static final Random RANDOM = new Random();
	
	private Long numero;
	
	private Collection<String> itens;
	
	public Pedido() {
		this.numero = RANDOM.nextLong();
	}
	
	public Long getNumero() {
		return numero;
	}
	
	public Collection<String> getItens() {
		if(Objects.isNull(itens)) {
			itens = new ArrayList<>();
		}
		return itens;
	}
	
	public void confirma() {
		System.out.println("Total de observers: " + super.countObservers());
		super.setChanged();
		super.notifyObservers();
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", itens=" + itens + "]";
	}
	
}
