import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Insira um numero de linhas: ");
        int qtdLinhas = num.nextInt();
        System.out.print("Insira um numero de colunas: ");
        int qtdColunas = num.nextInt();
        int arr[][] = new int[qtdLinhas][qtdColunas];
        int maiorValor = 0;
        int menorValor = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int valor = (int) (Math.random() * 100);
                arr[i][j] = valor;
                if (i == 0 && j == 0) {
                    maiorValor = arr[i][j];
                    menorValor = arr[i][j];
                }
                if (arr[i][j] > maiorValor) {
                    maiorValor = arr[i][j];
                }
                if (arr[i][j] < menorValor) {
                    menorValor = arr[i][j];
                }
            }
        }
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        num.close();
    }

}
