//José Antonio Motta
import java.util.Scanner;
public class AprovadoReprovado {
    public static void main(String[] args) {
		Scanner notascan = new Scanner(System.in);
		System.out.print("Digite a nota do Aluno: ");
		double nota = notascan.nextDouble();
		if(nota <6){
			System.out.println("REPROVADO");
		}else{
			System.out.println("APROVADO");
		}
		
    }
}
