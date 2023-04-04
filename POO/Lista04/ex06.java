import java.util.Scanner;

public class ex06 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("insira o primeiro valor: ");
    int start = num.nextInt();
    System.out.print("insira o ultimo valor: ");
    int end = num.nextInt();
    for (int i = start; i <= end; i++) {
      if (isPrimo(i)) {
        System.out.print(i + " ");
      }
    }
    num.close();
  }

  static boolean isPrimo(int n) {
    if (n < 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
