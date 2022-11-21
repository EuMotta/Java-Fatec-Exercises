import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int valor = 0, maior = 0, menor = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("insira um valor");
            valor = num.nextInt();
            if (i == 0) {
                maior = valor;
                menor = valor;
            }
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
        System.out.println(maior + "" + menor);
        num.close();
    }
}
