import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner leiaStr = new Scanner(System.in);
        System.out.print("frase:");
        String frase = leiaStr.nextLine();
        
        String letra = leiaStr.nextLine();
        char letraChar = letra.charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == letraChar){
                System.out.print(frase.replace(letraChar, '*'));
            }
            
        }
        leiaStr.close();
    }
}