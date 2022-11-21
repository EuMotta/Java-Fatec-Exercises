import java.util.Scanner;

public class ex35 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int termos = 0, num = 1;
		
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
					if(num > 0){
						System.out.print(num + ", ");
						num = (num * -1);
						
					}else{
						System.out.print(num + ", ");
						num = ((num * -1) + 1);
					}
					
					
					
				}
	
			}
			
		}while(termos != 0);
		scan.close();	
	}
}

