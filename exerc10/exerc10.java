
package exerc10;

import java.util.Scanner;

public class exerc10 {

    static double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    static double areaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    static double areaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

    static double perimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    static double hipotenusa(double cateto1, double cateto2) {
        return Math.hypot(cateto1, cateto2);
    }

    static double lerPositivo(Scanner sc, String nome) {
        double valor;

        do {
            System.out.print("Digite " + nome + ": ");
            valor = sc.nextDouble();

            if (valor <= 0) {
                System.out.println("Erro: o valor deve ser positivo.");
            }

        } while (valor <= 0);

        return valor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        double base, altura, raio, cateto1, cateto2, resultado;

        do {
            System.out.println("\n=== CALCULADORA GEOMÉTRICA ===");
            System.out.println("1 - Área do Retângulo");
            System.out.println("2 - Área do Círculo");
            System.out.println("3 - Área do Triângulo");
            System.out.println("4 - Perímetro do Círculo");
            System.out.println("5 - Hipotenusa de Triângulo Retângulo");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    base = lerPositivo(sc, "a base");
                    altura = lerPositivo(sc, "a altura");

                    resultado = areaRetangulo(base, altura);
                    System.out.printf("Área do retângulo: %.2f%n", resultado);
                    break;

                case 2:
                    raio = lerPositivo(sc, "o raio");

                    resultado = areaCirculo(raio);
                    System.out.printf("Área do círculo: %.2f%n", resultado);
                    break;

                case 3:
                    base = lerPositivo(sc, "a base");
                    altura = lerPositivo(sc, "a altura");

                    resultado = areaTriangulo(base, altura);
                    System.out.printf("Área do triângulo: %.2f%n", resultado);
                    break;

                case 4:
                    raio = lerPositivo(sc, "o raio");

                    resultado = perimetroCirculo(raio);
                    System.out.printf("Perímetro do círculo: %.2f%n", resultado);
                    break;

                case 5:
                    cateto1 = lerPositivo(sc, "o primeiro cateto");
                    cateto2 = lerPositivo(sc, "o segundo cateto");

                    resultado = hipotenusa(cateto1, cateto2);
                    System.out.printf("Hipotenusa: %.2f%n", resultado);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
