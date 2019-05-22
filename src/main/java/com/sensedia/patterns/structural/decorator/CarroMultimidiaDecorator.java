package com.sensedia.patterns.structural.decorator;

public class CarroMultimidiaDecorator extends CarroDecorator {

	public CarroMultimidiaDecorator(Carro carro) {
		super(carro);
	}
	
	@Override
	public String getModelo() {
		return super.getModelo().concat(" com multimidia");
	}
	
	@Override
	public Double getValor() {
		return super.getValor() + 3000D;
	}
	

}
