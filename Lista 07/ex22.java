import java.util.Scanner;
public class ex22 {
    public static void main(String[] args) {
        Scanner leiaStr = new Scanner(System.in);
        System.out.println("Frase: ");
        String frase = leiaStr.nextLine();
        System.out.println("palavra: ");
        String palavra = leiaStr.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == palavra.charAt(i)){
                System.out.print(frase.charAt(i));
            }
        }
    }
}
