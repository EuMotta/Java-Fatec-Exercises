
/*
 * ex03.java
 * 
 * 
 * 
 */
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Insira uma quantidade");
        int qtd = num.nextInt();

        if (qtd <= 20 && qtd > 0) {
            int[][] arr = new int[qtd][qtd];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int random = (int) (Math.random() * 100);
                    arr[i][j] = random;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Dimensão inválida. Insira um número entre 1 e 20.");
        }
        num.close();

    }
}
