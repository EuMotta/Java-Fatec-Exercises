import java.util.Scanner;

public class ex23 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      int i;
      String nome, sobrenome = "";

      System.out.printf("Informe o nome de uma pessoa:\n");
      nome = ler.nextLine();

      i = nome.length()-1; // posicao do ultimo caractere do nome
    // para no primeiro caractere antes do sobrenome
      while ((i >= 0) &&  (nome.charAt(i) != ' ')) {
        i = i - 1;
      }

      sobrenome = sobrenome + nome.substring(i+1, nome.length());
      
      System.out.printf("\nResultado (sobrenome da pessoa):\n");
      System.out.printf("%s\n", sobrenome);
    }

}

