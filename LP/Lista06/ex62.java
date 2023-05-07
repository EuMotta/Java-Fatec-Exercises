import java.util.Scanner;

public class ex62 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int qntTermos = 0, soma = 0;

        System.out.print("Insira a quantidade de termos: ");
        qntTermos = scan.nextInt();

        for(int i = 1; i <= qntTermos; i++){
            if(i % 2 == 0){
                if(i % 4 != 0){
                    if(i != qntTermos){
                        System.out.print(i + " - ");

                    }else if(i == qntTermos){
                        System.out.print(i + "   ");

                    }
                }else if(i % 4 == 0){
                    if(i != qntTermos){
                        System.out.print(i + " + ");

                    }else if(i == qntTermos){
                        System.out.print(i + "   ");

                    }
                }
            }

            soma += i;

        }

        System.out.print("\n");

        for(int i = 1; i <= qntTermos; i++){
            if(i % 2 != 0 && i != 9){
                System.out.print(i + "   ");

            }if(i % 2 != 0 && i == 9){
                System.out.print(i + "    ");

            }
        }

        System.out.print("\nSoma: " + soma);
        scan.close();
    }
}
