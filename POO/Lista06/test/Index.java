import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Index {

  private static ProductManager product = new ProductManager();
  List<Product> listaDeProdutos = product.getListaDeProdutos();

  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    Index index = new Index();
    int opcao;
    do {
      System.out.println("Escolha uma opção: ");
      opcao = num.nextInt();
      switch (opcao) {
        /* Adicionar produtos */
        case 1:
          product.addProduct();
          break;
        /* Exibir produtos */
        case 2:
          product.showProducts();
          break;
        case 3:
          product.editProduct();
          break;
        default:
          break;
      }
    } while (opcao != 4);
    num.close();
  }
  
}
