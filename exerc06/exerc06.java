package exerc06;

import java.util.Scanner;

public class exerc06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double produtoA;
        double produtoB;
        double produtoC;


        System.out.println("Digite o preço dos três produtos: ");

        System.out.print("1 - R$ ");
        produtoA = sc.nextDouble();

        System.out.print("2 - R$ ");
        produtoB= sc.nextDouble();
  
        System.out.print("3 - R$ ");
        produtoC= sc.nextDouble();

        sc.close();

        double caro = produtoA;
        double barato = produtoA;

        //Mais caro
        if (produtoB > caro){
            caro = produtoB;
        }
        if (produtoC > caro){
            caro = produtoC;
        }

        //Mais barato
        if (produtoB < barato){
            barato = produtoB;
        }
        if (produtoC < barato){
            barato = produtoC;
        }


        //Média
        double media = (produtoA + produtoB + produtoC) / 3.0;

        //Acima da média
        int acimaMedia = 0;

        if (produtoA > media){
            acimaMedia++;
        }

        if (produtoB > media){
            acimaMedia++;
        }

        if (produtoC > media){
            acimaMedia++;
        }

        //Saída

        System.out.printf("Valor do produto mais caro: R$ %.2f%n", caro);
        System.out.printf("Valor do produto mais barato: R$ %.2f%n", barato);
        System.out.printf("Média dos valores: R$ %.2f%n", media);
        System.out.println("Produtos acima da média: " + acimaMedia);
        if(produtoA == produtoB && produtoA == produtoC){
            System.out.println("Os produtos possuem o mesmo preço");
        }






    }
}
