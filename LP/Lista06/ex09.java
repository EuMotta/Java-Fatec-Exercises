import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        int qtdd = 0, qtdf = 0;
        Scanner num = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
          System.out.println("Digite um número: ");  
          int numdigitado = num.nextInt();
          if (numdigitado >= 10 && numdigitado <=20) {
            qtdd++;
          }else{
            qtdf++;
          }
        }
        System.out.println("entre 10 e 20: " + qtdd);
        System.out.println("Quatidade fora: " + qtdf);
        num.close();
        
    }
}
