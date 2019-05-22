package com.sensedia.patterns.behavioral.strategy;

import br.com.caelum.stella.validation.CPFValidator;

public class PessoaFisica implements Pessoa {
	
	private final String documento;
	
	private PessoaFisica(final String documento) {
		this.documento = documento;
	}
	
	public static Pessoa with(final String documento) {
		return new PessoaFisica(documento);
	}

	@Override
	public void validar() {
		try {
			new CPFValidator().assertValid(this.documento);
		} catch (Exception e) {
			throw new IllegalArgumentException("CPF inválido", e);
		}
	}

}
