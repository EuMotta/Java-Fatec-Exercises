import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ex14 {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("insira a quantidade de valores: ");
    int qtd = num.nextInt();
    int[] arr = new int[qtd];
    
    for (int i = 0; i < qtd; i++) {
      System.out.print("Insira o " + (i + 1) + "o valor: ");
      arr[i] = num.nextInt();
    }
    int[] arrInvertido = inverter(arr);
    
    System.out.println("Array original: " + Arrays.toString(arr));
    System.out.println("Array invertido: " + Arrays.toString(arrInvertido));
  }

  static int[] inverter(int arr[]) {
    Integer[] arrInvertido = Arrays.stream(arr)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .toArray(Integer[]::new);

    int[] arrInvertidoPrimitivo = Arrays.stream(arrInvertido)
        .mapToInt(Integer::intValue)
        .toArray();

    return arrInvertidoPrimitivo;
  }
}
