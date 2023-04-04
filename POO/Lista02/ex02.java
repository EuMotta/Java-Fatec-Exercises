import java.util.Scanner;

public class ex02 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("insira um valor: ");
    double valor = num.nextDouble();

    if (checkValor(valor)) {

      System.out.println("É zero");
    } else {
      System.out.println("Não é zero");
    }
    num.close();
  }

  static boolean checkValor(double valor) {
    return (valor == 0);
  }
}
