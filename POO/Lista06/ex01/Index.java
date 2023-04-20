import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();

    System.out.println("Informações da pessoa: ");
    System.out.println("nome: " + pessoa.getNome());
    System.out.println("idade: " + pessoa.getIdade());
    System.out.println("altura: " + pessoa.getAltura());

    String value = "";
    char resultado;
    do {
      System.out.println("A pessoa fez aniversário? S/N? SAIR = X");
      value = num.next().toUpperCase();
      resultado = value.charAt(0);
      if (resultado == 'S') {
        pessoa.fazAniversario(true);
        System.out.println("Idade: " + pessoa.getIdade());
      } else {
        System.out.println("Idade: " + pessoa.getIdade());
      }
    } while (resultado != 'X');
    
  }
}
