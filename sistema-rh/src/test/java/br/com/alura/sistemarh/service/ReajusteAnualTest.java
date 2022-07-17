package br.com.alura.sistemarh.service;

import br.com.alura.sistemarh.enums.DesempenhoFuncionario;
import br.com.alura.sistemarh.modelo.Funcionario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteAnualTest {

    @Test
    @DisplayName("Desempenho foi `A desejar`: Reajuste aplicavel sera de 3% em relacao ao salario")
    void reajusteAnualDesempenhoADesejar() {
        ReajusteAnualService reajusteService = new ReajusteAnualService();
        BigDecimal valorReajuste = reajusteService.calcularReajuste(DesempenhoFuncionario.A_DESEJAR, new Funcionario("Teste 1", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("75.00"), valorReajuste);
    }

    @Test
    @DisplayName("Desempenho foi `Bom`: Reajuste aplicavel sera de 15% em relacao ao salario")
    void reajusteAnualDesempenhoBom() {
        ReajusteAnualService reajusteService = new ReajusteAnualService();
        BigDecimal valorReajuste = reajusteService.calcularReajuste(DesempenhoFuncionario.BOM, new Funcionario("Teste 2", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("375.00"), valorReajuste);
    }

    @Test
    @DisplayName("Desempenho foi `Otimo`: Reajuste aplicavel sera de 20% em relacao ao salario")
    void reajusteAnualDesempenhoOtimo() {
        ReajusteAnualService reajusteService = new ReajusteAnualService();
        BigDecimal valorReajuste = reajusteService.calcularReajuste(DesempenhoFuncionario.OTIMO, new Funcionario("Teste 3", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("500.00"), valorReajuste);
    }

}
