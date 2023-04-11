import java.util.Scanner;

public class ex13 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("insira uma quantidade de valores: ");
    int qtd = num.nextInt();
    int arr[] = new int[qtd];
    for (int i = 0; i < qtd; i++) {
      System.out.println("Digite o valor " + (i + 1) + ":");
      arr[i] = num.nextInt();
    }
    int[] perfeitos = encontrarPerfeitos(arr);
    System.out.println("Números perfeitos digitados:");
    for (int i = 0; i < perfeitos.length; i++) {
      System.out.println(perfeitos[i]);
    }
    num.close();
  }

  public static int[] encontrarPerfeitos(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (perfeito(arr[i])) {
        count++;
      }
    }
    int[] perfeitos = new int[count];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (perfeito(arr[i])) {
        perfeitos[index] = arr[i];
        index++;
      }
    }
    return perfeitos;
  }

  public static boolean perfeito(int num) {
    int soma = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        soma += i;
      }
    }
    return soma == num;
  }
}
