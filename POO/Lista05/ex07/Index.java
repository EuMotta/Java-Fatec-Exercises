import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int preco = 0;
    Computador computador = new Computador();
    int value = 0;

    int[] placaMaePreco = {800};
    do {
      System.out.println("Escolha a placa-mãe: \n 1 - Placa-mãe: R$800 \n");
      value = num.nextInt();
      if (value >= 1 && value <= placaMaePreco.length) {
        preco = placaMaePreco[value-1];
      } else {
        System.out.println("Opção inválida. \n");
      }
    } while (value != 1);
    computador.setPlacaMae(preco);

    int[] processadorPreco = {700, 830, 910};
    do {
      System.out.println("Escolha o processador: \n 1 - 600Mhz a R$700 \n 2 - 1800Mhz a R$830 \n 3 - 1900Mhz a R$910\n");
      value = num.nextInt();
      if (value >= 1 && value <= processadorPreco.length) {
        preco = processadorPreco[value-1];
      } else {
        System.out.println("Opção inválida. \n");
      }
    } while (value <= 0 || value > 3);
    computador.setProcessador(preco);

    int[] memoriaPreco = {350, 350*2, 350*4, 350*6, 350*8};
    do {
      System.out.println("Escolha a memoria ( cada 1gb 350 reais ): \n 1 - 1GB \n 2 - 2GB \n 3 - 4GB\n 4 - 6GB\n 5 - 8GB\n");
      value = num.nextInt();

      if (value >= 1 && value <= memoriaPreco.length) {
        preco = memoriaPreco[value-1];
      } else {
        System.out.println("Opção inválida. \n");
      }
    } while (value <= 0 || value > 8);
    computador.setMemoria(preco);

    int[] discoPreco = {300, 420, 500};
    do {
      System.out.println("Escolha o HD: \n 1 - 500 GB a R$300\n 2 - 1TB a R$420 \n 3 - 2TB a R$500 ");
      value = num.nextInt();
      if (value >= 1 && value <= discoPreco.length) {
        preco = discoPreco[value-1];
      } else {
        System.out.println("Opção inválida. \n");
      }
    } while (value <= 0 || value > 3);
    computador.setDiscoRigido(preco);

    computador.calcularValor();
    System.out.println(computador.calcularValor());
  }
}
