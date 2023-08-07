package br.com.fag;

public enum PizzaSabor {
  CALABRESA(10),
  ROMANESCA(10),
  PORTUGUESA(10),
  FRANGO_COM_CATUPIRY(10),
  LOMBO_COM_CATUPIRY(10),
  CHOCOLATE_PRETO(12),
  CHOCOLATE_BRANCO(12),
  SENSACAO(12),
  SEDUCAO(12),
  BANOFFE(12);

  private final float precoSabor;

  PizzaSabor(float preco) {
    precoSabor = preco;
  }

  public float getPreco() {
    return precoSabor;
  }
}
