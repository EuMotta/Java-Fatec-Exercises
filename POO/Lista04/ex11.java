import java.util.Scanner;

public class ex11 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("insira um numero: ");
    int valor = num.nextInt();
    boolean isPerfeito = perfeito(valor);
    if (isPerfeito) {
      System.out.println(valor + " é um número perfeito.");
    } else {
      System.out.println(valor + " não é um número perfeito.");
    }
    num.close();
  }

  static boolean perfeito(int valor) {
    int qtd = 0;
    for (int i = 1; i <= valor / 2; i++) {
      if (valor % i == 0) {
        qtd += i;
        System.out.print(qtd + " ");
      }
    }
    System.out.println();
    if (qtd == valor) {
      return true;
    } else {
      return false;
    }
  }
}
