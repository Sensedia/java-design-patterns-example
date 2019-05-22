package com.sensedia.patterns.behavioral.strategy;

public class Demo {
	
	public static void main(String[] args) {
		
		//BEFORE
		
		PessoaValidador.validar("FISICA", "46534469030");
		
		PessoaValidador.validar("JURIDICA", "80069103000147");
		
		///AFTER
		
		PessoaValidador.validar(PessoaJuridica.with("80069103000147"));
		
		PessoaValidador.validar(PessoaFisica.with("1111"));
		
	}

}
