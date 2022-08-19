//José Antonio Motta
import java.util.Scanner;
public class ADivisivelPorB {
    public static void main(String[] args) {
		Scanner valorA = new Scanner(System.in);
		System.out.println("Valor de A");
		int A = valorA.nextInt();
		Scanner valorBa = new Scanner(System.in);
		System.out.println("Valor de B");
		int B = valorBa.nextInt();
		if(A < 1 || A > 1000 || B < 1 || B > 1000){
			System.out.println("INVALIDO");
			}else if(A % B == 0){
				System.out.println("Divisivel");
			}else{
				System.out.println("Nao Divisivel");
			}
    }
}