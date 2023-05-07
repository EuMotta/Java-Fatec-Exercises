import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("insira o primeiro valor: ");
        int v1 = num.nextInt();
        System.out.print("insira o segundo valor: ");
        int v2 = num.nextInt();
        int aux = 0;
        if(v1 > v2){
            aux = v1;
            v1 = v2;
            v2 = aux;
        }
        System.out.println(v1+""+v2);
        for (int i = v1; i < v2+1; i++) {
            System.out.println(i);
        }
        num.close();
    }
}
