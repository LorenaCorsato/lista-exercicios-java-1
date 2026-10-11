package exerc09;

import java.util.Scanner;

public class exerc09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        double pressao;

        do {
            System.out.print("Informe a idade: ");
            idade = sc.nextInt();
            if (idade <= 0) System.out.println("Idade inválida! Tente novamente.");
        } while (idade <= 0);

        do {
            System.out.print("Informe a pressão: ");
            pressao = sc.nextDouble();
            if (pressao <= 0) System.out.println("pressão inválida! Tente novamente.");
        } while (pressao <= 0);

        sc.close();

        System.out.println("Idade: " + idade);
        System.out.printf("Pressão: %.2f%n", pressao);

        if( pressao < 120){
            System.out.println("Pressão normal!");
        } else if( pressao >= 120 && pressao <= 129){
            System.out.println("Pressão elevada!");
        } else if( pressao >= 130 && pressao <= 139){
            System.out.println("Hipertensão estágio 1!");
        } else{
            System.out.println("Hipertensão estágio 2!");
        }

    }
}
