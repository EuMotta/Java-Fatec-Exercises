import java.util.Arrays;
import java.util.Scanner;

public class ex04 {
  public static void main(String[] args) {

    Scanner num = new Scanner(System.in);
    System.out.println("insira a primeira nota: ");
    double nota1 = num.nextInt();
    if (nota1 > 10) {
      nota1 = 0;
    }
    System.out.println("insira a segunda nota: ");
    double nota2 = num.nextInt();
    if (nota2 > 10) {
      nota2 = 0;
    }
    System.out.println("insira a terceira nota: ");
    double nota3 = num.nextInt();
    if (nota3 > 10) {
      nota3 = 0;
    }
    double[] mediaAritmetica = medias(nota1, nota2, nota3);
    System.out.println("Média aritmetica: " + mediaAritmetica[0]);
    System.out.println("Maior nota: " + mediaAritmetica[1]);
    System.out.println("Menor nota: " + mediaAritmetica[2]);
    System.out.println("Media maiores notas: " + mediaAritmetica[3]);
    num.close();
  }

  static double[] medias(double nota1, double nota2, double nota3) {
    double mediaMaiores, mediaAritmetica, maiorNota = nota1, menorNota = nota1;
    double arr[] = new double[4];
    mediaAritmetica = (nota1 + nota2 + nota3) / 3.0;
    arr[0] = mediaAritmetica;
    maiorNota = Math.max(Math.max(nota1, nota2), nota3);
    arr[1] = maiorNota;
    menorNota = Math.min(Math.min(nota1, nota2), nota3);
    arr[2] = menorNota;
    double[] notas = { nota1, nota2, nota3 };
    Arrays.sort(notas);
    mediaMaiores = (notas[1] + notas[2]) / 2.0;
    arr[3] = mediaMaiores;
    return arr;
  }
}
