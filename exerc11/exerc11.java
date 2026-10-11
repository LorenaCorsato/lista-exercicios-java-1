package exerc11;

import java.util.Scanner;

public class exerc11 {

    static void consultar(double saldo) { 
        System.out.printf("Saldo: R$ %.2f%n", saldo); 
    }

    static double depositar(double saldo, double valor) {
        if (valor <= 0) { 
            System.out.println("Depósito inválido."); 
            return saldo; 
        }

        System.out.println("Depósito realizado.");
        return saldo + valor;
    }

    static double sacar(double saldo, double valor) {
        if (valor <= 0) { 
            System.out.println("Saque inválido.");
            return saldo; 
        }

        if (valor > saldo) { 
            System.out.println("Saldo insuficiente."); 
            return saldo; 
        }

        System.out.println("Saque realizado.");
        return saldo - valor;
    }

    static void simularPoupanca(double saldo) {
        System.out.printf("Rendimento em 1 mês: R$ %.2f%nSaldo projetado: R$ %.2f%n", saldo * 0.005, saldo * 1.005);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int opcao;
        do {
            System.out.println("\n=== SISTEMA BANCÁRIO ===");
            System.out.println("1 - Consultar Saldo\n2 - Realizar Depósito\n3 - Realizar Saque");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Simular Rendimento da Poupança (1 mês - 0.5%)");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: 
                    consultar(saldo); break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    saldo = depositar(saldo, sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    saldo = sacar(saldo, sc.nextDouble());
                    break;
                case 4: 
                    simularPoupanca(saldo); break;
                case 0: 
                    System.out.println("Encerrando..."); break;
                default: 
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        sc.close();
    }
}
