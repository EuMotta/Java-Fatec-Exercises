import java.util.Scanner;
//José Antonio Motta = um SACO COMENTAR TUDO
public class ex10 {
    public static void main(String[] args) {
        double media = 0;
        double soma = 0;
        Scanner numero = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um número");
            int num = numero.nextInt();
            soma = soma + num;
        }
        media = soma / 10;
        System.out.println("Média dos numeros: " + media);
        numero.close();
    }
}
