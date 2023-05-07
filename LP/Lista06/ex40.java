import java.util.Scanner;

public class ex40 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int termos = 0, aux = 0, num = 0, numAux = 1;
		
		System.out.print("Insira a quantidade de termos: ");
		termos = scan.nextInt();
		
		aux = termos;
		
		do{
			if(termos < 0){
				System.out.print("Insira outro valor: ");
				termos = scan.nextInt();
				
				aux = termos;
				
			}else if(termos == 0){
				System.exit(0);
				
			}else{
				if(num <= termos * 2){
					if(numAux <= termos){
						System.out.print(numAux + " ");
						numAux++;
							
					}else{
						if(aux != 0){
							System.out.print(aux + " ");
							aux--;
						}
						
					}
					num++;
					
				}
				
			}
			
		}while(termos != 0);
		scan.close();
	}
}

