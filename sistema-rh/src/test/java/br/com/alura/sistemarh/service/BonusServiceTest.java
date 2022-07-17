package br.com.alura.sistemarh.service;

import br.com.alura.sistemarh.modelo.Funcionario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @Test
    @DisplayName(value = "Teste para salario maior que 10000: Nao teve ter bonus aplicado")
    void testeComSucessoBonus1() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Teste 1", LocalDate.now(), new BigDecimal("15000")));

        assertEquals(new BigDecimal("0.00"), bonus, "Nao poderia receber o bonus");
    }

    @Test
    @DisplayName(value = "Teste para salario menor que 10000: bonus de 10% sobre o valor do salario deve ser aplicado")
    void testeComSucessoBonus2() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Teste 2", LocalDate.now(), new BigDecimal("2500")));
        assertEquals(new BigDecimal("250.00"), bonus, "Bonus de 10% nao aplicado");
    }

    @Test
    @DisplayName(value = "Teste para salario igual que 10000: Teve ter bonus aplicado para ate 1000 reais")
    void testeComSucessoBonus3() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Teste", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.00"), bonus, "Nao poderia receber o bonus para salario igual a 10000");
    }

}
