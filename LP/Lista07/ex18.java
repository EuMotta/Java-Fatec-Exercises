import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) {
        Scanner leiaStr =  new Scanner(System.in);
        System.out.println("binario: ");
        String valor = leiaStr.nextLine();
        boolean binario = false;
        int count = 0;
        for (int i = 0; i < valor.length(); i++) {
            if(valor.charAt(i) >= '0' && valor.charAt(i) <= '1'){
               count++; 
            }else{
                break;
            }
            
        }
        for (int i = 0; i < valor.length(); i++) {
            if(count == 8){
               binario = true;
            }
        }
        if(binario == true){
            System.out.println("E binario");
        }else{
            System.out.println("Nao e binario");
        }
    }
}
