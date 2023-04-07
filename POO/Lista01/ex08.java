import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Insira um numero de linhas: ");
        int qtdLinhas = num.nextInt();
        System.out.print("Insira um numero de colunas: ");
        int qtdColunas = num.nextInt();
        int arr[][] = new int[qtdLinhas][qtdColunas], arrPar[] = new int[qtdLinhas * qtdColunas],
                arrImpar[] = new int[qtdLinhas * qtdColunas];
        int contadorPar = 0, contadorImpar = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int valor = (int) (Math.random() * 100);
                arr[i][j] = valor;
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] % 2 == 0) {
                    arrPar[contadorPar] = arr[i][j];
                    contadorPar++;
                } else {
                    arrImpar[contadorImpar] = arr[i][j];
                    contadorImpar++;
                }
            }
            System.out.println();
        }
        System.out.println("Numeros pares: ");
        for (int i = 0; i < contadorPar; i++) {
            System.out.print(arrPar[i] + " ");
        }
        System.out.println();
        System.out.println("Numeros impares: ");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.print(arrImpar[i] + " ");
        }
        num.close();
    }
}
