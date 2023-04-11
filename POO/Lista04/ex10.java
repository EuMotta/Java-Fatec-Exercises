import java.util.Scanner;

public class ex10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a quantidade de números: ");
    int n = sc.nextInt(); 
    int[] numeros = new int[n];
    for (int i = 0; i < n; i++) { 
      System.out.print("Digite o " + (i + 1) + "º número: ");
      numeros[i] = sc.nextInt(); 
    }

    int resto, a = numeros[0], b;
    for (int i = 1; i < n; i++) {
      b = numeros[i]; 
      do {
        resto = a % b; 
        a = b; 
        b = resto;
      } while (resto != 0); 
    }

    System.out.println("O MDC dos números é: " + a);

    int produto = 1; 
    for (int i = 0; i < n; i++) { 
      produto *= numeros[i];
    }
    int MMC = produto / a; 

    System.out.println("O MMC dos números é: " + MMC);

    System.out.print("O MMC dos números decomposto em fatores primos é: ");
    int divisor = 2; 
    while (MMC > 1) { 
      if (MMC % divisor == 0) { 
        System.out.print(divisor + " "); 
        MMC /= divisor; 
      } else { 
        divisor++; 
      }
    }
    System.out.println(); 

    sc.close();
  }
}