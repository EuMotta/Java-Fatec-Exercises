import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) {
        Scanner leiaStr =  new Scanner(System.in);
        System.out.println("Frase1: ");
        String frase1 = leiaStr.nextLine();
        System.out.println("Frase2: ");
        String frase2 = leiaStr.nextLine();
        boolean iguais = false;
        for (int i = 0; i < frase1.length(); i++) {
            if(frase1.charAt(i) == frase2.charAt(i)){
                iguais = true;
            }else{
                iguais = false;
                break;
            }
        }
        if(iguais == true){
            System.out.println("Sao iguais");
        }else{
            System.out.println("Nao sao iguais");
        }
    }
}
