import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    Scanner pagarGarcom = new Scanner(System.in);
    System.out.print("Digite a quantidade de pessoas: ");
    int qtd = num.nextInt();
    System.out.print("Digite o valor da conta: ");
    int valor = num.nextInt();
    System.out.print("10% do garçom? S/N: ");
    char garcomChar = pagarGarcom.next().charAt(0);
    boolean garcom = garcomChar == 'S' || garcomChar == 's';
    
    Pessoa pessoa = new Pessoa();
    pessoa.setQuantidade(qtd);
    pessoa.setValor(valor);
    pessoa.setGarcom(garcom);
    
    double resultado = pessoa.pagarConta(garcom, valor, qtd);
    System.out.printf("Cada pessoa deve pagar R$%.2f", resultado);
    num.close();
    pagarGarcom.close();
  }
}
