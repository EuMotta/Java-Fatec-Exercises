import java.util.List;
import java.util.Scanner;

public class Admin {
  
  private static ProductManager product = new ProductManager();
  List<Product> listaDeProdutos = product.getListaDeProdutos();

  private void admin() {
    Scanner num = new Scanner(System.in);
    int opcao;
    do {
      System.out.println("Escolha uma opção: ");
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
