package br.com.fag;

public enum TipoBebidas {
    COCA_COLA ("Coca-Cola", 5),
    PEPSI ("Pepsi", 5),
    GUARANA ("Guaraná", 5),
    FANTA_LARANJA ("Fanta Laranja", 5),
    SUCO_LARANJA ("Suco de Laranja", 4),
    AGUA ("Água", 3);

    private String nome;
    private float valor;

    TipoBebidas(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public static String[] printAll() {
        TipoBebidas[] nomes = TipoBebidas.values();
        String[] arr = new String[nomes.length];
        int i;
        for(i = 0; i < nomes.length; i++) {
          arr[i] = nomes[i].getNome();
        }
    
        return arr;
      }
}