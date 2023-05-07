import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner leiaStr =  new Scanner(System.in);
        System.out.println("Frase: ");
        String frase = leiaStr.nextLine();
        boolean ucase = false;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)>= 'A' && frase.charAt(i) <= 'Z'){
                ucase = true;
            }
        }
        if(ucase == true){
            System.out.println("Existem maiusculas");
        }else{
            System.out.println("Nao existem maiusculas");
        }
    }
}
