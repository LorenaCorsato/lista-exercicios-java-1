package exerc18;

import java.util.Scanner;

public class exerc18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acertos = 0;
        int erros = 0;
        int pontuacao = 0;

        System.out.println("\n=== DESAFIO DE ARITMÉTICA RÁPIDA ===");
        System.out.println("Digite -999 para sair.");

        while (erros < 3) {
            int numero1 = (int) (Math.random() * 20) + 1;
            int numero2 = (int) (Math.random() * 20) + 1;
            int operacao = (int) (Math.random() * 3);
            int resultado;
            char operador;

            switch (operacao) {
                case 0:
                    operador = '+';
                    resultado = numero1 + numero2;
                    break;
                case 1:
                    operador = '-';
                    resultado = numero1 - numero2;
                    break;
                default:
                    operador = '*';
                    resultado = numero1 * numero2;
            }

            System.out.print(numero1 + " " + operador + " " + numero2 + " = ");
            int resposta = sc.nextInt();

            if (resposta == -999) {
                break;
            }

            if (resposta == resultado) {
                acertos++;
                pontuacao += 10;
                System.out.println("Resposta correta! +10 pontos.");
            } else {
                erros++;
                System.out.println("Resposta incorreta! Resultado: " + resultado);
            }
        }

        sc.close();

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Total de acertos: " + acertos);
        System.out.println("Total de erros: " + erros);
        System.out.println("Pontuação final: " + pontuacao);
    }
}
