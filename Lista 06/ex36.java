import java.util.Scanner;

public class ex36 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int termos = 0, num = 1, aux = 1;
		
		System.out.print("Insira a quantidade de termos: ");
		termos = scan.nextInt();
		
		do{
			if(termos < 0){
				System.out.print("Insira outro valor: ");
				termos = scan.nextInt();
				
			}else if(termos == 0){
				System.exit(0);
				
			}else{
				if(num <= termos){
					if(num < 2){
						System.out.print(aux + " ");
						num++;
						
					}else{
						System.out.print(aux + "/" + num + " ");
						num++;
						
					}
					
				}
				
				
			}
			
		}while(termos != 0);
		scan.close();	
		
	}
}

