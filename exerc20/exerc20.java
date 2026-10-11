package exerc20;

import java.util.Scanner;

public class exerc20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] frequencia = new int[13];

        do {
            System.out.print("Digite a quantidade de lançamentos: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Quantidade inválida! Tente novamente.");
            }
        } while (n <= 0);

        sc.close();

        for (int lancamento = 0; lancamento < n; lancamento++) {
            int dado1 = (int) (Math.random() * 6) + 1;
            int dado2 = (int) (Math.random() * 6) + 1;
            int soma = dado1 + dado2;

            frequencia[soma]++;
        }

        System.out.println("\n=== RESULTADO DA SIMULAÇÃO ===");
        System.out.printf("%6s%14s%14s%n", "Soma", "Ocorrências", "Porcentagem");

        for (int soma = 2; soma <= 12; soma++) {
            double porcentagem = frequencia[soma] * 100.0 / n;

            System.out.printf("%6d%14d%13.2f%%%n", soma, frequencia[soma], porcentagem);
        }
    }
}
