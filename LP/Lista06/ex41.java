import java.util.Scanner;

public class ex41 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0, aux = 1;
		
		System.out.print("Insira algum valor: ");
		num = scan.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			aux = aux * i;
			
			System.out.println(aux);
			
		}
		scan.close();	
	}
}

