import java.util.Scanner;

public class ex34{
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int termos = 0, num = 0, aux = 1;
		
		System.out.print("Insira a quantidade de termos: ");
		termos = scan.nextInt();
		
		do{
			if(termos < 0){
				System.out.print("Insira a quantidade de termos: ");
				termos = scan.nextInt();
				
			}else if(termos == 0){
				System.exit(0);
				
			}else{
				if(num <= termos){
					if(num == 0){
						System.out.print(num + " ");
						
					}else{
						System.out.print(num + " ");
						aux++;
					}
					
					num = num + aux;
					
					
				}
					
			}
			
		}while(termos != 0);
		scan.close();	
		
	}
}

