import java.util.Scanner;

public class ex03 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("insira um valor: ");
    double valor = num.nextDouble();
    System.out.println(checkValor(valor));
    num.close();
  }

  static String checkValor(double valor) {
    if (valor > 0) {
      return "positivo";
    } else if (valor < 0) {
      return "negativo";
    } else {
      return "zero";
    }
  }
}
