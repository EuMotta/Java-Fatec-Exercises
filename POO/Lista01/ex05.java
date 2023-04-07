
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("digite uma quantidade de linhas: ");
		int qtdLinhas = num.nextInt();
		System.out.print("digite uma quantidade de colunas: ");
		int qtdColunas = num.nextInt();
		int[][] arr1 = new int[qtdLinhas][qtdColunas], arr2 = new int[qtdLinhas][qtdColunas],
				arrTotal = new int[qtdLinhas][qtdColunas];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				int valor = (int) (Math.random() * 100);
				arr1[i][j] = valor;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				int valor = (int) (Math.random() * 100);
				arr2[i][j] = valor;
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arrTotal[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arrTotal[i][j] + " ");
			}
			System.out.println();
		}
		num.close();
	}
}
