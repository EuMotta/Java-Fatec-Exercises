import java.util.Scanner;

public class ex43 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0, aux = 1;
		
		for (int i = 0; i < 7; i++)
		{
			System.out.print("Insira algum valor: ");
			num = scan.nextInt();
			
			for (int j = 1; j <= num; j++)
			{
				aux = aux * j;
			
			}
			
			System.out.println("fatorial de " + num + ": " + aux + "\n");
			
			aux = 1;
			
		}
		scan.close();
		
	}
}

