package com.sensedia.patterns.behavioral.strategy;

import br.com.caelum.stella.validation.CNPJValidator;

public class PessoaJuridica implements Pessoa {
	
	private final String documento;
	
	private PessoaJuridica(final String documento) {
		this.documento = documento;
	}
	
	public static Pessoa with(final String documento) {
		return new PessoaJuridica(documento);
	}
	
	@Override
	public void validar() {
		try {
			new CNPJValidator().assertValid(this.documento);
		} catch (Exception e) {
			throw new IllegalArgumentException("CNPJ inválido", e);
		}
	}

}
