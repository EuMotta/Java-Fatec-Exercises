import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

    System.out.print("insira o primeiro valor: ");
    calculadora.setNumero1(num.nextInt());
    System.out.print("insira o segundo valor: ");
    calculadora.setNumero2(num.nextInt());

    System.out.println("Soma: " + calculadora.somar() + "\n Subtração: " + calculadora.subtrair() + "\n Divisão:"
        + calculadora.dividir() + "\n Multiplicação: " + calculadora.multiplicar());
  }
}