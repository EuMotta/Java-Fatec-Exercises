import java.util.Arrays;
import java.util.Scanner;

public class ex27 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("Linhas:");
    int N = num.nextInt();
    System.out.println("colunas:");
    int M = num.nextInt();
    int[][] arr = new int[N][M];    
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            arr[i][j] = (int) (Math.random() * 10);
        }
    }
    System.out.println("Matriz original:");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    
    int[] arrY = new int[N * M];
    int k = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            arrY[k] = arr[i][j];
            k++;
        }
    }
    for (int i = 0; i < N; i++) {
        Arrays.sort(arr[i]);
    }
    System.out.println("Matriz decrescemte :");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N;j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    num.close();
  }
}
