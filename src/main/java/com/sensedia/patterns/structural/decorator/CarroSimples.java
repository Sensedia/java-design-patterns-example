package com.sensedia.patterns.structural.decorator;

public class CarroSimples implements Carro {

	@Override
	public String getModelo() {
		return "Kia Opirus";
	}

	@Override
	public Double getValor() {
		return 40000D;
	}

}
