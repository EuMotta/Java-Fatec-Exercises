import java.util.Scanner;
public class ex06 {
	
	public static void main (String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print(" Digite a quantidade de linhas: ");
		int qtdLinhas = num.nextInt();
		System.out.print(" Digite a quantidade de colunas: ");
		int qtdColunas = num.nextInt();
		
		while (qtdLinhas >=25 || qtdLinhas <=0 || qtdColunas >=25 || qtdColunas <=0)
		{
			System.out.print(" Digite a quantidade de linhas até 25:");
			qtdLinhas = num.nextInt();
			System.out.print(" Digite a quantidade de colunas até 25");
			qtdColunas = num.nextInt();
		}
		
		System.out.print(" Digite um numero para verificar: ");
		int numVerifica = num.nextInt();
		int[][] arr = new int[qtdLinhas][qtdColunas];
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				int valor = (int) (Math.random() * 10);
				arr[i][j] = valor;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				if (arr[i][j] == numVerifica)
				{
					System.out.println("o numero existe na linha " + (i+1) + " e coluna " + (j+1));
				}
			}
		}
		num.close();
	}
}

