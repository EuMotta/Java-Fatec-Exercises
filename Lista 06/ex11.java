import java.util.Scanner;
//José Antonio Motta
public class ex11 {
    public static void main(String[] args) {
       Scanner num = new Scanner(System.in);
       System.out.println("insira a quantidade de alunos:");
       int qtdAlunos = num.nextInt();
        double nota = 0, totalnota = 0;
       for (int i = 1; i <= qtdAlunos; i++) {
        System.out.println("insira a nota do " + i  + " Aluno:");
        nota = num.nextDouble();
        totalnota = totalnota + nota;
       }
       double totalAritmetica = totalnota / qtdAlunos;
       System.out.println(totalAritmetica);
    }
}
