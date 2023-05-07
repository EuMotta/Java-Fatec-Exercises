import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("insira a qtd de mercadorias: ");
        int qtd = num.nextInt();
        int merc = 0;
        int total = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.print("insira o valor da mercadoria: ");
            merc = num.nextInt();
             total += merc;
        }
        System.out.println(total);
        num.close();
    }
}