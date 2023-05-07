import java.util.Scanner;
public class ex04 {
	
	public static void main (String[] args) {
		Scanner notas = new Scanner(System.in);
		System.out.print("Insira a primeira nota: ");
		int nota1 = notas.nextInt();
		System.out.print("Insira a primeira nota: ");
		int nota2 = notas.nextInt();
		double total = ((nota1 + nota2)/2);
		if( total < 6 ){
			System.out.println(total);
			System.out.println("REPROVADO");
		}else{
			System.out.println("APROVADO");
		}
	}
}

