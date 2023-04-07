import java.util.Scanner;

public class ex46 {
    public static void main(String[] args) throws Exception {
        Scanner scan =  new Scanner(System.in);

        int num = 0, contagemDivisores = 0;

        System.out.print("Insira algum valor: ");
        num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                contagemDivisores++;

            }
        }

        if(contagemDivisores == 2){
            System.out.println("O numero " + num + " e primo");
        }else{
            System.out.println("O numero " + num + " nao e primo");
        }
        scan.close();
    }
}
