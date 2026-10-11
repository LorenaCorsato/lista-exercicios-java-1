package exerc03;
import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        double temperaturaCelsius;

        System.out.println("Digite a temperatura em Celsius:   ");
        temperaturaCelsius =  sc.nextDouble();

        sc.close();

        double temperaturaFahrenheit =  (temperaturaCelsius * 1.8) + 32;
        double temperaturaKelvin =  temperaturaCelsius + 273.15;

        System.out.printf("Temperatura em Celsius: %.2f °C%n", temperaturaCelsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", temperaturaFahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", temperaturaKelvin);

    }
}
