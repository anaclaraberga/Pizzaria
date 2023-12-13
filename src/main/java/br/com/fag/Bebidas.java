package br.com.fag;

public enum Bebidas {
    COCA_COLA ("Coca-Cola", 5),
    PEPSI ("Pepsi", 5),
    GUARANA ("Guaraná", 5),
    FANTA_LARANJA ("Fanta Laranja", 5),
    SUCO_LARANJA ("Suco de Laranja", 4),
    AGUA ("Água", 3);

    private String nome;
    private float valor;
    
    Bebidas(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }
}
