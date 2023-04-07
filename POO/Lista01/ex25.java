import java.util.Arrays;
import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Linhas:");
        int N = num.nextInt();
        System.out.println("colunas:");
        int M = num.nextInt();
        int[][] Y = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Y[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(Y[i][j] + " ");
            }
            System.out.println();
        }

        int[] vetorY = new int[N * M];
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                vetorY[k] = Y[i][j];
                k++;
            }
        }
        Arrays.sort(vetorY);
        k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Y[i][j] = vetorY[k];
                k++;
            }
        }
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(Y[i][j] + " ");
            }
            System.out.println();
        }
        num.close();
    }
}
