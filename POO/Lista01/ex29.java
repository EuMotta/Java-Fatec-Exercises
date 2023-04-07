import java.util.Random;
import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = num.nextInt();
        num.close();
        int arr[] = new int[valor];
        Random gerador = new Random();
        int maior = 0;
        System.out.println("vetor:");
        for (int i = 0; i < valor; i++) {
            arr[i] = gerador.nextInt(9) + 1;
            System.out.printf("%d ", arr[i]);
            if (arr[i] > maior) {
                maior = arr[i];
            }
        }
        int primos[] = new int[maior + 1];
        int controladora = 1;
        for (int i = 2; controladora <= maior; i++) {
            boolean ehPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                primos[controladora++] = i;
            }
        }
        int matriz[][] = new int[valor][maior + 1];
        for (int i = 0; i < valor; i++) {
            matriz[i][0] = arr[i];
            for (int j = 1; j <= arr[i]; j++) {
                matriz[i][j] = primos[j];
            }
        }
        System.out.println("\nMatriz:");
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 0) {
                    System.out.printf("%d ", matriz[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}