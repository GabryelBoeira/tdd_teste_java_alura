package br.com.alura.sistemarh.service;

import br.com.alura.sistemarh.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionario com salario maior que R$10.000,00 nao pode receber bonus");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
