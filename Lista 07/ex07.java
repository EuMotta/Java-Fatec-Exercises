import java.util.Scanner;

public class ex07 {
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
                    count++;
                }
            }
            if(count>0){
                System.out.printf("%c = %d\n", letra, count);
            }
            
        }

    }
}
