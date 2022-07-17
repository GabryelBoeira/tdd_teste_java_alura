package br.com.alura.sistemarh.enums;

import java.math.BigDecimal;

public enum DesempenhoFuncionario {
    A_DESEJAR("A Desejar", new BigDecimal("0.03")),
    BOM("Bom", new BigDecimal("0.15")),
    OTIMO("Otimo", new BigDecimal("0.2"));

    private String nome;
    private BigDecimal valorReajuste;

    DesempenhoFuncionario(String nome, BigDecimal valorReajuste) {
        this.nome = nome;
        this.valorReajuste = valorReajuste;
    }

    public String getNome(){
        return this.nome;
    }

    public BigDecimal getValorReajuste(){
        return this.valorReajuste;
    }
}
