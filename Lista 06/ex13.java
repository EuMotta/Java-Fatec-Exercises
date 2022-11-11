import java.util.Scanner;
//José Antonio Motta
public class ex13 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double valor = 0, soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("insira um numero: ");
            valor = num.nextInt();

            if (valor < 40) {
                soma = soma+valor;
            }
        }
        System.out.println(soma);
    }
}
