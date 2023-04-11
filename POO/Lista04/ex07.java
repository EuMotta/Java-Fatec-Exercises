import java.util.Scanner;

public class ex07 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    int num1 = num.nextInt();
    System.out.print("Digite o segundo número: ");
    int num2 = num.nextInt();

    int resto, a = num1, b = num2;
    do {
      resto = a % b;
      a = b;
      b = resto;
    } while (resto != 0);

    System.out.println("O MDC de " + num1 + " e " + num2 + " é: " + a);
    System.out.println();
    num.close();
  }
}