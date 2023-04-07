import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite o número de linhas: ");
        int N = num.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int M = num.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int P = num.nextInt();

        int[][] arr1 = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr1[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz 1:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr1[i][j] < 10 ? "0" + arr1[i][j] + " " : arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr2 = new int[N][P];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < P; j++) {
                arr2[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz 2:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < P; j++) {
                System.out.print(arr2[i][j] < 10 ? "0" + arr2[i][j] + " " : arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr3 = new int[N][M + P];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M + P; j++) {
                if (j % 2 == 0) {
                    arr3[i][j] = arr1[i][j / 2];
                } else {
                    arr3[i][j] = arr2[i][(j - 1) / 2];
                }
            }
        }
        
        System.out.println("Matriz 3:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M + P; j++) {
                System.out.print(arr3[i][j] < 10 ? "0" + arr3[i][j] + " " : arr3[i][j] + " ");
            }
            System.out.println();
        }
        num.close();
    }
}
