import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Digite a quantidade de valores: ");
    int qtd = num.nextInt();
    double arr[] = new double[qtd];
    for (int i = 0; i < arr.length; i++) {
      System.out.print("Digite o " + (i+1) + " valor: ");
      arr[i] = num.nextDouble();
    }
    double resultado = Media.media(arr);
    System.out.println(resultado);
  }
}
