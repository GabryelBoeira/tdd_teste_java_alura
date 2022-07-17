package br.com.alura.sistemarh.service;

import br.com.alura.sistemarh.enums.DesempenhoFuncionario;
import br.com.alura.sistemarh.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteAnualTest {

    private ReajusteAnualService reajusteService;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar() {
        this.reajusteService = new ReajusteAnualService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("2500"));
    }

    @Test
    @DisplayName("Desempenho foi `A desejar`: Reajuste aplicavel sera de 3% em relacao ao salario")
    void reajusteAnualDesempenhoADesejar() {
        BigDecimal valorReajuste = reajusteService.calcularReajuste(DesempenhoFuncionario.A_DESEJAR, funcionario);

        assertEquals(new BigDecimal("75.00"), valorReajuste);
    }

    @Test
    @DisplayName("Desempenho foi `Bom`: Reajuste aplicavel sera de 15% em relacao ao salario")
    void reajusteAnualDesempenhoBom() {
        BigDecimal valorReajuste = reajusteService.calcularReajuste(DesempenhoFuncionario.BOM, funcionario);

        assertEquals(new BigDecimal("375.00"), valorReajuste);
    }

    @Test
    @DisplayName("Desempenho foi `Otimo`: Reajuste aplicavel sera de 20% em relacao ao salario")
    void reajusteAnualDesempenhoOtimo() {
        BigDecimal valorReajuste = reajusteService.calcularReajuste(DesempenhoFuncionario.OTIMO, funcionario);

        assertEquals(new BigDecimal("500.00"), valorReajuste);
    }

}
