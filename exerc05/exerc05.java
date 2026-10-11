package exerc05;

import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        int q;

        System.out.println("Digite o valor de p: ");
        p = sc.nextInt();

        System.out.println("Digite o valor de q: ");
        q = sc.nextInt();

        sc.close();

        if (q == 0){
            System.out.println("Não é possível dividir por 0");
        } else {

            System.out.println("Divisão normal: p / q = " + (p / q));
            System.out.println("Divisão com numerador float: p / q = " + ((float) p / q));
            System.out.println("Divisão com resultado convertido para double): p / q = " + ((double) (p / q)));
            // A divisão p/q ocorre entre inteiros antes do casting, a parte decimal já foi descartada, 
            // por isso o resultado convertido para double é  3.0
        }
    }
}
