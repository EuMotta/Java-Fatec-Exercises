import java.util.Scanner;

public class ex21 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Digite o número de linhas: ");
    int N = num.nextInt();
    System.out.print("Digite o número de colunas da primeira matriz: ");
    int M = num.nextInt();
    System.out.print("Digite o número de colunas da segunda matriz: ");
    int P = num.nextInt();

    int[][] matriz1 = new int[N][M];
    int[][] matriz2 = new int[N][P];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        matriz1[i][j] = (int) (Math.random() * 50);
      }
      for (int j = 0; j < P; j++) {
        matriz2[i][j] = (int) (Math.random() * 50);
      }
    }

    int[][] matrizConcatenada = new int[N][M + P];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        matrizConcatenada[i][j] = matriz1[i][j];
      }
      for (int j = 0; j < P; j++) {
        matrizConcatenada[i][j + M] = matriz2[i][j];
      }
    }

    System.out.println("Matriz 1:");
    for (int[] linha : matriz1) {
      for (int elemento : linha) {
        System.out.print(elemento < 10 ? "0" + elemento + " " : elemento + " ");
      }
      System.out.println();
    }

    System.out.println("Matriz 2:");
    for (int[] linha : matriz2) {
      for (int elemento : linha) {
        System.out.print(elemento < 10 ? "0" + elemento + " " : elemento + " ");
      }
      System.out.println();
    }

    System.out.println("Matriz concatenada:");
    for (int[] linha : matrizConcatenada) {
      for (int elemento : linha) {
        System.out.print(elemento < 10 ? "0" + elemento + " " : elemento + " ");
      }
      System.out.println();
    }
    num.close();
  }
}
