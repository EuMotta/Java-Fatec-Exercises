import java.util.List;
import java.util.Scanner;

public class Admin {
  
  private static ProductManager product = new ProductManager();
  List<Product> listaDeProdutos = product.getListaDeProdutos();

  private void admin() {
    Scanner num = new Scanner(System.in);
    int opcao;
    do {
      System.out.println("O que deseja fazer? ");
      System.out.println("1 - Adicionar produto ");
      System.out.println("2 - Visualizar produtos ");
      System.out.println("3 - Editar produto ");
      System.out.println("4 - Deletar produto ");
      System.out.println("5 - Sair ");
      opcao = num.nextInt();
      switch (opcao) {
        case 1:
          product.addProduct();
          break;
        case 2:
          product.showProducts();
          break;
        case 3:
          product.editProduct();
          break;
        case 4:
        product.deleteProduct();
        default:
          break;
      }
    } while (opcao != 5);
  }
  public void showAdmin(){
    this.admin();
  }

}
