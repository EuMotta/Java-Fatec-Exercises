import java.util.Scanner;
public class OiTchau {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite 1 para Oi e 2 para Tchau");
        int a = num.nextInt();
        if(a != 1 && a != 2){
            System.out.println("Escolha 1 ou 2");
        }
        else{
            if(a == 1){
                System.out.println("Oi");
            }else{
                System.out.println("Tchau");
            }
        }
        num.close();
    }
}
