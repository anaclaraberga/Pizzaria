package br.com.fag;

import java.util.Scanner;

public class Desenvolvimento {
    void desenvolvimento() {
        Scanner scanner = new Scanner(System.in);
        PizzaTamanho pizzatamanho = new PizzaTamanho();
        Pizza pizza = new Pizza();
        int posicaoArray = 0;

        System.out.println("======================================================");
        System.out.println("Seja bem-vindo à Cascavel Pizzaria.");
        System.out.println("======================================================");
        System.out.println(
                "Digite o número de acordo com o tamanho da pizza que deseja: \n[ 1 ] Tamanho P\n[ 2 ] Tamanho M\n[ 3 ] Tamanho G");
        int tamanhoPizza = scanner.nextInt();

        switch (tamanhoPizza ) {
            case 1:
                pizzatamanho.setTamanhoPizza("P");
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

        System.out.println("======================================================");

        switch (tamanhoPizza) {
            case 1:
                System.out.println("Sua pizza é tamanho P. Você tem direito a escolher um sabor.\n Escolha seu sabor:");
                ImprimeLista.imprimir(PizzaSabor.printAll());
                posicaoArray = scanner.nextInt();
                pizza.setSabor(PizzaSabor.values()[posicaoArray]);
                System.out.println(pizza.getSabor());

                break;
            case 2:
                System.out.println("Sua pizza é tamanho M. Você tem direito a escolher dois sabores.\n Escolha seu primeiro sabor:");
                ImprimeLista.imprimir(PizzaSabor.printAll());
                posicaoArray = scanner.nextInt();
                pizza.setSabor(PizzaSabor.values()[posicaoArray]);
                System.out.println(pizza.getSabor());

                System.out.println("======================================================");
                System.out.println("Escolha seu segundo sabor:");
                ImprimeLista.imprimir(PizzaSabor.printAll());
                posicaoArray = scanner.nextInt();
                pizza.setSabor(PizzaSabor.values()[posicaoArray]);
                System.out.println(pizza.getSabor());
                break;
            case 3:
                System.out.println("Sua pizza é tamanho G. Você tem direito a escolher três sabores!\n Escolha seu primeiro sabor: ");
                ImprimeLista.imprimir(PizzaSabor.printAll());
                posicaoArray = scanner.nextInt();
                pizza.setSabor(PizzaSabor.values()[posicaoArray]);
                System.out.println(pizza.getSabor());

                System.out.println("======================================================");
                System.out.println("Escolha seu segundo sabor: ");
                ImprimeLista.imprimir(PizzaSabor.printAll());
                posicaoArray = scanner.nextInt();
                pizza.setSabor(PizzaSabor.values()[posicaoArray]);
                System.out.println(pizza.getSabor());

                System.out.println("======================================================");
                System.out.println("Escolha seu terceiro sabor: ");
                ImprimeLista.imprimir(PizzaSabor.printAll());
                posicaoArray = scanner.nextInt();
                pizza.setSabor(PizzaSabor.values()[posicaoArray]);
                System.out.println(pizza.getSabor());
                break;
        }
    }
}
