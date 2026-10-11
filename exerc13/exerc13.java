package exerc13;

import java.util.Scanner;

public class exerc13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        double total = 0;
        double maior = 0;
        double menor = 0;
        int quantidade = 0;
        int acima100 = 0;
        int abaixo20 = 0;

        while (true) {
            System.out.print("Digite o valor do produto (R$) [-1 para sair]: ");
            valor = sc.nextDouble();

            if (valor == -1) {
                break;
            }

            if (valor < 0) {
                System.out.println("Valor inválido! Tente novamente.");
                continue;
            }

            if (quantidade == 0) {
                maior = valor;
                menor = valor;
            }

            quantidade++;
            total += valor;

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
            if (valor > 100) {
                acima100++;
            }
            if (valor < 20) {
                abaixo20++;
            }
        }

        sc.close();

        System.out.println("Quantidade total de produtos vendidos: " + quantidade);
        System.out.printf("Valor total faturado: R$ %.2f%n", total);

        if (quantidade == 0) {
            System.out.println("Nenhum produto vendido.");
        } else {
            double media = total / quantidade;

            System.out.printf("Preço médio: R$ %.2f%n", media);
            System.out.printf("Maior valor: R$ %.2f%n", maior);
            System.out.printf("Menor valor: R$ %.2f%n", menor);
            System.out.println("Produtos acima de R$ 100,00: " + acima100);
            System.out.println("Produtos abaixo de R$ 20,00: " + abaixo20);
        }
    }
}
