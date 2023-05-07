import java.util.Scanner;
public class ex03 {
	
	public static void main (String[] args) {
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite a quantidade");
		int quantidade = valor.nextInt();
		
		if(quantidade < 12){
			double valormaca = 1.30;
			double total = valormaca * quantidade;
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor gasto: " + total);
		}else{
			double valormaca = 1.00;
			double total = valormaca * quantidade;
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Valor gasto: " + total);
		}
	}
}

