import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("insira o tamanho do vetor até 20: ");
        int vetortamanho = num.nextInt();
        do {

            if (vetortamanho > 20 || vetortamanho < 1) {
                System.out.println("insira um tamanho valido: ");
                vetortamanho = num.nextInt();
            }
        } while (vetortamanho > 20 || vetortamanho < 1);
        int[] vetor1 = new int[vetortamanho], vetor2 = new int[vetortamanho], vetorsoma = new int[vetortamanho];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("insira o " + (i + 1) + " valor do vetor 1: ");
            vetor1[i] = num.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("insira o " + (i + 1) + " valor do vetor 2: ");
            vetor2[i] = num.nextInt();
        }
        for (int i = 0; i < vetorsoma.length; i++) {
            vetorsoma[i] = vetor1[i] + vetor2[i];
            System.out.print(vetorsoma[i] + " ");
        }

    }
}
