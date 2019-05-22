package com.sensedia.patterns.structural.decorator;

public abstract class CarroDecorator implements Carro {

	protected Carro carro;

	public CarroDecorator(Carro carro) {
		this.carro = carro;
	}

	@Override
	public String getModelo() {
		return carro.getModelo();
	}

	@Override
	public Double getValor() {
		return carro.getValor();
	}

}
