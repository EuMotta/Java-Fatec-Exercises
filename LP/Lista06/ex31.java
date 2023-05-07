import java.util.Scanner;

public class ex31 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int termos = 0, aux = 1;
		
		System.out.print("Insira a quantidade de termos: ");
		termos = scan.nextInt();
		
		do{
			if(termos < 0){
				System.out.print("Insira outro valor: ");
				termos = scan.nextInt();
				
			}else if(termos == 0){
				System.exit(0);
				
			}else{
				if(aux <= termos){
					System.out.print(aux + " ");
					aux++;
					
				}
				
			}
			
		}while(termos != 0);
		scan.close();	
		
	}
}

