import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		double valor = num.nextDouble();

		if (valor > 10) {

			System.out.println("O VALOR e MAIOR QUE 10");
		} else {
			System.out.println("O VALOR e MENOR QUE 10");
		}
		num.close();
	}
}
