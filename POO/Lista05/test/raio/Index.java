import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("digite o raio do circulo: ");
    double raio = num.nextDouble();
    Raio r = new Raio(raio);
    double resultado = r.calcularArea();
    System.out.println(resultado);
    num.close();
  }
}