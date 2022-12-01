import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("insira o tamanho do vetor até 20: ");  
        int[] vetor = new int[5], vetorpares = new int[5];
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("insira o " + (i+1) + " valor: ");
            vetor[i] = num.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                vetorpares[i] = vetor[i];
            }
        }
        for (int i = 0; i < vetorpares.length; i++) {
            if(vetorpares[i] != 0){
                System.out.print(vetorpares[i]);
            }
            
        }
        
    }
}
