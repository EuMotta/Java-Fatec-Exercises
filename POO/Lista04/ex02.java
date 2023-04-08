import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String opcao;
        do {
            System.out.println("[C] Celsius, [F] Fahrenheit e [S] Sair:");
            opcao = num.next().toUpperCase();
            switch (opcao) {
                case "C":
                    System.out.print("Entre com a temperatura em Celsius: ");
                    double temperaturaC = num.nextDouble();
                    double temperaturaF = CPF(temperaturaC);
                    System.out.println("Temperatura em Fahrenheit: " + temperaturaF);
                    break;
                case "F":
                    System.out.print("Entre com a temperatura em Fahrenheit: ");
                    double temperaturaF2 = num.nextDouble();
                    double temperaturaC2 = FPC(temperaturaF2);
                    System.out.println("Temperatura em Celsius: " + temperaturaC2);
                    break;
                case "S":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (!opcao.equals("S"));
        num.close();
    }

    public static double CPF(double temperaturaCelsius) {
        double temperaturaFahrenheit = (9.0 * temperaturaCelsius / 5.0) + 32.0;
        return temperaturaFahrenheit;
    }

    public static double FPC(double temperaturaFahrenheit) {
        double temperaturaCelsius = 5.0 * (temperaturaFahrenheit - 32.0) / 9.0;
        return temperaturaCelsius;
    }
}
