package br.com.fag;

public class ImprimeLista {
  public static void imprimir(String[] arr) {
    int i;
    for(i = 0; i < arr.length; i++) {
      System.out.println("[ "+ i +" ] - " + arr[i]);
    }
  }
}
