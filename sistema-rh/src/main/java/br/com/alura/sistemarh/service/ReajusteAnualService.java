package br.com.alura.sistemarh.service;

import br.com.alura.sistemarh.enums.DesempenhoFuncionario;
import br.com.alura.sistemarh.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteAnualService {
    public BigDecimal calcularReajuste(DesempenhoFuncionario desempenho, Funcionario funcionario) {
        BigDecimal reajuste;
        switch (desempenho) {
            case A_DESEJAR:
                reajuste = new BigDecimal("0.03").multiply(funcionario.getSalario());
                break;
            case BOM:
                reajuste = new BigDecimal("0.15").multiply(funcionario.getSalario());
                break;
            case OTIMO:
                reajuste = new BigDecimal("0.2").multiply(funcionario.getSalario());
                break;
            default:
                reajuste = BigDecimal.ZERO;
                break;
        }
        return reajuste.setScale(2, RoundingMode.HALF_UP);
    }
}
