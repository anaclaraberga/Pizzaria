package br.com.fag;

import java.util.ArrayList;

public class Bebidas {
private ArrayList<TipoBebidas> nome = new ArrayList<TipoBebidas>();

public ArrayList<TipoBebidas> getNome() {
    return nome;
}

public void setNome(TipoBebidas nome) {
    this.nome.add(nome);
}

}
