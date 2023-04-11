import java.util.Scanner;

public class ex09 {
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

    int MMC = (num1 * num2) / a;
    System.out.println("O MMC de " + num1 + " e " + num2 + " é: " + MMC);
    num.close();
  }
}