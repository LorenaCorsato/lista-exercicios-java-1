package exerc07;

import java.util.Scanner;

public class exerc07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;


        System.out.println("Digite 3 números: ");

        System.out.print("1 - ");
        a = sc.nextInt();

        System.out.print("2 - ");
        b = sc.nextInt();
  
        System.out.print("3 - ");
        c = sc.nextInt();

        sc.close();

        int maior = a;
        int menor = a;

        //Maenor
        if (b > maior){
            maior = b;
        }
        if (c > maior){
            maior = c;
        }

        //Maior
        if (b < menor){
            menor = b;
        }
        if (c < menor){
            menor = c;
        }


        //Média
        double media = (a + b + c) / 3.0;

        //Múltiplos de 3
        int multiplo3 = 0;

        if (a % 3 == 0){
            multiplo3++;
        }
        if (b % 3 == 0){
            multiplo3++;
        }
        if (c % 3 == 0){
            multiplo3++;
        }

        //Múltiplos de 5
        int multiplo5 = 0;

        if (a % 5 == 0){
            multiplo5++;
        }
        if (b % 5 == 0){
            multiplo5++;
        }
        if (c % 5 == 0){
            multiplo5++;
        }
       

        //Saída

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.printf("Média dos números: R$ %.2f%n", media);
        System.out.println("Quantidade de números múltiplos de 3: " + multiplo3);
        System.out.println("Quantidade de números múltiplos de 5: " + multiplo5);

        if(a == b && a == c){
            System.out.println("Os números são iguais");
        }
    }
}
