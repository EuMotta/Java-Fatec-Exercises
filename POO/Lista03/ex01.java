import java.util.Scanner;


public class ex01 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int maior;
    System.out.print("Digite o valor de a: ");
    int a = num.nextInt();
    System.out.print("Digite o valor de b: ");
    int b = num.nextInt();
    maior = num(a, b);
    System.out.println("o maior valor: " + maior);
    num.close();
  }

  static int num(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }

  }
}
