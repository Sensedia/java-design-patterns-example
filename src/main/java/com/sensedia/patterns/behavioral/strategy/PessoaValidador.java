package com.sensedia.patterns.behavioral.strategy;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;

public class PessoaValidador {
	
	private PessoaValidador() {}
	
	private static void validaCNPJ(final String documento) {
		new CNPJValidator().assertValid(documento);
	}

	private static void validaCPF(final String documento) {
		new CPFValidator().assertValid(documento);
	}
	
	public static void validar(final String tipo, final String documento) {
		
		if("FISICA".equalsIgnoreCase(tipo)) {
			validaCPF(documento);
		} else if ("JURIDICA".equalsIgnoreCase(tipo)) {
			validaCNPJ(documento);
		} else {
			throw new IllegalArgumentException("Tipo de pessoa não existe");
		}
		
	}
	
	//////////////////////////////////////////////////////////
	
	public static void validar(final Pessoa pessoa) {
		pessoa.validar();
	}
	
}
