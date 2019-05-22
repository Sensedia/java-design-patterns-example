package com.sensedia.patterns.structural.decorator;

public class Demo {
	
	public static void main(String[] args) {
		CarroMultimidiaDecorator carroMultimidia = new CarroMultimidiaDecorator(new CarroSimples());
		System.out.println(carroMultimidia.getModelo());
		System.out.println(carroMultimidia.getValor());
		
	}

}
