import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite a dimensão da matriz: ");
        int n = num.nextInt();
        int[][] p = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Elementos abaixo da diagonal principal e abaixo da diagonal secundária:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j && i + j <= n - 1) {
                    System.out.print(p[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        num.close();
    }
}
