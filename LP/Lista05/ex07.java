import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        double n1 = num.nextDouble();
        System.out.print("Insira o primeiro valor: ");
        double n2 = num.nextDouble();
        if(n1>n2){
            System.out.println(n2 + "," + n1);
        }else{
            System.out.println(n1 + "," + n2);
        }

    }
}
