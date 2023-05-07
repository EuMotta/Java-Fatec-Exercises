import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) {
        Scanner leiaStr = new Scanner(System.in);
        System.out.println("Frase: ");
        String frase = leiaStr.nextLine();
        int palavras = 1;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' '){
                palavras++;
            }
        }
        System.out.println("quantidade:" + palavras);
    }
}
