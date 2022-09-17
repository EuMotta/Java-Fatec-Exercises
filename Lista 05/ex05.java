import java.util.Scanner;
public class ex05 {
	
	public static void main (String[] args) {
		Scanner notas = new Scanner(System.in);
		System.out.print("Insira o ano de nascimento: ");
		int nascimento = notas.nextInt();
		System.out.print("Insira o ano atual: ");
		int atual = notas.nextInt();
		double total = (atual - nascimento);
		if( total < 18 ){
			System.out.println(total);
			System.out.println("NAO PODE VOTAR");
		}else{
			System.out.println("PODE  VOTAR");
		}
	}
}

