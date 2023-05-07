import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner leiaStr = new Scanner(System.in);
        System.out.print("frase:");
        String frase = leiaStr.nextLine().toUpperCase();
        leiaStr.close();
        int count;
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            count = 0;
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == letra) {
                    if (frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I'
                            || frase.charAt(i) == 'O' || frase.charAt(i) == 'U') {
                        count++;
                    }

                }
            }
            if (count > 0) {
                System.out.printf("%c = %d\n", letra, count);
            }

        }

    }
}
