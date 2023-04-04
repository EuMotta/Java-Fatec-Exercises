import java.util.Scanner;

public class ex01 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("insira um valor: ");
    double valor = num.nextDouble();

    if (isPositive(valor)) {

      System.out.println("Positivo");

    } else {

      System.out.println("Negativo");
    }
    num.close();
  }

  static boolean isPositive(double valor) {
    return (valor >= 0);
  }
}
