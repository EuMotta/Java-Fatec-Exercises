import java.util.Scanner;

public class ex18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite a dimensão da matriz: ");
    int n = input.nextInt();

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
    System.out.println("Elementos acima da diagonal principal e acima da diagonal secundária:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i > j || i + j < n - 1) {
          System.out.print("  ");
        } else {
          System.out.print(arr[i][j] + " ");
        }
      }
      System.out.println();
    }
    input.close();
  }
}
