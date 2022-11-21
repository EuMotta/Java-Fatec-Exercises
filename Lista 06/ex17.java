import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String rep = "";
        boolean loop = false;
        do {
            System.out.print("insira o primeiro valor: ");
            int n1 = num.nextInt();
            System.out.print("insira o primeiro valor: ");
            int n2 = num.nextInt();
            int nota =( n1 + n2) / 2;
            System.out.println(nota);
            System.out.println("repetir processo?");
            rep = num.next();
            if(rep == "S"){
                loop = true;
            }
            if(rep == "N"){
                loop = false;
            }
        } while (loop == true);
        num.close();

    }
}