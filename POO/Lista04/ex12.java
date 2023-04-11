import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro positivo: ");
        int valor = sc.nextInt();

        System.out.println("Numeros perfeitos ate " + valor + ":");
        for (int i = 1; i <= valor; i++) {
            if (perfeito(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    static boolean perfeito(int valor) {
        int somaDivisores = 0;
        for (int i = 1; i <= Math.sqrt(valor); i++) {
            if (valor % i == 0) {
                somaDivisores += i;
                if (i != 1 && i * i != valor) {
                    somaDivisores += valor / i;
                }
            }
        }
        return somaDivisores == valor;
    }
}