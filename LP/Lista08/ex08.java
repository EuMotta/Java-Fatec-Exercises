import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("insira o tamanho do vetor até 20: ");  
        int[] vetor = new int[5];
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("insira o " + (i+1) + " valor: ");
            vetor[i] = num.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 != 0){
                soma+=vetor[i];
            }
        }
        System.out.println(soma);
        
    }
}
