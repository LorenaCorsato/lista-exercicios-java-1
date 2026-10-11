package exerc19;

import java.util.Scanner;

public class exerc19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dificuldade;
        int maxTentativas = 0;
        int tentativas = 0;
        int codigo = (int) (Math.random() * 9000) + 1000;
        boolean aberto = false;

        do {
            System.out.println("\n=== JOGO DO COFRE SECRETO ===");
            System.out.println("1 - Fácil (12 tentativas)");
            System.out.println("2 - Médio (8 tentativas)");
            System.out.println("3 - Difícil (5 tentativas)");
            System.out.print("Escolha a dificuldade: ");
            dificuldade = sc.nextInt();

            switch (dificuldade) {
                case 1:
                    maxTentativas = 12;
                    break;
                case 2:
                    maxTentativas = 8;
                    break;
                case 3:
                    maxTentativas = 5;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (dificuldade < 1 || dificuldade > 3);

        while (tentativas < maxTentativas && !aberto) {
            System.out.print("Digite um código de 4 dígitos (1000 a 9999): ");
            int palpite = sc.nextInt();

            if (palpite < 1000 || palpite > 9999) {
                System.out.println("Código inválido! Tente novamente.");
                continue;
            }

            tentativas++;

            if (palpite == codigo) {
                aberto = true;
            } else if (palpite < codigo) {
                System.out.println("O código secreto é MAIOR.");
            } else {
                System.out.println("O código secreto é MENOR.");
            }
        }

        sc.close();

        if (aberto) {
            System.out.println("Cofre aberto!");
        } else {
            System.out.println("Cofre bloqueado!");
        }

        System.out.println("Tentativas utilizadas: " + tentativas);
        System.out.println("Código correto: " + codigo);
    }
}
