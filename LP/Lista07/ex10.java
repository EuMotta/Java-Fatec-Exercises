import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner leiaStr = new Scanner ( System.in );
        System.out.println("frase:");
        String frase = leiaStr.nextLine();
        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
                count++;
            }
        }
        System.out.println(count);
        leiaStr.close();
    }
}
