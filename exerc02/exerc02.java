package exerc02;
import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        double horas;
        double valorHora;
        double percentual;

        System.out.println("Informe o nome do funcionário: ");
        nome = sc.nextLine();

        System.out.println("Informe as horas trabalhadas: ");
        horas = sc.nextDouble();

        System.out.println("Informe o valor por hora: ");
        valorHora = sc.nextDouble();

        System.out.println("Informe o percentual de desconto do INSS: ");
        percentual = sc.nextDouble();

        sc.close();

        double bruto = horas * valorHora;
        double desconto = bruto * percentual / 100;
        double liquido = bruto - desconto;

        System.out.println("Funcionário: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f%n", bruto);
        System.out.printf("Desconto INSS: R$ %.2f%n", desconto);
        System.out.printf("Salário Líquido: R$ %.2f%n", liquido);



        
    }
}
