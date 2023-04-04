import java.util.Scanner;

public class ex01 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int C;
    System.out.println("insira o valor:");
    C = num.nextInt();

    System.out.println("Fahrenheit: " + maior(C));
    num.close();
  }

  public static int maior(int C) {
    return (9 * C / 5) + 32;
  }

}
