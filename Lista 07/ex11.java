import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner leiaStr = new Scanner(System.in);
        System.out.println("frase:");
        String frase = leiaStr.nextLine();
        int countA = 0,count1 = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z' ){
                countA++;
            }
            if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z' ){
                countA++;
            }
            if(frase.charAt(i) >= '1' && frase.charAt(i) <= '9' ){
                count1++;
            }
        }
        System.out.println(countA);
        System.out.println(count1);
        leiaStr.close();
    }
}
