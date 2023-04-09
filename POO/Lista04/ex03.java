import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        char opcao;
        do {
            System.out.println("[C] Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair:");
            opcao = num.next().charAt(0);
            opcao = Character.toUpperCase(opcao);

            if (opcao == 'C') {
                System.out.print("Entre com a temperatura em Celsius: ");
                double celsius = num.nextDouble();
                double fahrenheit = converterParaFahrenheit(celsius);
                double kelvin = converterParaKelvin(celsius);
                System.out.printf("Fahrenheit: %.1f\nKelvin: %.1f\n", fahrenheit, kelvin);
            } else if (opcao == 'F') {
                System.out.print("Entre com a temperatura em Fahrenheit: ");
                double fahrenheit = num.nextDouble();
                double celsius = converterParaCelsius(fahrenheit);
                double kelvin = converterParaKelvin(celsius);
                System.out.printf("Celsius: %.1f\nKelvin: %.1f\n", celsius, kelvin);
            } else if (opcao == 'K') {
                System.out.print("Entre com a temperatura em Kelvin: ");
                double kelvin = num.nextDouble();
                double celsius = converterParaCelsius(kelvin);
                double fahrenheit = converterParaFahrenheit(celsius);
                System.out.printf("Celsius: %.1f\nFahrenheit: %.1f\n", celsius, fahrenheit);
            } else if (opcao != 'S') {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 'S');

        num.close();
    }

    public static double converterParaCelsius(double temperatura) {
        return temperatura - 273;
    }

    public static double converterParaFahrenheit(double temperatura) {
        return (9 * temperatura / 5) + 32;
    }

    public static double converterParaKelvin(double temperatura) {
        return temperatura + 273;
    }
}
