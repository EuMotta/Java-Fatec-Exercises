import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
        System.out.println("digite uma frase:");
        String frase1 = frase.next();
        frase1 = frase1.toLowerCase();
        int count = 0;
        for (int i = 0; i < frase1.length(); i++) {
            frase1.toLowerCase().charAt(i);
            if(frase1.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
        frase.close();
    }
}
