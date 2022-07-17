package br.com.alura.sistemarh.service;

import br.com.alura.sistemarh.enums.DesempenhoFuncionario;
import br.com.alura.sistemarh.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteAnualService {

    public BigDecimal calcularReajuste(DesempenhoFuncionario desempenho, Funcionario funcionario) {
        return desempenho.getValorReajuste().multiply(funcionario.getSalario())
                .setScale(2, RoundingMode.HALF_UP);
    }

}
