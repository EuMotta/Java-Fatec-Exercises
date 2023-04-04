import java.util.Scanner;

public class ex05 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int n1, n2, n3;
    System.out.println("insira o primeiro numero:");
    n1 = num.nextInt();
    System.out.println("insira o segundo numero:");
    n2 = num.nextInt();
    System.out.println("insira o terceiro numero:");
    n3 = num.nextInt();

    System.out.println("maior: " + maior(n1, n2, n3));
    num.close();
  }

  public static int maior(int n1, int n2) {
    if (n1 > n2) {
      return n1;
    } else {
      return n2;
    }
  }

  public static int maior(int n1, int n2, int n3) {
    int maior = n1;
    if (n2 > maior) {
      maior = n2;
    }
    if (n3 > maior) {
      maior = n3;
    }
    return maior;
  }
}
