import java.util.Scanner;

public class ex23 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int somaFilhos = 0, somaSalarios = 0;
		int numeroMaior = Integer.MIN_VALUE, auxiliarMaior = 0;
		int mediaFilhos = 0, mediaSalarios = 0;
		double quantidadeSalario150 = 0, salario150 = 0;
		
		System.out.print("Insira a quantidade de moradores: ");
		int quantidadeMoradores = scan.nextInt();
		
		int[] salarios = new int[quantidadeMoradores];
		int[] filhos = new int[quantidadeMoradores];
		
		for(int i = 0; i < quantidadeMoradores; i++){
			System.out.print("Insira seu salario: ");
			salarios[i] = scan.nextInt();
			
			System.out.print("Insira o numero de filhos: ");
			filhos[i] = scan.nextInt();
			
			somaSalarios += salarios[i];
			somaFilhos += filhos[i];
			mediaSalarios = (somaSalarios / quantidadeMoradores);
			mediaFilhos = (somaFilhos / quantidadeMoradores);
			
			if(salarios[i] > numeroMaior){
                numeroMaior = salarios[i];
                auxiliarMaior = i;
            }
            
            if(salarios[i] < 150){
				quantidadeSalario150++;
			}
		}
		
		salario150 = ((quantidadeSalario150 * 100) / (quantidadeMoradores));
		
		System.out.println("Media de salario da populacao: " + mediaSalarios);
		System.out.println("Media do numero de filhos: " + mediaFilhos);
		System.out.println("Maior salario dos habitantes: " + numeroMaior);
		System.out.println("Percentual de pessoas com salario menor que R$ 150,00: " + salario150);
		scan.close();
	}
}

