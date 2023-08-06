import java.util.Scanner;

public class Desenvolvimento {
    void desenvolvimento() {
        Scanner scanner = new Scanner(System.in);
        PizzaTamanho pizzatamanho = new PizzaTamanho();

        System.out.println("======================================================");
        System.out.println("Seja bem-vindo à Piratas Pizzaria.");
        System.out.println("======================================================");
        System.out.println(
                "Digite o número de acordo com o tamanho da pizza que deseja: \n1. Tamanho P (40,00 reais)\n2. Tamanho M (50,00 reais)\n3. Tamanho G (60,00 reais)");
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
    }
}
