import java.util.Scanner;

public class ex24 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("Digite o tamanho da coluna da matriz:");
    int tamLinhas = num.nextInt();
    System.out.println("Digite o tamanho da linhas da matriz:");
    int tamColunas = num.nextInt();

    int qtdFibonacci = tamLinhas * tamColunas;
    int arr[][] = new int[tamLinhas][tamColunas];
    int num1 = 0;
    int num2 = 1;
    int contador = 0;

    while (contador < qtdFibonacci) {
      int fib = num1 + num2;
      arr[contador / tamColunas][contador % tamColunas] = fib;
      num1 = num2;
      num2 = fib;
      contador++;
    }

    for (int i = 0; i < tamLinhas; i++) {
      for (int j = 0; j < tamColunas; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    num.close();
  }
}
