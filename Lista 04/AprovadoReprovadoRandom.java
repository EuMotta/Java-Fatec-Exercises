//José Antonio Motta
import java.util.Random;
public class AprovadoReprovadoRandom  {
    public static void main(String[] args) {
        
        Random random = new Random();
        int numa = random.nextInt(10);
        System.out.println("Nota do aluno: " + numa);
        if(numa<6 ){
			System.out.println("REPROVADO");
		}else{
			System.out.println("APROVADO");
		}
    }
}
