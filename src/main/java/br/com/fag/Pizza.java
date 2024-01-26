package br.com.fag;

import java.util.ArrayList;

public class Pizza {
  private ArrayList<PizzaSabor> sabor = new ArrayList<PizzaSabor>();
  private ArrayList<PizzaSabor> preco = new ArrayList<PizzaSabor>();

  public ArrayList<PizzaSabor> getSabor() {
    return sabor;
  }

  public ArrayList<PizzaSabor> getPreco() {
    return preco;
  }

  public void setSabor(PizzaSabor sabor) {
    this.sabor.add(sabor);
  }

  public void setPreco(PizzaSabor preco) {
    this.preco.add(preco);
  }

}
