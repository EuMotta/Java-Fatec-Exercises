import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner leiaStr = new Scanner(System.in);
        System.out.print("Frase:");
        String frase = leiaStr.nextLine();
        boolean vf = false;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) >= '0' && frase.charAt(i) <= '9'){
                vf = true;
            }  
        }
        if (vf == true) {
            System.out.println("existem numeros.");
        }else{
            System.out.println("nao existem numeros.");
        }
    }
}
