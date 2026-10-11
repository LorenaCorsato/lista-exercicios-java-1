package exerc04;

import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        byte valorByte = 100;
        short valorShort = 300;
        int valorInt = 1000;
        long valorLong = 100000L;
        float valorFloat = 12.5f;
        double valorDouble = 45.9;
        char caractere = 'A';

        long conversaoImplicita = valorInt;
        int conversaoExplicita = (int) valorDouble;
        double valorMuitoGrande = 3_000_000_000.75;
        int valorConvertido = (int) valorMuitoGrande;
        int promocao = valorByte + valorShort;
        int codigoCaractere = caractere + 1;

        int x;
        int y;

        System.out.println("Conversão implícita int para long: " + conversaoImplicita);
        System.out.println("Casting explícito double para int: " + conversaoExplicita);
        System.out.println("Casting double grande para int (fora do intervalo): " + valorConvertido);
        System.out.println("Soma de byte e short promovida a int: " + promocao);
        System.out.println("Char + 1 (código numérico): " + codigoCaractere);
        System.out.println("Outros tipos: long=" + valorLong + ", float=" + valorFloat);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite x: ");
        x = sc.nextInt();
        System.out.print("Digite y: ");
        y = sc.nextInt();

        if (y == 0) {
            System.out.println("Divisão por zero não permitida.");
        } else {
            System.out.println("x / y = " + (x / y));
            System.out.println("(double) x / y = " + ((double) x / y));
            System.out.println("Na primeira divisão, dois inteiros geram um resultado inteiro (truncado).");
            System.out.println("Na segunda, o casting promove a operação para double, preservando decimais.");
        }
        
        sc.close();
    }
}
