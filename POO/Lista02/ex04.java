import java.util.Scanner;

public class ex04 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    double a, b, c;
    double delta;

    System.out.print("insira o valor de a: ");
    a = num.nextDouble();
    System.out.print("insira o valor de b: ");
    b = num.nextDouble();
    System.out.print("insira o valor de c: ");
    c = num.nextDouble();

    delta = delta(a, b, c);

    System.out.println(delta);
    System.out.println(raizes(a, b, c));
    num.close();
  }

  static double delta(double a, double b, double c) {
    return (b * b) - (4 * a * c);
  }

  static double[] raizes(double a, double b, double c) {
    double delta = delta(a, b, c);
    double[] resultado = new double[2];
    if (delta > 0) {
      System.out.println("A equação tem duas raízes reais:");
      double x1 = (-b + Math.sqrt(delta)) / (2 * a);
      double x2 = (-b - Math.sqrt(delta)) / (2 * a);
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);
      resultado[0] = x1;
      resultado[1] = x2;
      return resultado;
    } else if (delta == 0) {
      System.out.println("A equação tem uma raiz real:");
      double x = -b / (2 * a);
      System.out.println("x = " + x);
      resultado[0] = x;
      return resultado;
    } else {
      System.out.println("A equação não tem raízes reais.");
    }
    return resultado;
  }
}
