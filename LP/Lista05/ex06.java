import java.util.Scanner;
public class ex06 {
	
	public static void main (String[] args) {
		Scanner notas = new Scanner(System.in);
		System.out.print("Insira o valor 1: ");
		int valor1 = notas.nextInt();
		System.out.print("Insira o valor 2: ");
		int valor2 = notas.nextInt();
		if( valor1 < valor2 ){
			System.out.println(valor2);
		}else{
			System.out.println(valor1);
		}
	}
}

