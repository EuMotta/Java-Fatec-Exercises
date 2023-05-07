import java.util.Scanner;

public class ex48 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int qntDivisores = 0, qntPrimos = 0;

        System.out.print("Insira a quantidade de numeros: ");
        int qntTermos = scan.nextInt();

        do{
            for(int i = 1; i <= qntTermos; i++){
                if(qntTermos % i == 0){
                    qntDivisores++;

                }
            }

            if(qntDivisores == 2){
                System.out.println(qntTermos + " e primo");
                qntPrimos++;
            }
            
        }while(qntPrimos != qntTermos);
        scan.close();
    }
}
