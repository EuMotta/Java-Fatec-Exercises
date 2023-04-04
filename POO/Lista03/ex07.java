import java.util.Scanner;

public class ex07 {
  public static void main(String[] args) {

    System.out.println("O dado caiu em: " + dado());

  }

  static int dado() {
    Scanner valor = new Scanner(System.in);
    String jogar;
    int dados = 0;
    do {
      System.out.println("Deseja jogar o dado? (s/n)");
      jogar = valor.next();
      if (jogar.equals("s")) {
        dados = (int) (Math.random() * (6) + 1);
        System.out.println("O dado caiu em: " + dados);
      }
    } while (jogar.equals("s"));
    valor.close();
    return dados;
  }
}
