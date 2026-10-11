package exerc12;

import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura;
        double soma = 0;
        double maior = 0;
        double menor = 0;
        int quantidade = 0;
        int acima180 = 0;
        int abaixo160 = 0;

        while (true) {
            System.out.print("Digite a altura (m) [0 para sair]: ");
            altura = sc.nextDouble();

            if (altura == 0) {
                break;
            }

            if (altura < 0) {
                System.out.println("Altura inválida! Tente novamente.");
                continue;
            }

            if (quantidade == 0) {
                maior = altura;
                menor = altura;
            }

            quantidade++;
            soma += altura;

            if (altura > maior) {
                maior = altura;
            }
            if (altura < menor) {
                menor = altura;
            }
            if (altura > 1.80) {
                acima180++;
            }
            if (altura < 1.60) {
                abaixo160++;
            }
        }

        sc.close();

        System.out.println("Quantidade total: " + quantidade);

        if (quantidade == 0) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            double media = soma / quantidade;

            System.out.printf("Média de altura: %.2f m%n", media);
            System.out.printf("Maior altura: %.2f m%n", maior);
            System.out.printf("Menor altura: %.2f m%n", menor);
            System.out.println("Pessoas acima de 1,80 m: " + acima180);
            System.out.println("Pessoas abaixo de 1,60 m: " + abaixo160);
        }
    }
}