package com.sensedia.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartidaFutebol {
	
	private DisplayGol displayGol;
	private DisplayCartao displayCartao;
	private List<String> gols = new ArrayList<>();
	private Map<String, String> cartoes = new HashMap<>();

	public PartidaFutebol(DisplayGol displayGol, DisplayCartao displayCartao) {
		this.displayGol = displayGol;
		this.displayCartao = displayCartao;
	}
	
	public void gol(String jogador) {
		gols.add(jogador);
		change();
	}
	
	public void cartao(String jogador, String cor) {
		cartoes.put(jogador, cor);
		change();
	}
	
	public void change() {
		displayCartao.update(cartoes);
		displayGol.update(gols);
	}

}
