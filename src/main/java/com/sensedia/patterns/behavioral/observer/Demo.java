package com.sensedia.patterns.behavioral.observer;

public class Demo {
	
	public static void main(String[] args) {
		
		//PROBLEMA 
		
		DisplayGol displayGol = new DisplayGol();
		DisplayCartao displayCartao = new DisplayCartao();
		
		PartidaFutebol partidaFutebol = new PartidaFutebol(displayGol, displayCartao);
		
		partidaFutebol.gol("Sterling");
		partidaFutebol.cartao("De Bruyne", "A");
		
		
		// IMPLEMENTAÇÃO
		
		Internet internet = new Internet();
		
		new Notebook(internet);
		new Desktop(internet);
		
		internet.on();
		
		internet.off();
		
		// API DO JAVA
		
		Pedido pedido = new Pedido();
		
		new Financeiro(pedido);
		new Estoque(pedido);
		new Logistica(pedido);
		
		pedido.getItens().add("Teste");
		pedido.confirma();
		
	}

}
