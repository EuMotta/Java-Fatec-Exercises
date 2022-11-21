import java.util.Scanner;

public class ex22 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] codigos = new int[15];
		int[] precos = new int[15];
		int numeroMaior = Integer.MIN_VALUE, auxiliarMaior = 0, soma = 0, media = 0;
		
		for(int i = 0; i < 15; i++){
			System.out.print("Insira o codigo do produto: ");
			codigos[i] = scan.nextInt();
			
			System.out.print("Insira o preco do produto: ");
			precos[i] = scan.nextInt();
			
			if(precos[i] > numeroMaior){
                numeroMaior = precos[i];
                auxiliarMaior = i;
            }
            
            soma += precos[i];
            media = (soma / 15);
		}
		
		System.out.println("O maior preco e: " + numeroMaior);
		System.out.println("A media de precos e: " + media);
		scan.close();
	}
}

