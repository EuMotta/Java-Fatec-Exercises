import java.util.Scanner;


public class ex07 {
	
	public static void main (String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Digite um num: ");
		int tab = num.nextInt();
		
		for(int i = 1; i <=10 ; i++){
			
				System.out.println(tab * i);
		}
	}
}

