package br.com.fag;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum PizzaSabor {
  CALABRESA("Calabresa", 10),
  ROMANESCA("Romanesca", 10),
  PORTUGUESA("Portuguesa",10),
  FRANGO_COM_CATUPIRY("Frango com catupiry",10),
  LOMBO_COM_CATUPIRY("Lombo com catupiry",10),
  CHOCOLATE_PRETO("Chocolate preto",12),
  CHOCOLATE_BRANCO("Chocolate branco",12),
  SENSACAO("Sensação",12),
  SEDUCAO("Sedução",12),
  BANOFFE("Banoffe",12);

  PizzaSabor(String name, float preco) {
    precoSabor = preco;
    nomeSabor = name;
  }

  private final float precoSabor;
  private final String nomeSabor;

  public float getPreco() {
    return precoSabor;
  }

  public String getNome() {
    return nomeSabor;
  }

  public static String[] printAll() {
    PizzaSabor[] sabores = PizzaSabor.values();
    String[] arr = new String[sabores.length];
    int i;
    for(i = 0; i < sabores.length; i++) {
      arr[i] = sabores[i].getNome();
    }

    return arr;
  }

  public static String getAll() {
    return Stream.of(PizzaSabor.values()).
                map(PizzaSabor::getNome).
                collect(Collectors.joining("\n - "));
  }
}
