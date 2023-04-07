import java.util.Scanner;

public class ex23 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("digite o tamanho da coluna da matriz:");
    int tamLinhas = num.nextInt();
    System.out.println("digite o tamanho da linhas da matriz:");
    int tamColunas = num.nextInt();

    int qtdPrimos = tamLinhas * tamColunas;
    int arr[][] = new int[tamLinhas][tamColunas];
    int numero = 2; 
    int contador = 0; 

    while (contador < qtdPrimos) {
      boolean primo = true;

      for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
          primo = false;
          break;
        }
      }

      if (primo) {
        arr[contador / tamColunas][contador % tamColunas] = numero; 
        contador++;
      }

      numero++;
    }
    for (int i = 0; i < tamLinhas; i++) {
      for (int j = 0; j < tamColunas; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    num.close();
  }
}
