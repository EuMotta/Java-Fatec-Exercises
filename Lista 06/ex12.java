import java.util.Scanner;
//José Antonio Motta
public class ex12 {
    public static void main(String[] args) {
       Scanner num = new Scanner(System.in);
       System.out.println("insira a quantidade de numeros:");
       int qtd = num.nextInt();
        double aux = 0, totalnum = 0;
       for (int i = 0; i < qtd; i++) {
        System.out.println("insira um numero: ");
        aux = num.nextInt();
        totalnum = totalnum + aux;
       }
       System.out.println(totalnum);
    }
}
