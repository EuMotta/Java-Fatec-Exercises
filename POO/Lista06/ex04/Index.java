import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    Numero numero = new Numero();
    numero.setNumero(num.nextInt());

    System.out.println(numero.inverter());
  }
}
