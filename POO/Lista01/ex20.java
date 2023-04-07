import java.util.Scanner;

public class ex20 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Digite o tamanho da matriz: ");
    int tam = num.nextInt();
    int arr[][] = new int[tam][tam];
    System.out.println("arr:");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int) (Math.random() * 50);
        System.out.print(arr[i][j] < 10 ? "0" + arr[i][j] + " " : arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Asa da borboleta:");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (i >= j && (i + j) <= (tam - 1) || i <= j && (i + j) >= (tam - 1)) {
          System.out.print(arr[i][j] < 10 ? "0" + arr[i][j] + " " : arr[i][j] + " ");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println();
    }
    num.close();
  }
}
