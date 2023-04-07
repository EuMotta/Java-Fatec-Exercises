import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz: ");
        int n = num.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = num.nextInt();
            }
        }

        System.out.println("Elementos abaixo da diagonal principal e acima da diagonal secundária:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j || i + j >= n) {
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
