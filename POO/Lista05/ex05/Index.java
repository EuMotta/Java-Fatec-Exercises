import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Equacao2Grau equacao = new Equacao2Grau();
    Scanner num = new Scanner(System.in);
    System.out.print("insira o valor de a:");
    double a = num.nextDouble();
    System.out.print("insira o valor de b:");
    double b = num.nextDouble();
    System.out.print("insira o valor de c:");
    double c = num.nextDouble();

    equacao.setA(a);
    equacao.setB(b);
    equacao.setC(c);

    equacao.calculaDelta();

    System.out.println("Delta = " + equacao.getDelta());
  }
}
