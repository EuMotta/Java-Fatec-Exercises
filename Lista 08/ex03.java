import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("insira o tamanho do vetor até 20: ");  
        int vetortamanho = num.nextInt();
        do {
         
          if(vetortamanho > 20 || vetortamanho< 1){
            System.out.println("insira um tamanho valido: ");
            vetortamanho = num.nextInt();
          }
        } while (vetortamanho > 20 || vetortamanho< 1);
        int[] vetor = new int[vetortamanho];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("insira o " + (i+1) + " valor: ");
            vetor[i] = num.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
        }
        
    }
}
