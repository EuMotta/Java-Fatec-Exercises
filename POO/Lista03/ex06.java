import java.util.Scanner;

public class ex06 {
  public static int menorValor(int[] valores) {
    int menor = valores[0];
    for (int i = 1; i < valores.length; i++) {
      int valor = valores[i];
      if (valor < menor) {
        menor = valor;
      }
    }
    return menor;
  }

  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int tamanho = 1;
    int[] numeros = new int[tamanho];
    String parar = "";

    do {
      System.out.print("Digite um número inteiro: ");
      int numInserido = num.nextInt();
      numeros[tamanho - 1] = numInserido;
      tamanho++;
      int[] numerosTemp = new int[tamanho];
      for (int i = 0; i < numeros.length; i++) {
        numerosTemp[i] = numeros[i];
      }
      numeros = numerosTemp;

      System.out.print("Deseja informar outro número? (S/N) ");
      parar = num.next();
    } while (parar.equalsIgnoreCase("S"));

    int[] numerosFinais = new int[numeros.length - 1];
    for (int i = 0; i < numerosFinais.length; i++) {
      numerosFinais[i] = numeros[i];
    }
    int menor = menorValor(numerosFinais);
    System.out.printf("O menor valor informado foi %d.\n", menor);
    num.close();
  }
}
