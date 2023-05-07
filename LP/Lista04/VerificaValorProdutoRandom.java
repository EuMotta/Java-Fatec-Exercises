//José Antonio Motta
import java.util.Random;
public class VerificaValorProdutoRandom {
    public static void main(String[] args) {
		Random prod1 = new Random();
		Random prod2 = new Random();
		int prod1preco = prod1.nextInt(1000),prod2preco = prod2.nextInt(1000);
		System.out.print(prod1preco + " , " + prod2preco);
		if(prod1preco<prod2preco){
			System.out.println("O produto 1 e mais caro");
		}else if(prod1preco==prod2preco){
			System.out.println("Os produtos tem preços iguais");
		}else{
			System.out.println("O produto 2 e mais caro");
		}
		
    }
}

