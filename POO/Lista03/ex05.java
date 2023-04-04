import java.util.Scanner;

public class ex05 {
  static int contador = 0;
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Digite o valor de a: ");
    int a = num.nextInt();
    System.out.print("Digite o valor de b: ");
    int b = num.nextInt();
    System.out.print("Digite o valor de c: ");
    int c = num.nextInt();
    System.out.print(soma(a, b, c));
    num.close();
  }

  //somar dois valores
  static int soma(int a, int b) {
    if(a > b)
    return a;
    else
    return b;

  }
  //somar tres valores
  static int soma(int a, int b, int c) {
    if(soma(a, b) > c)
    return b;
    else
    return c;

  }
  
}
