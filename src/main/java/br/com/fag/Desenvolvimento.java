package br.com.fag;

import java.util.Scanner;

public class Desenvolvimento {
    void desenvolvimento() {
        Scanner scanner = new Scanner(System.in);
        PizzaTamanho pizzatamanho = new PizzaTamanho();

        System.out.println("======================================================");
        System.out.println("Seja bem-vindo à Piratas Pizzaria.");
        System.out.println("======================================================");
        System.out.println(
                "Digite o número de acordo com o tamanho da pizza que deseja: \n1. Tamanho P\n2. Tamanho M\n3. Tamanho G");
        int tamanhoPizza = scanner.nextInt();

        switch (tamanhoPizza ) {
            case 1:
                pizzatamanho.setTamanhoPizza("Pequeno");
                System.out.println(pizzatamanho.getTamanhoPizza());
                break;
            case 2:
                pizzatamanho.setTamanhoPizza("M");
                System.out.println(pizzatamanho.getTamanhoPizza());
                break;
            case 3:
                pizzatamanho.setTamanhoPizza("G");
                System.out.println(pizzatamanho.getTamanhoPizza());
                break;
        }
    }
}
