package br.com.alura.sistemarh.enums;

public enum DesempenhoFuncionario {
    A_DESEJAR("A Desejar"),
    BOM("Bom"),
    OTIMO("Otimo");

    private String nome;

    DesempenhoFuncionario(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
