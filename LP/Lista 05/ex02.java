import java.util.Scanner;
public class ex02 {
	
	public static void main (String[] args) {
		Scanner valor = new Scanner(System.in);
		System.out.print("insira um valor: ");
		double valornota = valor.nextDouble();
		if(valornota >=0){
			System.out.print("POSITIVO");
		}else{
			System.out.print("NEGATIVO");
		}
	}
}

