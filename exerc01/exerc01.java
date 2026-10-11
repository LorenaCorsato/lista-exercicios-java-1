package exerc01;
import java.util.Scanner;

public class exerc01{

  public static void main(String[] args) {
    
        String nome;
        double distancia;
        double qtdCombustivel;
        double preco;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe a distância percorrida (Km): ");
        distancia = sc.nextDouble();
        
        System.out.println("Informe a quantidade de combustível (em litros): ");
        qtdCombustivel = sc.nextDouble();
        
        System.out.println("Informe o preço do litro de combustível (em R$): ");
        preco = sc.nextDouble();

        //CM - Consumo médio e CT - Custo total
        double CM = distancia/qtdCombustivel;
        double CT = qtdCombustivel * preco;

        System.out.println("Motorista: " + nome);
        System.out.printf("Distância: %.2f\n", distancia);
        System.out.printf("Combustível gasto: %.2f\n", qtdCombustivel);
        System.out.printf("Preco do litro: %.2f\n", preco);
        System.out.printf("Consumo médio: %.2f km\n", CM );
        System.out.printf("Custo total: R$ %.2f\n", CT);

        

        sc.close();
  }
}