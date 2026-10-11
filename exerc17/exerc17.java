package exerc17;

import java.util.Scanner;

public class exerc17 {

    static boolean ehArmstrong(int numero) {
        if (numero < 0) {
            return false;
        }

        int quantidadeDigitos = 0;
        int restante = numero;

        do {
            quantidadeDigitos++;
            restante /= 10;
        } while (restante > 0);

        long soma = 0;
        restante = numero;

        do {
            int digito = restante % 10;
            long potencia = 1;

            for (int expoente = 1; expoente <= quantidadeDigitos; expoente++) {
                potencia *= digito;
            }

            soma += potencia;
            restante /= 10;
        } while (restante > 0);

        return soma == numero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número inteiro: ");
        n = sc.nextInt();

        sc.close();

        if (ehArmstrong(n)) {
            System.out.println(n + " é um número de Armstrong.");
        } else {
            System.out.println(n + " não é um número de Armstrong.");
        }

        System.out.print("Números de Armstrong entre 1 e " + n + ": ");
        boolean encontrou = false;

        for (long numero = 1; numero <= n; numero++) {
            if (ehArmstrong((int) numero)) {
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
