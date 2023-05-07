import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas em um mês: ");
        int hora = num.nextInt();
        System.out.println("Digite o salário por hora");
        int salario = num.nextInt();
        if (hora > 40) {
            int somat = salario * hora;
            int acr = ((hora * salario) / 100);
            int total = somat + acr;
            System.out.println(total);
        }else{
            int total = salario * hora;
            System.out.println(total);
        }
    }
}
