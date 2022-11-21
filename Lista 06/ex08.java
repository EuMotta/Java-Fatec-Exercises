import java.util.Scanner;


public class ex08 {
	
	public static void main (String[] args) {
		Scanner num = new Scanner(System.in);
		int qtd = 0;
		for(int i = 1; i <=10; i++){
			System.out.println("Insira um valor");
			int valor = num.nextInt();
			
			if(valor < 0){
				qtd++;
			}
		}
		System.out.println("Existem" + qtd + "valores negativos");
		num.close();
	}
}

