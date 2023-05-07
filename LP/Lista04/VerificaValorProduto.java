//José Antonio Motta
import java.util.Scanner;
public class VerificaValorProduto {
    public static void main(String[] args) {
		Scanner prod1 = new Scanner(System.in);
		System.out.print("Valor do primeiro produto: ");
		int prod1v = prod1.nextInt();
		System.out.println();
		Scanner prod2 = new Scanner(System.in);
		System.out.print("Valor Segundo produto: ");
		int prod2v = prod2.nextInt();
		if(prod1v>1000 || prod1v<1 || prod2v > 1000 || prod2v<1){
			System.out.println("VALOR INVALIDO");
		}else if(prod1v > prod2v){
			System.out.println("Produto 1 mais caro");
		}else{
			System.out.println("Produto 2 mais caro");
		}

		
    }
}