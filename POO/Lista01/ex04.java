
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("insira a quantidade de linhas: ");
		int qtdLinha = num.nextInt();
		System.out.print("insira a quantidade de colunas: ");
		int qtdColuna = num.nextInt();

		while (qtdLinha <= 0 || qtdColuna <= 0) {
			System.out.print("insira a quantidade de linhas: ");
			qtdLinha = num.nextInt();
			System.out.print("insira a quantidade de colunas: ");
			qtdColuna = num.nextInt();
		}
		int[][] arr = new int[qtdLinha][qtdColuna];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int valor = (int) (Math.random() * 100);
				arr[i][j] = valor;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		num.close();
	}
}
