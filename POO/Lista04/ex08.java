import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Digite a quantidade de números: ");
    n = sc.nextInt();
    do {
      if (n <= 0) {
        System.out.print("Valor inválido, digite novamente: ");
        n = sc.nextInt();
      }

    } while (n <= 0);

    int[] numeros = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      numeros[i] = sc.nextInt();
    }

    int resto, a = numeros[0], b;
    for (int i = 1; i < n; i++) {
      b = numeros[i];
      do {
        resto = a % b;
        a = b;
        b = resto;
      } while (resto != 0);
    }

    System.out.println("O MDC dos números é: " + a);

    sc.close();
  }
}
