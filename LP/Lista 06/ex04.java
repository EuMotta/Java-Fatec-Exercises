import java.util.Scanner;

public class ex04 {
	
	public static void main (String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = num.nextInt();
		for(int i = 0; i <= numero; i++){
			System.out.println(i);
		}
		num.close();
	}
}

