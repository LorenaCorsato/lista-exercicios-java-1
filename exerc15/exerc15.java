package exerc15;

import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperaturaInicial;
        int temperaturaFinal;
        int passo;

        System.out.print("Digite a temperatura inicial em Celsius: ");
        temperaturaInicial = sc.nextInt();

        System.out.print("Digite a temperatura final em Celsius: ");
        temperaturaFinal = sc.nextInt();

        do {
            System.out.print("Digite o passo (positivo): ");
            passo = sc.nextInt();

            if (passo <= 0) {
                System.out.println("Passo inválido! Tente novamente.");
            }
        } while (passo <= 0);

        sc.close();

        long incremento = passo;

        if (temperaturaInicial > temperaturaFinal) {
            incremento = -incremento;
        }

        System.out.printf("%15s%18s%15s%n", "Celsius", "Fahrenheit", "Kelvin");

        for (long celsius = temperaturaInicial;
                incremento > 0 ? celsius <= temperaturaFinal : celsius >= temperaturaFinal;
                celsius += incremento) {
            double fahrenheit = celsius * 1.8 + 32;
            double kelvin = celsius + 273.15;

            System.out.printf("%12.1f °C%15.1f °F%13.2f K%n", (double) celsius, fahrenheit, kelvin);
        }
    }
}
