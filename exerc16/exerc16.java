package exerc16;

import java.util.Scanner;

public class exerc16 {

    static boolean ehPerfeito(int numero) {
        if (numero <= 1) {
            return false;
        }

        long soma = 1;

        // Os divisores aparecem em pares: divisor e numero / divisor.
        for (int divisor = 2; divisor <= numero / divisor; divisor++) {
            if (numero % divisor == 0) {
                soma += divisor;
                int outroDivisor = numero / divisor;

                if (outroDivisor != divisor) {
                    soma += outroDivisor;
                }
            }
        }

        return soma == numero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        sc.close();

        if (ehPerfeito(n)) {
            System.out.println(n + " é perfeito.");
        } else {
            System.out.println(n + " não é perfeito.");
        }

        System.out.print("Números perfeitos entre 1 e " + n + ": ");
        boolean encontrou = false;

        for (long numero = 1; numero <= n; numero++) {
            if (ehPerfeito((int) numero)) {
                if (encontrou) {
                    System.out.print(", ");
                }
                System.out.print(numero);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.print("nenhum");
        }
        System.out.println();
    }
}
