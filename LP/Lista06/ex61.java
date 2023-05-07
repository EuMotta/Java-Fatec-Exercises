import java.util.Scanner;

public class ex61 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int qntTermos = 0, somaTermos = 0;

        System.out.print("Insira a quantidade de termos: ");
        qntTermos = scan.nextInt();

        for(int i = 1; i <= qntTermos; i++){
            if(i % 2 == 0 && i != qntTermos){
                System.out.print(i + " + ");

            }else if(i % 2 == 0 && i == qntTermos){
                System.out.print(i + "   ");

            }

            somaTermos += i;
        }

        System.out.print("\n");

        for(int i = 1; i <= qntTermos; i++){
            if(i % 2 != 0){
                System.out.print(i + "   ");
    
            }
        }    

        System.out.println("\nSoma dos termos: " + somaTermos);
        scan.close();
    }
}
