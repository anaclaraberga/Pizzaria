package br.com.fag;

import java.util.Scanner;

public class Desenvolvimento {
    void desenvolvimento() {
        Scanner scanner = new Scanner(System.in);
        PizzaTamanho pizzatamanho = new PizzaTamanho();
        Pizza pizza = new Pizza();
        Bebidas bebidas = new Bebidas();
        int posicaoArray = 0;
        int posicaoArrayBebida = 0;

        System.out.println("======================================================");
        System.out.println("Seja bem-vindo à Cascavel Pizzaria.");
        System.out.println("======================================================");
        System.out.println(
                "Digite o número de acordo com o tamanho da pizza que deseja: \n[ 1 ] Tamanho P\n[ 2 ] Tamanho M\n[ 3 ] Tamanho G");
        int tamanhoPizza = scanner.nextInt();

        switch (tamanhoPizza) {
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

        System.out.println("======================================================");

        System.out.println("Deseja bebida? \n[ 1 ] Sim\n[ 2 ] Não");
        int bebida = scanner.nextInt();

        if (bebida == 1) {
            System.out.println("======================================================");
            System.out.println("Escolha sua bebida");
            ImprimeLista.imprimir(TipoBebidas.printAll());

            posicaoArray = scanner.nextInt();
            bebidas.setNome(TipoBebidas.values()[posicaoArray]);
            System.out.println(bebidas.getNome());
        }

        pizza.setSabor(PizzaSabor.values()[posicaoArray]);
        pizza.setPreco(PizzaSabor.values()[posicaoArrayBebida]);

        System.out.println("======================================================");
        System.out.println("Dados do pedido");
        System.out.println("Total do pedido:");
        System.out.println("R$ ");
        System.out.println("======================================================");
        
        System.out.println("Qual será a forma de pagamento? \n[ 1 ] Crédito\n[ 2 ] Débito\n[3] Pix\\n" + //
                "[4] Dinheiro");
        int finalizar = scanner.nextInt();

        switch (finalizar) {
            case 1:
                System.out.println("======================================================");
                System.out.println("Informe os dados bancários:");
                break;
            case 2:
                System.out.println("======================================================");
                System.out.println("Informe os dados bancários:");
                break;
            case 3:
                System.out.println("======================================================");
                System.out.println("Pix da Pizzaria: 45991873409");
                break;
            case 4:
                System.out.println("======================================================");
                System.out.println("Realize o pagamento no caixa.");
                break;
        }
        
    }
}
