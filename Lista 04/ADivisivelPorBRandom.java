//José Antonio Motta
import java.util.Random;
public class ADivisivelPorBRandom {
    public static void main(String[] args) {
		Random valorA = new Random();
		Random valorBa = new Random();
		int A = valorA.nextInt(1000), B = valorBa.nextInt(20);
		System.out.println(A + " , " + B);
		if(A % B == 0){
			System.out.println("E Divisivel");
		}else{
			System.out.println("Não e Divisivel");
		}

    }
}