import java.util.Random;

public class ex08 {
    public static void main(String[] args) {
        int quantidadeJogadas = 1000000;
        int[] frequencias = new int[6];
        for (int i = 1; i <= quantidadeJogadas; i++) {
            int valor = dado();
            frequencias[valor - 1]++;
        }
        for (int i = 0; i < 6; i++) {
            double porcentagem = (double) frequencias[i] / quantidadeJogadas * 100;
            System.out.printf("%d: %.2f%%\n", i + 1, porcentagem);
        }
    }

    private static int dado() {
        Random dado = new Random();
        return dado.nextInt(6) + 1;
    }
}