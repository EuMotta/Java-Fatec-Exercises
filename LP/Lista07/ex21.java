import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {
        Scanner leiaStr = new Scanner(System.in);
        System.out.println("Frase: ");
        String frase = leiaStr.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' '){
                System.out.println("");
            } else
            System.out.print(frase.charAt(i));
            
        }
    }
}
