import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a dimensão da matriz: ");
        int n = input.nextInt();

        int[][] s = new int[n][n];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i][j] < 10) {
                    System.out.print("0" + s[i][j] + " ");
                } else {
                    System.out.print(s[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Elementos da asa da ampulheta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j && i + j < n - 1 || i > j && i + j > n - 1) {
                    System.out.print("{" + s[i][j] + "} ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
