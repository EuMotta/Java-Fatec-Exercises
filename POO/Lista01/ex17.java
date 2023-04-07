import java.util.Scanner;

public class ex17 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);

    System.out.print("Digite a dimensão da matriz: ");
    int n = num.nextInt();

    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = (int) (Math.random() * 100);
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Elementos acima da diagonal principal e abaixo da diagonal secundária:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i < j || i + j >= n) {
          System.out.print(arr[i][j] + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    num.close();
  }
}
