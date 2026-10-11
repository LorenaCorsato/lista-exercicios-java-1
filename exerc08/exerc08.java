package exerc08;

import java.util.Scanner;

public class exerc08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        double frequencia;

        do{
        System.out.print("Informe a nota (0 - 100): ");
        nota = sc.nextDouble();
        if (nota < 0 || nota > 100) System.out.println("Nota inválida! Tente novamente.");

        } while (nota < 0 || nota > 100);

        do{
        System.out.print("Informe a frequência (0 - 100): ");
        frequencia = sc.nextDouble();
        if (frequencia < 0 || frequencia > 100) System.out.println("Frequência inválida! Tente novamente.");

        } while (frequencia < 0 || frequencia > 100);

        sc.close();

        if (nota >= 70 && frequencia >= 75){
            System.out.print("O aluno foi aprovado!");
        } else if(nota <= 50 && frequencia <= 69){
            System.out.print("O aluno está em recuperação!");
        }else if( frequencia < 75){
            System.out.print("O aluno foi reprovado por frequência!");   
        } else{
            System.out.print("O aluno foi reprovado por nota!");   
        }
    }
}