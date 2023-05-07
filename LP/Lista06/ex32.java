import java.util.Scanner;

public class ex32 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int termos = 0, num = 0;
		
		System.out.print("Insira a quantidade de termos: ");
		termos = scan.nextInt();
		
		do{
			if(termos < 0){
				System.out.print("Insira outro valor: ");
				termos = scan.nextInt();
				
			}else if(termos == 0){
				System.exit(0);
				
			}else{
				if(num * 2 <= termos){
					System.out.print((num * 2) + " ");
					num++;
					
				}
				
			}
				
			
		}while(termos != 0);
		scan.close();	
	}
}

