import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Insira um numero de linhas: ");
        int qtdLinhas = num.nextInt();
        System.out.print("Insira um numero de colunas: ");
        int qtdColunas = num.nextInt();
        int arr[][] = new int[qtdLinhas][qtdColunas];
        int maiorvalor = 0;
        int menorvalor = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int valor = (int) (Math.random() * 100);
                arr[i][j] = valor;
                if (i == 0 && j == 0) {
                    maiorvalor = arr[i][j];
                    menorvalor = arr[i][j];
                }
                if (arr[i][j] > maiorvalor) {
                    maiorvalor = arr[i][j];
                }
                if (arr[i][j] < menorvalor) {
                    menorvalor = arr[i][j];
                }
            }
        }
        System.out.println("Maior valor: " + maiorvalor);
        System.out.println("Menor valor: " + menorvalor);
        num.close();
    }
    
}
