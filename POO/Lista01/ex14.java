import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.print("Insira um tamanho: ");
		int tam = num.nextInt();
		int[][] arr = new int[tam][tam];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int valor = (int) (Math.random() * 100);
				arr[i][j] = valor;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i <= j) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();

		}
		num.close();
	}
}
