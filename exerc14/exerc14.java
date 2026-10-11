package exerc14;

import java.math.BigInteger;
import java.util.Scanner;

public class exerc14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite um número inteiro positivo: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Número inválido! Tente novamente.");
            }
        } while (n <= 0);

        sc.close();

        System.out.println("\n=== POTÊNCIAS ===");

        // BigInteger evita estouro nas potências maiores.
        BigInteger potencia = BigInteger.ONE;
        BigInteger base = BigInteger.valueOf(n);

        for (int expoente = 1; expoente <= 10; expoente++) {
            potencia = potencia.multiply(base);
            System.out.println(n + "^" + expoente + " = " + potencia);
        }

        System.out.println("\n=== TABELA DE MULTIPLICAÇÃO ===");

        for (long linha = 1; linha <= n; linha++) {
            for (long coluna = 1; coluna <= n; coluna++) {
                System.out.printf("%12d", linha * coluna);
            }
            System.out.println();
        }
    }
}
