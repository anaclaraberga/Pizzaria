package br.com.fag;

import java.util.ArrayList;

public class Pizza {
  private ArrayList<PizzaSabor> sabor = new ArrayList<PizzaSabor>();

  public ArrayList<PizzaSabor> getSabor() {
    return sabor;
  }

  public void setSabor(PizzaSabor sabor) {
    this.sabor.add(sabor);
  }

}
