import java.util.Scanner;

public class ex21 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int media = 0, soma = 0, numeroMaior = Integer.MIN_VALUE, auxiliarMaior = 0;
		
		System.out.print("Insira uma quantidade: ");
		int quantidade = scan.nextInt();
		
		int[] numeros = new int[quantidade];
		
		for(int i = 0; i < quantidade; i++){
			System.out.print("Insira algum numero: ");
			numeros[i] = scan.nextInt();
			
			soma += numeros[i];
			media = (soma / quantidade);
			
			if(numeros[i] > numeroMaior){
                numeroMaior = numeros[i];
                auxiliarMaior = i;
            }
		}
		
		System.out.println("O maior numero e: " + numeroMaior);
		System.out.println("A media dos numeros e: " + media);

		scan.close();
	}
}

